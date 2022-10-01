public class Dealer {
    public static String[] hearts = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static String[] spades = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static String[] clubs = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static String[] diamonds = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static double randomSuit = ((Math.random() * 4) + 1);
    public static int setSuit = (int)Math.round(randomSuit);
    public static String useSuit = "";

    public static int userHand = 0;

    public static void suit() {

        if (setSuit == 1) {
            useSuit = "hearts";
            card();
        }
        if (setSuit == 2) {
            useSuit = "spades";
            card();
        }
        if (setSuit == 3){
            useSuit = "clubs";
            card();
        }
        if (setSuit == 4){
            useSuit = "diamonds";
            card();
        }
    }

    public static void card() {
        double randomCard = ((Math.random() * 13) + 1);
        int setCard = (int) Math.round(randomCard);
        if (useSuit.equals("hearts")) {
            if (hearts[setCard].equals("ace")) {
                userHand += 11;
            }
            if (hearts[setCard].equals("two")) {
                userHand += 2;
            }
            if (hearts[setCard].equals("three")) {
                userHand += 3;
            }
            if (hearts[setCard].equals("four")) {
                userHand += 4;
            }
            if (hearts[setCard].equals("five")) {
                userHand += 5;
            }
            if (hearts[setCard].equals("six")) {
                userHand += 6;
            }
            if (hearts[setCard].equals("seven")) {
                userHand += 7;
            }
            if (hearts[setCard].equals("eight")) {
                userHand += 8;
            }
            if (hearts[setCard].equals("nine")) {
                userHand += 9;
            }
            if (hearts[setCard].equals("ten") || hearts[setCard].equals("jack") || hearts[setCard].equals("queen") || hearts[setCard].equals("king")) {
                userHand += 10;
            }

        }
        if (useSuit.equals("spades")) {
            if (spades[setCard].equals("ace")) {
                userHand += 11;
            }
            if (spades[setCard].equals("two")) {
                userHand += 2;
            }
            if (spades[setCard].equals("three")) {
                userHand += 3;
            }
            if (spades[setCard].equals("four")) {
                userHand += 4;
            }
            if (spades[setCard].equals("five")) {
                userHand += 5;
            }
            if (spades[setCard].equals("six")) {
                userHand += 6;
            }
            if (spades[setCard].equals("seven")) {
                userHand += 7;
            }
            if (spades[setCard].equals("eight")) {
                userHand += 8;
            }
            if (spades[setCard].equals("nine")) {
                userHand += 9;
            }
            if (spades[setCard].equals("ten") || spades[setCard].equals("jack") || spades[setCard].equals("queen") || spades[setCard].equals("king")) {
                userHand += 10;
            }

        }
        if (useSuit.equals("clubs")) {
            if (clubs[setCard].equals("ace")) {
                userHand += 11;
            }
            if (clubs[setCard].equals("two")) {
                userHand += 2;
            }
            if (clubs[setCard].equals("three")) {
                userHand += 3;
            }
            if (clubs[setCard].equals("four")) {
                userHand += 4;
            }
            if (clubs[setCard].equals("five")) {
                userHand += 5;
            }
            if (clubs[setCard].equals("six")) {
                userHand += 6;
            }
            if (clubs[setCard].equals("seven")) {
                userHand += 7;
            }
            if (clubs[setCard].equals("eight")) {
                userHand += 8;
            }
            if (clubs[setCard].equals("nine")) {
                userHand += 9;
            }
            if (clubs[setCard].equals("ten") || clubs[setCard].equals("jack") || clubs[setCard].equals("queen") || clubs[setCard].equals("king")) {
                userHand += 10;
            }

        }
        if (useSuit.equals("diamonds")) {
            if (diamonds[setCard].equals("ace")) {
                userHand += 11;
            }
            if (diamonds[setCard].equals("two")) {
                userHand += 2;
            }
            if (diamonds[setCard].equals("three")) {
                userHand += 3;
            }
            if (diamonds[setCard].equals("four")) {
                userHand += 4;
            }
            if (diamonds[setCard].equals("five")) {
                userHand += 5;
            }
            if (diamonds[setCard].equals("six")) {
                userHand += 6;
            }
            if (diamonds[setCard].equals("seven")) {
                userHand += 7;
            }
            if (diamonds[setCard].equals("eight")) {
                userHand += 8;
            }
            if (diamonds[setCard].equals("nine")) {
                userHand += 9;
            }
            if (diamonds[setCard].equals("ten") || diamonds[setCard].equals("jack") || diamonds[setCard].equals("queen") || diamonds[setCard].equals("king")) {
                userHand += 10;
            }

        }
    }


}
