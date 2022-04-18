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

        System.out.println(binarySearch(array, toFind));

    }

    public static boolean binarySearch (int[] array, int toFind) {

        int lowerBound = 0, upperBound = array.length;
        int mid = ((lowerBound + upperBound) / 2);

        while (lowerBound <= upperBound) {

            if (array[mid] == toFind) {

                return true;

            } else if (array[mid] < toFind) {

                lowerBound = mid + 1;

            } else {

                upperBound = mid - 1;
            }

            mid = ((lowerBound + upperBound) / 2);

        }

        if (upperBound == lowerBound) {

            boolean found = (upperBound == toFind) ? true : false;
            return found;

        } return false;

    }

}
