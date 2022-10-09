import java.util.ArrayList;

public class reset {
    public static ArrayList<String> heartsCopy = new ArrayList<>();
    public static void copy() {
        heartsCopy = (ArrayList<String>) Dealer.hearts.clone();

        resetFunc();
    }
    public static void resetFunc() {
        System.out.println(heartsCopy);
        heartsCopy = Dealer.hearts;
    }
}
