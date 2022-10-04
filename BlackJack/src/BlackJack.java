import java.util.Scanner;

public class BlackJack {

    public static int score = 0;

    public static void main(String[] args) {
        ask();

    }


 // Asks for whether the user wants to play
    public static void ask() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("----- [PLAY BLACKJACK.] [yes/no] -----");
        String userAnswer = scannerObject.nextLine();
        String yes = "yes";
        String no = "no";
        if (userAnswer.toLowerCase().equals(yes)) {
            try {
                loadingBar.bar();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("[GAME INITIALIZED]");
            play();


        } else if (userAnswer.toLowerCase().equals(no)) {
            System.out.println("see you next time...");
        } else {
            System.out.println("[SYNTAX ERROR. PLEASE TRY AGAIN.]");
            ask();

        }
    }

    public static void play() {
        Dealer.initialize();
    }


}



