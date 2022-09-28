package projects;

import  java.util.*;
public class diceGame {
    public static int score = 0;
    public static void main(String[] args) {

        ask();

    }

    public static void ask() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Would you like to play the Dice Game? (Yes/No)");
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
        double randomNum = (Math.random() * 6 + 1);
        int roundedNum = (int) Math.round(randomNum);


        if (roundedNum % 2 == 0) {
            System.out.println("You win!");
            score++;
            System.out.println("Score: " + score);

            Scanner scannerObject = new Scanner(System.in);
            System.out.println("Play again? Yes/No");
            String userAnswer = scannerObject.nextLine();
            String yes = "yes";
            String no = "no";

            if (userAnswer.toLowerCase().equals(yes)) {
                System.out.println("Let's play!");
                play();

            } else if (userAnswer.toLowerCase().equals(no)) {
                System.out.println("Okay, see you next time!");
            } else {
                System.out.println("Error. Try again?");
                ask();

            }
        } else {
            System.out.println("You lose! :(");
            System.out.println("Score: " + score);
            Scanner scannerObject = new Scanner(System.in);
            System.out.println("Play again? Yes/No");
            String userAnswer = scannerObject.nextLine();
            String yes = "yes";
            String no = "no";

            if (userAnswer.toLowerCase().equals(yes)) {
                System.out.println("Let's play!");
                play();

            } else if (userAnswer.toLowerCase().equals(no)) {
                System.out.println("Okay, see you next time!");
            } else {
                System.out.println("Error. Try again?");
                ask();

            }
            }


        }
    }






