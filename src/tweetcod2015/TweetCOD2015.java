package tweetcod2015;

import javax.swing.JOptionPane;

import twitter4j.TwitterException;

public class TweetCOD2015 {

    public static void main(String[] args) throws TwitterException {
        /**
         * instancia objeto tipo Metodos()
         * Ventana para acceder a metodos
         */
        Metodos tweet = new Metodos();
        int option = JOptionPane.showOptionDialog(null, "selecciona opcion", "menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Mostrar TimeLine", "Buscar en Twitter", "Publica un tweet", "Mandar mensaje a: ", "Salir"}, "Salir");
        if (option == 0) {
            tweet.timeLine();
        }
        if (option == 1) {
            tweet.buscar();
        }
        if (option == 2) {
            tweet.tweet();
        }
        if (option == 3) {
            tweet.directMsg();
        } else if (option != 0 && option != 1 && option != 2 && option != 3) {
            System.exit(0);
        }

    }

}
