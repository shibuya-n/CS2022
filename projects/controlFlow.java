package projects;

import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args){
    ask();
    }
    public static void ask() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("-----Would you like to play BLACKJACK? (Yes/No)-----");
        String userAnswer = scannerObject.nextLine();
        String yes = "yes";
        String no = "no";
        if (userAnswer.toLowerCase().equals(yes)) {
            System.out.println("Let's play!");
            System.out.println("------------");
            play();

        } else if (userAnswer.toLowerCase().equals(no)) {
            System.out.println("Okay, see you next time!");
        } else {
            System.out.println("Error. Try again?");
            ask();

        }
    }
    public static void play() {
        System.out.println("You suck.");
    }
}
