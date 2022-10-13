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

    //checks while the drawing process whether the player or dealer has busted
    public static void bust() {
        if ((Dealer.userHand > 21) && (Dealer.opponentHand > 21)) {
            System.out.println("[BOTH PLAYERS BUST.]");
            draw();
        }
        else if (Dealer.opponentHand > 21) {
            System.out.println("[DEALER BUST.]");
            win();
        }
        else if (Dealer.userHand > 21) {
            System.out.println("[BUST!]");
            lose();
        }
        else {
            System.out.print("");
        }

    }
    public static void winLose(){
        if (BlackJack.hit().userAnswer.equals("stand")) && ()
    }
}
