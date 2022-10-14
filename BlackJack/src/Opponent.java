public class Opponent {
    public static void opponentDraw() {
        if (Dealer.opponentHandCards.size() < 2) {
            System.out.println("[DEALER HIT]");
            Dealer.opponentSuit();
        }
        System.out.println();
        System.out.println("{Dealer's FIRST card: " + Dealer.opponentHandCards.get(0) + "}");
        System.out.println(Dealer.opponentHand);

        if (Dealer.opponentHand < 16) {
            Dealer.opponentSuit();
            System.out.println("[DEALER HIT]");
        }
        else {
            System.out.println("[DEALER STANDS]");
            BlackJack.isDealerStand = true;
        }
        System.out.println(Dealer.opponentHand);
        Check.bust();
        BlackJack.hit();


    }


}

