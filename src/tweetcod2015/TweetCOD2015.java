package tweetcod2015;

import javax.swing.JOptionPane;

import twitter4j.TwitterException;


public class TweetCOD2015 {

    public static void main(String[] args) throws TwitterException {
// TODO code application logic here
Metodos twit = new Metodos();
int op;
do {
op = Integer.parseInt(JOptionPane.showInputDialog("opciones: \n1 --> TimeLine\n2 --> Buscar\n3 --> Tweettear\n4 --> Exit"));
switch (op) {
case 1:
twit.timeLine();
break;
case 2:
twit.buscar();
break;
case 3:
twit.tweet();
break;
case 4:
System.exit(0);
default:
System.exit(0);
}
} while (op != 0 && op != 4);
}
        

}