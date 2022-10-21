//Create a program that will sort a user-provided integer array from least to greatest (ascending order) or greatest to least (descending order)
//        Ask the user for the length of the array and the values
//        Ask the user for “asc” or “desc” order
//        Examples:
//        Array of size 4 in asc order: {5, 9, 1, 3, 4} entered, {1, 3, 4, 5, 9} returned
//        Array of size 5 in desc order: {-25, -7, 1, 13, 40} entered, {40, 13, 1, -7, -25}

import java.util.Scanner;

public class arrayList {

    public static int arrayLength = 0;
    public static int[] userArray = new int[arrayLength];

    public static void main(String[] args) {
        ask();
    }
    public static void ascendingOrDescending() {
        Scanner askUpOrDown = new Scanner(System.in);
        System.out.println("Is Your List Ascending or Descending? [asc/desc]");
        String userUpOrDown = askUpOrDown.nextLine();

        if (userUpOrDown.equals("asc")) {
            System.out.println("hi");


        }
        else if (userUpOrDown.equals("desc")) {

        }

        else {
            System.out.println("INVALID SYNTAX. PLEASE TRY AGAIN.");
            ascendingOrDescending();
        }
    }



    public static void ask() {
        Scanner askUserLength = new Scanner(System.in);
        System.out.println("How many elements do you have in your array? [insert number]");
        String inputLength = askUserLength.nextLine();
        arrayLength = Integer.parseInt(String.valueOf(inputLength));
        userArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            Scanner askUserValue = new Scanner(System.in);
            System.out.println("What is your first value?  [INSERT NUMBER.]");
            int userValue = Integer.parseInt(String.valueOf(askUserValue.nextLine()));
            userArray[i]  = userValue;

        }
        System.out.println(userArray);
        }


    }

