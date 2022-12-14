import java.util.*;

//Deals the cards
public class Dealer {

    // card lists
    public static ArrayList<String> hearts = new ArrayList<>();

    public static ArrayList<String> spades = new ArrayList<>();

    public static ArrayList<String> clubs = new ArrayList<>();

    public static ArrayList<String> diamonds = new ArrayList<>();


    public static String[] cardList = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "ten", "jack", "queen", "king"};
    public static int setSuit = 0;
    public static String useSuit = "";

    public static String opponentUseSuit = "";

    //user's hand
    public static int userHand = 0;
    public static ArrayList<String> userHandCards = new ArrayList<>();

    //dealer's hand
    public static int opponentHand = 0;
    public static ArrayList<String> opponentHandCards = new ArrayList<>();

    // used to change the range of the card picking function, so it doesn't go over the actual range and break
    public static int eHeart = 13;
    public static int eSpades = 13;
    public static int eClubs = 13;
    public static int eDiamonds = 13;


    public static void initialize(){
        cardAdder();
        suit();
    }

    // loads all the cards into the lists
    public static void cardAdder() {
        for (String s : cardList) {
            hearts.add(s);
            spades.add(s);
            clubs.add(s);
            diamonds.add(s);

        }
    }

    // selects the suit that the card picker picks from

    public static void randomizer() {
        setSuit = ((int)Math.floor(Math.random() * 4) + 1);

    }


    public static void suit()  {
        randomizer();

        if (setSuit == 1) {
            useSuit = "hearts";
            getCard();
        }
        if (setSuit == 2) {
            useSuit = "spades";
            getCard();
        }
        if (setSuit == 3){
            useSuit = "clubs";
            getCard();
        }
        if (setSuit == 4){
            useSuit = "diamonds";
            getCard();
        }

    }

    public static void opponentSuit() {
        randomizer();

        if (setSuit == 1) {
            opponentUseSuit = "hearts";
            opponentCard();
        }
        if (setSuit == 2) {
            opponentUseSuit = "spades";
            opponentCard();
        }
        if (setSuit == 3) {
            opponentUseSuit = "clubs";
            opponentCard();
        }
        if (setSuit == 4) {
            opponentUseSuit = "diamonds";
            opponentCard();
        }
    }

    // deals a random card to the player
    public static void getCard() {

        if (useSuit.equals("hearts")) {
            int randomCard = ((int)Math.floor(Math.random() * eHeart) + 1);
            int eRange = randomCard - 1;

            if (hearts.get(eRange).equals("ace")) {
                userHand += 1;
                if (userHand + 10 <= 21){
                    userHand += 10;
                }
                String card = hearts.remove(eRange);
                userHandCards.add(card + " of HEARTS");
            }
            else if (hearts.get(eRange).equals("ten") || hearts.get(eRange).equals("jack") || hearts.get(eRange).equals("queen") || hearts.get(eRange).equals("king")) {
                userHand += 10;
                String card = hearts.remove(eRange);
                userHandCards.add(card + " of HEARTS");
            }
            else {
                int cardNumber = Integer.parseInt(hearts.get(eRange));
                userHand += cardNumber;
                String card = hearts.remove(eRange);
                userHandCards.add(card  + " of HEARTS");
            }
            eHeart--;
        }

        if (useSuit.equals("spades")) {
            int randomCard = ((int)Math.floor(Math.random() * eSpades) + 1);
            int eRange = randomCard - 1;
            if (spades.get(eRange).equals("ace")) {
                userHand += 1;
                if (userHand + 10 <= 21) {
                    userHand += 10;
                }
                    String card = spades.remove(eRange);
                userHandCards.add(card + " of SPADES");


            }
            else if (spades.get(eRange).equals("ten") || spades.get(eRange).equals("jack") || spades.get(eRange).equals("queen") || spades.get(eRange).equals("king")) {
                userHand += 10;
                String card = spades.remove(eRange);
                userHandCards.add(card + " of SPADES");
            }
            else {
                int cardNumber = Integer.parseInt(spades.get(eRange));
                userHand += cardNumber;
                String card = spades.remove(eRange);
                userHandCards.add(card + " of SPADES");

            }
            eSpades--;
        }

        if (useSuit.equals("clubs")) {
            int randomCard = ((int)Math.floor(Math.random() * eClubs) + 1);
            int eRange = randomCard - 1;
            if (clubs.get(eRange).equals("ace")) {
                userHand += 1;
                if (userHand + 10 <= 21) {
                    userHand += 10;
                }
                String card = clubs.remove(eRange);
                userHandCards.add(card + " of CLUBS");
            }
            else if (clubs.get(eRange).equals("ten") || clubs.get(eRange).equals("jack") || clubs.get(eRange).equals("queen") || clubs.get(eRange).equals("king")) {
                userHand += 10;
                String card = clubs.remove(eRange);
                userHandCards.add(card + " of CLUBS");
            }
            else {
                int cardNumber = Integer.parseInt(clubs.get(eRange));
                userHand += cardNumber;
                String card = clubs.remove(eRange);
                userHandCards.add(card + " of CLUBS");

            }
            eClubs--;

        }

        if (useSuit.equals("diamonds")) {
            int randomCard = ((int)Math.floor(Math.random() * eDiamonds) + 1);
            int eRange = randomCard - 1;
            if (diamonds.get(eRange).equals("ace")) {
                userHand += 1;
                if (userHand + 10 <= 21) {
                    userHand += 10;
                }
                String card = diamonds.remove(eRange);
                userHandCards.add(card  + " of DIAMONDS");

            }
            else if (diamonds.get(eRange).equals("ten") || diamonds.get(eRange).equals("jack") || diamonds.get(eRange).equals("queen") || diamonds.get(eRange).equals("king")) {
                userHand += 10;
                String card = diamonds.remove(eRange);
                userHandCards.add(card + " of DIAMONDS");
            }
            else {
                int cardNumber = Integer.parseInt(diamonds.get(eRange));
                userHand += cardNumber;
                String card = diamonds.remove(eRange);
                userHandCards.add(card + " of DIAMONDS");

            }
            eDiamonds--;
        }
        System.out.println("[Hit!]");
        System.out.println("{Your cards: " + userHandCards + "}");
        System.out.println("[Your total: " + userHand + "]");
        Check.bust();
    }

    // deals random cards to the dealer or opponent
    public static void opponentCard() {
        //takes out the cards
        if (opponentUseSuit.equals("hearts")) {
            int randomCard = ((int) Math.floor(Math.random() * eHeart) + 1);
            int eRange = randomCard - 1;
            if (hearts.get(eRange).equals("ace")) {
                opponentHand += 1;
                if (opponentHand + 10 <= 21) {
                    opponentHand += 10;
                }
                String card = hearts.remove(eRange);
                opponentHandCards.add(card + " of HEARTS");
            } else if (hearts.get(eRange).equals("ten") || hearts.get(eRange).equals("jack") || hearts.get(eRange).equals("queen") || hearts.get(eRange).equals("king")) {
                opponentHand += 10;
                String card = hearts.remove(eRange);
                opponentHandCards.add(card + " of HEARTS");
            } else {
                int cardNumber = Integer.parseInt(hearts.get(eRange));
                opponentHand += cardNumber;
                String card = hearts.remove(eRange);
                opponentHandCards.add(card + " of HEARTS");
            }
            eHeart--;
        }

        if (opponentUseSuit.equals("spades")) {
            int randomCard = ((int) Math.floor(Math.random() * eSpades) + 1);
            int eRange = randomCard - 1;
            if (spades.get(eRange).equals("ace")) {
                opponentHand += 1;
                if (opponentHand + 10 <= 21) {
                    opponentHand += 10;
                }
                String card = spades.remove(eRange);
                opponentHandCards.add(card + " of SPADES");


            } else if (spades.get(eRange).equals("ten") || spades.get(eRange).equals("jack") || spades.get(eRange).equals("queen") || spades.get(eRange).equals("king")) {
                opponentHand += 10;
                String card = spades.remove(eRange);
                opponentHandCards.add(card + " of SPADES");
            } else {
                int cardNumber = Integer.parseInt(spades.get(eRange));
                opponentHand += cardNumber;
                String card = spades.remove(eRange);
                opponentHandCards.add(card + " of SPADES");

            }
            eSpades--;
        }

        if (opponentUseSuit.equals("clubs")) {
            int randomCard = ((int) Math.floor(Math.random() * eClubs) + 1);
            int eRange = randomCard - 1;
            if (clubs.get(eRange).equals("ace")) {
                opponentHand += 1;
                if (opponentHand + 10 <= 21) {
                    opponentHand += 10;
                }
                String card = clubs.remove(eRange);
                opponentHandCards.add(card + " of CLUBS");
            } else if (clubs.get(eRange).equals("ten") || clubs.get(eRange).equals("jack") || clubs.get(eRange).equals("queen") || clubs.get(eRange).equals("king")) {
                opponentHand += 10;
                String card = clubs.remove(eRange);
                opponentHandCards.add(card + " of CLUBS");
            } else {
                int cardNumber = Integer.parseInt(clubs.get(eRange));
                opponentHand += cardNumber;
                String card = clubs.remove(eRange);
                opponentHandCards.add(card + " of CLUBS");

            }
            eClubs--;

        }

        if (opponentUseSuit.equals("diamonds")) {
            int randomCard = ((int) Math.floor(Math.random() * eDiamonds) + 1);
            int eRange = randomCard - 1;
            if (diamonds.get(eRange).equals("ace")) {
                opponentHand += 1;
                if (opponentHand + 10 <= 21) {
                    opponentHand += 10;
                }
                String card = diamonds.remove(eRange);
                opponentHandCards.add(card + " of DIAMONDS");

            } else if (diamonds.get(eRange).equals("ten") || diamonds.get(eRange).equals("jack") || diamonds.get(eRange).equals("queen") || diamonds.get(eRange).equals("king")) {
                opponentHand += 10;
                String card = diamonds.remove(eRange);
                opponentHandCards.add(card + " of DIAMONDS");
            } else {
                int cardNumber = Integer.parseInt(diamonds.get(eRange));
                opponentHand += cardNumber;
                String card = diamonds.remove(eRange);
                opponentHandCards.add(card + " of DIAMONDS");

            }
            eDiamonds--;
        }

    }
}
