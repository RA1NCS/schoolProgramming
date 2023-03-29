package HackerRank.Strings;

import java.util.Locale;
import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String A = userInput.next();
        String B = userInput.next();

        System.out.println(sumOfLengths(A,B));
        System.out.println(charCompare(A,B));
        System.out.println(capitalisedSentence(A,B));

    }

    static int sumOfLengths (String A, String B) {

        return (A.length() + B.length());

    }

    static String capitalisedSentence (String A, String B) {

        String firstWordUppercase = A.substring(0 , 1).toUpperCase() + A.substring(1);
        String secondWordUppercase = B.substring(0 , 1).toUpperCase() + B.substring(1);

        return firstWordUppercase + " " + secondWordUppercase;

    }

    static String charCompare (String A, String B) {

        String ABComparison;
        char AChar = A.toLowerCase().charAt(0);
        char BChar = B.toLowerCase().charAt(0);
        int compareAB = Character.compare(AChar, BChar);


        if (compareAB <= 0) {

            ABComparison = "No";

        } else {

            ABComparison = "Yes";

        }

        return ABComparison;

    }



}
