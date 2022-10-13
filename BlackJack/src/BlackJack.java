//Blackjack
//Create a blackjack game that simulates one player playing against the dealer.
//The player should first receive two cards, then they can decide whether they want to “stand” or “hit”.
//In order to win, the player must have cards that add up closer to 21 than the dealer’s cards, without going over 21. Remember that it’s up to the player if an ace is worth 1 or 11.
//Your program must correctly keep track of which cards in the deck have been used and not allow the same card to be played again in the same round.
//Your program should handle invalid input from the user and display error messages where appropriate.


import java.util.Scanner;

public class BlackJack {

    public static int score = 0;
    public static boolean stand = true;

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
//            try {
//                loadingBar.bar();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
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
        reset.copy();

        if (Dealer.userHandCards.size() < 2) {
            Dealer.suit();
        }
        Opponent.opponentDraw();
        hit();

    }
    public static void hit(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("----- [DRAW A CARD?] [hit/stand] -----");
        String userAnswer = scannerObject.nextLine();
        String hit = "hit";
        String stand = "stand";
        if (userAnswer.toLowerCase().equals(hit)){
            Opponent.opponentDraw();
            System.out.println();
            Dealer.suit();
            hit();
                ask();

        }
        else if (userAnswer.toLowerCase().equals(stand)){
            Check.bust();
            Opponent.opponentDraw();
            System.out.println();
        }
        else {
            System.out.println("[SYNTAX ERROR. PLEASE TRY AGAIN.]");
            hit();
        }
    }


}



