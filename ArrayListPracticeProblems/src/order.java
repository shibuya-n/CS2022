import java.util.Arrays;

public class order {

    public static int minIndex = 0;

    public static int[] orderedArray = new int[mainClass.arrayLength];

    public static void sort(){
        System.out.println(Arrays.toString(mainClass.userArray));
        System.out.println(Arrays.toString(orderedArray));

        for (int i = 0; i < mainClass.arrayLength; i++)  {

            minIndex = i;

            for (int x = i + 1; x < mainClass.arrayLength; x++) {

                if (mainClass.userArray[x] < mainClass.userArray[minIndex]) {
                    minIndex = x;
                }

                }

            int temp = minIndex;
            mainClass.userArray[i] = mainClass.userArray[minIndex];


            System.out.println(minIndex);
            System.out.println(mainClass.userArray[minIndex]);

            }
        }
//        System.out.println("Your ordered array: " );
//        System.out.println(Arrays.toString(orderedArray));
    }

