package aLevelCS;

import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.print("Please enter the number to find here: ");
        int toFind = userInput.nextInt();

        int[] array = {
                4,
                7,
                8,
                9,
                23,
                55,
                87,
                97,
                98,
                223,
                545,
                785,
                1991,
        };

        System.out.println(BinarySearch(array, toFind));

    }

    public static boolean BinarySearch (int[] array, int toFind) {

        int lowerBound = 0, upperBound = array.length - 1;
        int mid;
        boolean found;

        while (lowerBound < upperBound) {

            mid = ((lowerBound + upperBound) / 2);

            if (array[mid] == toFind) {
                found = true;
                break;
            } else if (array[mid] < toFind) {
                lowerBound = mid + 1;
            } else {
                upperBound = mid - 1;
            }

        }

        if (upperBound == lowerBound) {

            found = upperBound == toFind;
            return found;

        } return true;

    }

}
