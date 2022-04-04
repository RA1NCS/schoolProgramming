package OtherPrograms;

import java.util.Scanner;

public class palindromicString {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String A = userInput.next();

        System.out.println(palindromeCheck(A,reverseString(A)));;

    }

    public static String reverseString (String s) {

        String reversed = "";

        int stringLength = s.length();

        for (int i = 0; i < stringLength; i++) {

            int charIndex = stringLength - i - 1;
            char currentChar = s.charAt(charIndex);
            reversed = reversed + currentChar;

        }

        return reversed;

    }

    public static String palindromeCheck (String a, String b) {

        String palindromePrint;

        if (b.equals(a)) {

            palindromePrint = "Yes";

        } else {

            palindromePrint = "No";

        }

        return palindromePrint;

    }

}
