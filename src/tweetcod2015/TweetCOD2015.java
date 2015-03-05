package tweetcod2015;

import javax.swing.JOptionPane;
import twitter4j.DirectMessage;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TweetCOD2015 {

    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("d4ZLnromJ6t3192RLDTGIlAqt")
                .setOAuthConsumerSecret("F6Ouctu4HiYSAouDRrIX7T8POlxYg33W8cgDK9hRn9V6OBqMN1")
                .setOAuthAccessToken("714352070-MQTk2JtlQ5ft6ZAWuIO2cezy1Rj9p9Dp3LZ6Smz1")
                .setOAuthAccessTokenSecret("sXZ9RxKBoWev2g12mrsOPnAf4yNweoPatCSHcr6Hrrjym");
        /**
         * Escribir tweet Twitter twitter = new
         * TwitterFactory(cb.build()).getInstance();
         *
         * String tweet=JOptionPane.showInputDialog(null, "Escribe tu tweet",
         * "Inserta 140 caracteres", JOptionPane.QUESTION_MESSAGE); Status
         * status = twitter.updateStatus(tweet); System.out.println("Success" +
         * status.getText());
    }*
         */
        /**mandar mensaje directo yusuke code
             if (args.length < 2) {
            System.out.println("Usage: java twitter4j.examples.directmessage.SendDirectMessage [recipient screen name] [message]");
            System.exit(-1);
        }
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            DirectMessage message = twitter.sendDirectMessage(args[0], args[1]);
            System.out.println("Direct message successfully sent to " + message.getRecipientScreenName());
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to send a direct message: " + te.getMessage());
            System.exit(-1);
        }

    }**/
}
}