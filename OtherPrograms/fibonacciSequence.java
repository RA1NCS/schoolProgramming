package OtherPrograms;

import java.util.Scanner;

public class fibonacciSequence {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your first number here: ");
        int numberOne = userInput.nextInt();

        System.out.print("Please enter your second number here: ");
        int numberTwo = userInput.nextInt();

        System.out.print("Please enter the length of the sequence to be displayed here: ");
        int numberOfCounts = userInput.nextInt();

        outputFibonacci(numberOne, numberTwo, numberOfCounts);

    }

    public static void outputFibonacci (int a, int b, int c) {

        System.out.print(a + " " + b);

        for (int i = 0; i < c - 2; i++) {

            int sum = a + b;

            System.out.print(" " + sum);

            a = b;

            b = sum;

        }

    }

}
