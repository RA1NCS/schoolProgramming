package HackerRank.Strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {

        if (valueOfString(a) == valueOfString(b)) {

            return true;

        } else {

            return false;

        }


    }

    static int valueOfString (String a) {

        int addLetter = 0;

        String inputString = a.toLowerCase();

        final String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < inputString.length(); i++) {
            addLetter = addLetter + (alphabet.indexOf(inputString.charAt(i)) + 1);
        }

        return addLetter;

    }


 // CAN'T EDIT

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.next();

        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);

        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

}
