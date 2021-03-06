package tweetcod2015;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author aFerreiraDominguez
 */
public class Metodos {

    ConfigurationBuilder cb = new ConfigurationBuilder();
    Twitter twitter;

    /**
     * Aqui se introducen los codigos proporcionados en dev.twitter.com
     */
    public Metodos() {
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("CnsumerKey")
                .setOAuthConsumerSecret("ConsumerSecret")
                .setOAuthAccessToken("AccessToken")
                .setOAuthAccessTokenSecret("AccessTokenSecret");
        twitter = new TwitterFactory(cb.build()).getInstance();
    }

    /**
     * Muestra timeLine
     */
    public void timeLine() {
        try {
            List<Status> statuses = twitter.getHomeTimeline();
            System.out.println("Showing home timeline.");
            for (Status status : statuses) {
                System.out.println(status.getUser().getName() + ":"
                        + status.getText());
            }
        } catch (TwitterException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Busca tweets con el texto introducido
     */
    public void buscar() {
        try {
            String preg = JOptionPane.showInputDialog("Buscar:");
            Query query = new Query(preg);
            QueryResult result = twitter.search(query);
            for (Status status : result.getTweets()) {
                System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }
        } catch (TwitterException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Crea y publica un tweet
     */
    public void tweet() {
        try {
            String twet = JOptionPane.showInputDialog("Tweett:");
            Status status = twitter.updateStatus(twet);
            System.out.println("Successfully updated the status to [" + status.getText() + "].");
        } catch (TwitterException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Manda mensaje directo 
     * @throws TwitterException
     */
    public void directMsg() throws TwitterException {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String msg = JOptionPane.showInputDialog("Mensaje:");
        DirectMessage message = twitter.sendDirectMessage(nombre, msg);
        System.out.println("Sent: " + message.getText() + " to @" + message.getRecipientScreenName());
    }
}
