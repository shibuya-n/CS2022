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
    }

    public static void card() {
        double randomCard = ((Math.random() * 13) + 1);
        int setCard = (int) Math.round(randomCard);
        if (useSuit == "hearts") {
            if (hearts[setCard] == "ace") {
                userHand += 11;
            }
            if (hearts[setCard] == "two") {
                userHand += 2;
            }
            if (hearts[setCard] == "three") {
                userHand += 3;
            }
            if (hearts[setCard] == "four") {
                userHand += 4;
            }
            if (hearts[setCard] == "five") {
                userHand += 5;
            }



            }
        }
}
