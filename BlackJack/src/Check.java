import java.util.Scanner;


public class Check {

    public static void lose() {
        reset.resetFunc();
        System.out.println("[YOU LOSE!/BUST!]");
        playAgain.play();
    }
    public static void draw() {
        reset.resetFunc();
        System.out.println("[DRAW!]");
        playAgain.play();
    }
    public static void win(){
        reset.resetFunc();
        System.out.println("[YOU WIN!]");
        playAgain.play();

    }
    public static void playerCheck() {
        if ((Dealer.userHand > 21) && (Dealer.opponentHand > 21)) {
            lose();

        }
    }
    public static void dealerCheck() {
        if ((Dealer.opponentHand > 21) && (Dealer.userHand > 21)) {
            draw();

        }
        else if (Dealer.opponentHand > 21) {
                System.out.println("[DEALER BUST]");
                win();
            } else if (Dealer.opponentHand == 21) {
                if (Dealer.userHand == 21) {
                    System.out.println("[DRAW]");

                }
            }
        }
    }
}
