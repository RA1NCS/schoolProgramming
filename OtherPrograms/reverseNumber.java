package csExam;

import java.util.*;
import java.lang.*;
import java.io.*;
public class reverseNumber {

	public static void main(String[] args) {


		Scanner userInput = new Scanner (System.in);

		System.out.print("Please enter the number here: ");

		int numberInput = userInput.nextInt();

		int reversedNumber = numberReverser(numberInput);

		System.out.println("The reverse of the number entered is: " + reversedNumber);


	}

    static int numberReverser (int originalNumber) {

        int moddedRemainder;

        int reversedNumberCalc = 0;

        while (originalNumber > 0) {

            moddedRemainder = originalNumber % 10;

            reversedNumberCalc = (reversedNumberCalc * 10) + moddedRemainder;

            originalNumber = originalNumber / 10;

        }

        return reversedNumberCalc;

    }



}


