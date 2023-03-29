package aLevelCS;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int[] array = {1, 3, 5, 6, 7, 9};
        boolean found = false;

        System.out.print("Please enter the number to find here: ");
        int toFind = userInput.nextInt();

        for (int i : array) {

            if (toFind == i) {

                found = true;

                break;

            }

        }

        String result = (found) ? "number found" : "number not found";
        System.out.println(result);

    }

}