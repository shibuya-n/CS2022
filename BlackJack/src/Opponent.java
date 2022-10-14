
// opponent's ai and decision making
public class Opponent {

    // decides whether to hit or stay
    public static void opponentDraw() {
        if (Dealer.opponentHandCards.size() < 2) {
            System.out.println();
            System.out.println("[DEALER HIT]");
            Dealer.opponentSuit();
        }
        System.out.println("{Dealer's FIRST card: " + Dealer.opponentHandCards.get(0) + "}");

        if (Dealer.opponentHand < 16) {
            Dealer.opponentSuit();
            System.out.println("[DEALER HIT]");
        }
        else {
            System.out.println("[DEALER STANDS]");
            BlackJack.isDealerStand = true;
            System.out.println("{Dealer's FIRST card: " + Dealer.opponentHandCards.get(0) + "}");
            Check.winLose();
        }
        Check.bust();
        BlackJack.hit();


    }


}

