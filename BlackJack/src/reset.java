import java.util.ArrayList;

// resets all the card and player data back to the original for the next game
public class reset {

    // new variables and array lists made to store the originals
    public static ArrayList<String> heartsCopy = new ArrayList<>();
    public static ArrayList<String> spadesCopy = new ArrayList<>();
    public static ArrayList<String> clubsCopy = new ArrayList<>();
    public static ArrayList<String> diamondsCopy = new ArrayList<>();
    public static int eHeartCopy = Dealer.eHeart;
    public static int eSpadesCopy = Dealer.eSpades;
    public static int eClubsCopy = Dealer.eClubs;
    public static int eDiamonds = Dealer.eDiamonds;

    // arrays are copied here
    public static void copy() {
        heartsCopy = (ArrayList<String>)Dealer.hearts.clone();
        spadesCopy = (ArrayList<String>) Dealer.spades.clone();
        clubsCopy = (ArrayList<String>) Dealer.clubs.clone();
        diamondsCopy = (ArrayList<String>) Dealer.diamonds.clone();

    }

    // everything is reset using this function
    public static void resetFunc() {
        heartsCopy = Dealer.hearts;
        spadesCopy = Dealer.spades;
        clubsCopy = Dealer.clubs;
        diamondsCopy = Dealer.clubs;

        eHeartCopy = Dealer.eHeart;
        eSpadesCopy = Dealer.eSpades;
        eClubsCopy = Dealer.eClubs;
        eDiamonds = Dealer.eDiamonds;

        //clears user cards and money

        Dealer.userHand = 0;
        Dealer.userHandCards.clear();
        Dealer.opponentHand = 0;
        Dealer.opponentHandCards.clear();
        BlackJack.isDealerStand = false;
        BlackJack.isPlayerStand = false;


    }
}
