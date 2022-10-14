//Blackjack
//Create a blackjack game that simulates one player playing against the dealer.
//The player should first receive two cards, then they can decide whether they want to “stand” or “hit”.
//In order to win, the player must have cards that add up closer to 21 than the dealer’s cards, without going over 21. Remember that it’s up to the player if an ace is worth 1 or 11.
//Your program must correctly keep track of which cards in the deck have been used and not allow the same card to be played again in the same round.
//Your program should handle invalid input from the user and display error messages where appropriate.


import java.util.Scanner;

public class BlackJack {

    //keeps track of the Player's scores and whether the players stand or not
    public static int score = 0;
    public static boolean isPlayerStand = false;
    public static boolean isDealerStand = false;

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
        if (userAnswer.toLowerCase().trim().equals(yes)) {
            try {
                loadingBar.bar();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("---- [GAME INITIALIZED. SCORE: " + score + "]");
            play();


        } else if (userAnswer.toLowerCase().trim().equals(no)) {
            System.out.println("see you next time...");
        } else {
            System.out.println("[SYNTAX ERROR. PLEASE TRY AGAIN.]");
            ask();

        }
    }

    //starts the game, copy saves a clean copy of all the arrays and variables to load later, and initialize prepares the deck + starts the game
    public static void play() {
        Dealer.initialize();
        reset.copy();


        if (Dealer.userHandCards.size() < 2) {
            Dealer.suit();
        }
        Opponent.opponentDraw();
        hit();

    }

    // allows the player to draw another card or stand
    public static void hit(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("----- [DRAW A CARD?] [hit/stand] -----");
        String userAnswer = scannerObject.nextLine();
        String hit = "hit";
        String stand = "stand";


        if (userAnswer.toLowerCase().trim().equals(hit)){
            Dealer.suit();
            Opponent.opponentDraw();
            System.out.println();
            Check.winLose();
            hit();

        }
        else if (userAnswer.toLowerCase().trim().equals(stand)){
            Check.bust();
            isPlayerStand = true;
            System.out.println("[STAND!]");
            System.out.println("{Your cards: " + Dealer.userHandCards + "}");
            System.out.println("[Your total: " + Dealer.userHand + "]");
            Check.winLose();
            System.out.println();
            Opponent.opponentDraw();
        }
        else {
            System.out.println("[SYNTAX ERROR. PLEASE TRY AGAIN.]");
            hit();
        }
    }


}



