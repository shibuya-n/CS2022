import java.util.Scanner;


public class Check {
    public static void playerCheck() {
        if (Dealer.userHand > 21) {
            lose();

        }
    }

    public static void lose() {
        reset.resetFunc();
        System.out.println("[YOU LOSE!/BUST!]");
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("----- [PLAY AGAIN?] [yes/no] -----");
        String userAnswer = scannerObject.nextLine();
        String yes = "yes";
        String no = "no";
        if (userAnswer.toLowerCase().equals(yes)) {
//            try {
//                loadingBar.bar();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("[GAME INITIALIZED]");
            BlackJack.play();


        } else if (userAnswer.toLowerCase().equals(no)) {
            System.out.println("see you next time...");
        } else {
            System.out.println("[SYNTAX ERROR. PLEASE TRY AGAIN.]");
            BlackJack.ask();
        }
    }
}
