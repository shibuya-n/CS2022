import java.util.*;
import java.util.stream.*;

//Deals the cards
public class Dealer {
    public static ArrayList<String> hearts = new ArrayList<>();

    public static ArrayList<String> spades = new ArrayList<>();

    public static ArrayList<String> clubs = new ArrayList<>();

    public static ArrayList<String> diamonds = new ArrayList<>();


    public static String[] cardList = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static double randomSuit = ((Math.random() * 4) + 1);
    public static int setSuit = (int)Math.round(randomSuit);
    public static String useSuit = "";

    public static int userHand = 0;


    public static void initialize(){
        cardAdder();
        suit();
    }
    public static void cardAdder() {
        for (int i = 0; i < cardList.length; i++) {
            hearts.add(cardList[i]);
            spades.add(cardList[i]);
            clubs.add(cardList[i]);
            diamonds.add(cardList[i]);

        }
    }

    public static void suit()  {

        if (setSuit == 1) {
            useSuit = useSuit + "hearts";
            card();
        }
        if (setSuit == 2) {
            useSuit = useSuit + "spades";
            card();
        }
        if (setSuit == 3){
            useSuit = useSuit + "clubs";
            card();
        }
        if (setSuit == 4){
            useSuit = useSuit + "diamonds";
            card();
        }

    }

    public static void card() {
        double randomCard = ((Math.random() * 13) + 1);
        int setCard = (int)Math.round(randomCard);
        int eRange = setCard - 1;

        //takes out the cards
        if (useSuit.equals("hearts")) {
            for (int i = 2; i > 0; i--){
                if (hearts.get(eRange).equals("ace")) {
                    userHand += 11;
                    hearts.remove(eRange);
                }
                if (hearts.get(eRange).equals("two")) {
                    userHand += 2;
                    hearts.remove(eRange);
                }
                if (hearts.get(eRange).equals("three")) {
                    userHand += 3;
                }
                if (hearts.get(eRange).equals("four")) {
                    userHand += 4;
                }
                if (hearts.get(eRange).equals("five")) {
                    userHand += 5;
                }
                if (hearts.get(eRange).equals("six")) {
                    userHand += 6;
                }
                if (hearts.get(eRange).equals("seven")) {
                    userHand += 7;
                }
                if (hearts.get(eRange).equals("eight")) {
                    userHand += 8;
                }
                if (hearts.get(eRange).equals("nine")) {
                    userHand += 9;
                }
                if (hearts.get(eRange).equals("ten") || hearts.get(eRange).equals("jack") || hearts.get(eRange).equals("queen") || hearts.get(eRange).equals("king")) {
                    userHand += 10;
                }
            }


        }
        if (useSuit.equals("spades")) {
            for (int i = 2; i > 0; i--) {
                if (spades.get(eRange).equals("ace")) {
                    userHand += 11;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("two")) {
                    userHand += 2;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("three")) {
                    userHand += 3;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("four")) {
                    userHand += 4;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("five")) {
                    userHand += 5;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("six")) {
                    userHand += 6;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("seven")) {
                    userHand += 7;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("eight")) {
                    userHand += 8;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("nine")) {
                    userHand += 9;
                    spades.remove(eRange);
                }
                if (spades.get(eRange).equals("ten") || spades.get(eRange).equals("jack") || spades.get(eRange).equals("queen") || spades.get(eRange).equals("king")) {
                    userHand += 10;
                    spades.remove(eRange);
                }
            }

        }

        if (useSuit.equals("clubs")) {
            for (int i = 2; i > 0; i--) {
                if (clubs.get(eRange).equals("ace")) {
                    userHand += 11;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("two")) {
                    userHand += 2;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("three")) {
                    userHand += 3;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("four")) {
                    userHand += 4;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("five")) {
                    userHand += 5;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("six")) {
                    userHand += 6;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("seven")) {
                    userHand += 7;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("eight")) {
                    userHand += 8;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("nine")) {
                    userHand += 9;
                    clubs.remove(eRange);
                }
                if (clubs.get(eRange).equals("ten") || clubs.get(eRange).equals("jack") || clubs.get(eRange).equals("queen") || clubs.get(eRange).equals("king")) {
                    userHand += 10;
                    clubs.remove(eRange);
                }
            }

        }
        if (useSuit.equals("diamonds")) {
            for (int i = 2; i > 0; i--) {
                if (diamonds.get(eRange).equals("ace")) {
                    userHand += 11;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("two")) {
                    userHand += 2;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("three")) {
                    userHand += 3;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("four")) {
                    userHand += 4;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("five")) {
                    userHand += 5;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(setCard - 1).equals("six")) {
                    userHand += 6;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("seven")) {
                    userHand += 7;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("eight")) {
                    userHand += 8;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("nine")) {
                    userHand += 9;
                    diamonds.remove(eRange);
                }
                if (diamonds.get(eRange).equals("ten") || diamonds.get(eRange).equals("jack") || diamonds.get(eRange).equals("queen") || diamonds.get(eRange).equals("king")) {
                    userHand += 10;
                    diamonds.remove(eRange);
                }
            }
        }

        System.out.println(userHand);
    }



}
