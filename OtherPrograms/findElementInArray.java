package OtherPrograms;

import java.lang.*;
import java.util.*;
import java.lang.*;

public class findElementInArray {

    public static void main (String[] args) {

        int[] definedArray = {1 , 2 , 3 , 4 , 5};

        Scanner userInput = new Scanner(System.in);

        int numberToFind = userInput.nextInt();

        findElement(definedArray, numberToFind);

    }

    public static void findElement(int[] a, int b) {

        boolean flagCheck = false;

        int lengthOfArray = a.length;

        for (int i = 0; i < lengthOfArray; i++) {

            if (a[i] == b) {

                flagCheck = true;
                break;

            } else {

                flagCheck = false;
            }

        }

        if (flagCheck == true) {

            System.out.println("Found " + b + " in the array!");

        } else {

            System.out.println("Did not find " + b + " in the array.");

        }

    }

}