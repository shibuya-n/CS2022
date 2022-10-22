

public class order {

    public static void sort(){
        int temp = 0;


        for (int i = 0; i < mainClass.arrayLength; i++)  {

            for (int x = i + 1; x < mainClass.arrayLength; x++) {

                if (mainClass.userArray[i] > mainClass.userArray[x]) {
                    temp = mainClass.userArray[i];
                    mainClass.userArray[i] = mainClass.userArray[x];
                    mainClass.userArray[x] = temp;
                }

                }


            }

        }
    public static void reverseSort() {
        sort();
        int temp = 0;

        for (int i = 0; i < mainClass.arrayLength / 2 ; i++) {
            temp = mainClass.userArray[i];
            mainClass.userArray[i] = mainClass.userArray[mainClass.arrayLength - (i + 1)];
            mainClass.userArray[mainClass.arrayLength - (i + 1)] = temp;
        }

    }
    }

