import java.util.Scanner;

public class BlackJack {
    public static int score = 0;
    public static String[] cards = {};
    public static void main(String[] args){
    ask();

    }
    public static void ask() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("----- [PLAY BLACKJACK.] [yes/no] -----");
        String userAnswer = scannerObject.nextLine();
        String yes = "yes";
        String no = "no";
        if (userAnswer.toLowerCase().equals(yes)) {
            try {
                bar();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("[GAME INITIALIZED]");
            play();


        } else if (userAnswer.toLowerCase().equals(no)) {
            System.out.println("see you next time...");
        } else {
            System.out.println("[ERROR].");
            ask();

        }
    }
    public static void play() {
        System.out.println("W.I.P");
    }
    public static void bar() throws Exception {
        String anim= "|/-·-\\";
        for (int x = 0 ; x <= 100 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x +"%" + " [LOADING...]";
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
    }
//    public static void print(String args){
//        for (int i = 0; i < args.length(); i++){
//            System.out.print(args.substring(i,i+1));
//            try{
//                Thread.sleep(80);
//            } catch(InterruptedException e){
//            }
//        }
}


