public class Opponent {
    public static void opponentDraw() {
        Dealer.opponentSuit();
        if (Dealer.opponentHandCards.size() < 2) {
            Dealer.opponentSuit();
        }
        System.out.println();
        System.out.println("{Dealer's FIRST card: " + Dealer.opponentHandCards.get(0) + "}");

        if (Dealer.opponentHand < 16) {
            Dealer.opponentSuit();
            System.out.println("[DEALER HIT]");
            System.out.println(Dealer.opponentHand);
            Check.dealerCheck();
        }
        else {
            System.out.println("[DEALER STANDS]");
            Check.dealerCheck();
        }


    }


}

