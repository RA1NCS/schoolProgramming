package aLevelCS;

public class insertionSort {

    public static void main (String args[]) {

        int[] arrayToSort = {3,6,32,5,1,2,3};

        sortArray(arrayToSort);

        for (int index : arrayToSort) {

            System.out.print(index + " ");
        }

    }

    public static void sortArray(int array[]) {

        int length = array.length;

        for (int i = 1; i < length; i++) {

            int currentValue = array[i];
            int arrayIndex = i - 1;

            while (arrayIndex >= 0 && array[arrayIndex] > currentValue) {
                array[arrayIndex + 1] = array[arrayIndex];
                arrayIndex = arrayIndex - 1;
            }

            array[arrayIndex + 1] = currentValue;
        }

    }

}