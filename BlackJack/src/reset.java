import java.util.ArrayList;

public class reset {
    public static ArrayList<String> heartsCopy = new ArrayList<>();
    public static ArrayList<String> spadesCopy = new ArrayList<>();
    public static ArrayList<String> clubsCopy = new ArrayList<>();
    public static ArrayList<String> diamondsCopy = new ArrayList<>();
    public static int eHeartCopy = Dealer.eHeart;
    public static int eSpadesCopy = Dealer.eSpades;
    public static int eClubsCopy = Dealer.eClubs;
    public static int eDiamonds = Dealer.eDiamonds;

    public static void copy() {
        heartsCopy = (ArrayList<String>) Dealer.hearts.clone();
        spadesCopy = (ArrayList<String>) Dealer.spades.clone();
        clubsCopy = (ArrayList<String>) Dealer.clubs.clone();
        diamondsCopy = (ArrayList<String>) Dealer.diamonds.clone();

    }
    public static void resetFunc() {
        heartsCopy = Dealer.hearts;
        spadesCopy = Dealer.spades;
        clubsCopy = Dealer.clubs;
        diamondsCopy = Dealer.clubs;

        eHeartCopy = Dealer.eHeart;
        eSpadesCopy = Dealer.eSpades;
        eClubsCopy = Dealer.eClubs;
        eDiamonds = Dealer.eDiamonds;

        //clears user cards

        Dealer.userHand = 0;
        Dealer.userHandCards.clear();
        Dealer.opponentHand = 0;
        Dealer.userHandCards.clear();
    }
}
