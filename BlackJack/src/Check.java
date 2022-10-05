public class Check {
    public static void playerCheck(){
        if (Dealer.userHand > 21){
            lose();
        }
    }
    public static void lose(){
        System.out.println("[YOU LOSE!/BUST!]");
    }

}
