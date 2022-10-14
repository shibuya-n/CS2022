import java.util.Scanner;

public class playAgain {

    // play again function
    public static void play() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("----- [PLAY AGAIN?] [yes/no] -----");
        String userAnswer = scannerObject.nextLine();
        String yes = "yes";
        String no = "no";
        if (userAnswer.toLowerCase().trim().equals(yes)) {
            try {
                loadingBar.bar();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("[GAME INITIALIZED]");
            BlackJack.play();
        } else if (userAnswer.toLowerCase().trim().equals(no)) {
            System.out.println("see you next time...");
        } else {
            System.out.println("[SYNTAX ERROR. PLEASE TRY AGAIN.]");
            BlackJack.ask();
        }
    }
}
