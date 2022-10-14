


public class Check {

    // prints out messages for winning, draws, and losing; also subtracts score
    public static void lose() {
        reset.resetFunc();
        System.out.println("[YOU LOSE!/BUST!]");
        BlackJack.score -= 10;
        System.out.println(" ");
        System.out.println("[SCORE: "+ BlackJack.score + "]");
        playAgain.play();
    }
    public static void draw() {
        reset.resetFunc();
        System.out.println("[DRAW!]");
        System.out.println(" ");
        System.out.println("[SCORE: "+ BlackJack.score + "]");
        playAgain.play();
    }
    public static void win(){
        reset.resetFunc();
        System.out.println("[YOU WIN!]");
        BlackJack.score += 10;
        System.out.println(" ");
        System.out.println("[SCORE: "+ BlackJack.score + "]");
        playAgain.play();

    }

    //checks while the drawing process whether the player or dealer has busted
    public static void bust() {
        if ((Dealer.userHand > 21) && (Dealer.opponentHand > 21)) {
            reset.resetFunc();
            System.out.println("[DRAW | BOTH PLAYERS BUST.]");
            draw();
        }
        else if ((Dealer.opponentHand > 21) || (Dealer.userHand == 21)) {
            reset.resetFunc();
            System.out.println("[BLACKJACK! | DEALER BUST.]");
            win();

        }
        else if ((Dealer.userHand > 21) || (Dealer.opponentHand == 21)) {
            reset.resetFunc();
            System.out.println("[BUST! | OPPONENT BLACKJACK!]");
            lose();
        }
        else {
            System.out.print("");
        }

    }

    // more logic on whom wins

    public static void winLose(){
        if (BlackJack.isPlayerStand && BlackJack.isDealerStand) {
            if ((21 - Dealer.userHand) == (21 - Dealer.opponentHand)){
                reset.resetFunc();
                draw();
            }
            else if ((21 - Dealer.userHand) > (21 - Dealer.opponentHand)) {
                reset.resetFunc();
                lose();
            }
            else {
                reset.resetFunc();
                win();
            }

        }
    }
}
