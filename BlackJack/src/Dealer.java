public class Dealer {
    public static String[] hearts = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static String[] spades = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static String[] clubs = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static String[] diamonds = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    public static int setSuit = 0;
    public static String useSuit = "";

    public static int userHand = 0;

    public static void suit() {
        double randomSuit = ((Math.random() * 4) + 1);
        setSuit = (int) Math.round(randomSuit);

        if (setSuit == 1) {
            useSuit = "hearts";
            card();
        }
        if (setSuit == 2) {
            useSuit = "hearts";
            card();
        }
    }

    public static void card() {
        double randomCard = ((Math.random() * 13) + 1);
        int setCard = (int) Math.round(randomCard);
        if (useSuit == "hearts") {
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
        if (useSuit == "spades") {
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
    }
}
