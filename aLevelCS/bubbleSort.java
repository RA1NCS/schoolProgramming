package aLevelCS;

public class bubbleSort {

    public static void main(String args[]) {

        int[] array = {

            1,
            7,
            3,
            5,
            2,
            11,
            9

        };

        bubbleSortP(array);

        for (int x : array) {
            System.out.println(x);
        }

    }

    public static void bubbleSortP (int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1] < array [j]) {

                    int temp = array[j];
                    array [j] = array [j - 1];
                    array [j - 1] = temp;

                }

            }

        }

    }

}
