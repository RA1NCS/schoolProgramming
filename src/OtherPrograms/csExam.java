package OtherPrograms;

import java.util.Scanner;

public class csExam {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your choice here. Entering 1 will swap two numbers. Entering 2 will check for a vowel present in a string, and entering 3 will check if a number is a palindrome.");
        int menuChoice = userInput.nextInt();

        if (menuChoice == 1) {

            int tempVar = 0;

            System.out.print("Please enter the first number here: ");
            int numberOne = userInput.nextInt();

            System.out.print("Please enter the second number here: ");
            int numberTwo = userInput.nextInt();

            tempVar = numberOne;
            numberOne = numberTwo;
            numberTwo = tempVar;

            System.out.println("The first number is " + numberOne + ", and the second number is " + numberTwo);


        } else if (menuChoice == 2) {

            System.out.print("Please enter the string to be checked for a vowel here: ");
            String stringInput = userInput.next();

            vowelCheck(stringInput);


        } else if (menuChoice == 3) {

            System.out.print("Please enter a number here to check for palindrome: ");
            int palindromeNumber = userInput.nextInt();

            palindromeCheck(palindromeNumber);

        }

    }

    public static void palindromeCheck(int a) {

        int reversed = reverseNumber(a);

        if (reversed == a) {

            System.out.println("Number is a palindrome");

        } else {

            System.out.println("Number is not a palindrome");

        }

    }

    public static int reverseNumber(int a) {

        int moddedRemainder = 0;
        int reverseNumberCalc = 0;

        while (a > 0) {

            moddedRemainder = a % 10;
            reverseNumberCalc = (reverseNumberCalc * 10) + moddedRemainder;
            a = a / 10;

        }

        return reverseNumberCalc;

    }

    public static void vowelCheck (String s) {

        int stringLength = s.length();
        boolean vowelFound = false;

        for (int i = 0; i < stringLength; i++) {

            char currentChar = s.charAt(i);

            if (currentChar == 'a'|| currentChar == 'e'|| currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {

                vowelFound = true;
                break;

            }

        }

        if (vowelFound) {

            System.out.println("Vowel is found in the string given.");

        } else {

            System.out.println("Vowel is not found in the string given.");

        }

    }

}


// If user enters 1,

// User inputs 1 , 2, or 3

//1 --> take 2 inputs and swap the numbesr;
//2 --> if a vowel present in the string;
//3 --> palindrome

//swapping numbers method
//vowel present method