package OtherPrograms;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int result = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the first number here: ");
        int numOne = userInput.nextInt();

;       System.out.print("Please enter the second number here: ");
        int numTwo = userInput.nextInt();

        System.out.print("Please enter the operator here, 1 is Addition, 2 is Subtraction, 3 is Multiplication, 4 is Division: ");
        int operator = userInput.nextInt();

        if (operator == 1) {

            result = numOne + numTwo;

        } else if (operator == 2) {

            result = numOne - numTwo;

        } else if (operator == 3) {

            result = numOne * numTwo;

        } else if (operator == 4) {

            result = numOne / numTwo;

        } else {

            System.out.println("Please re-enter the correct operator and try again!");

        }

        System.out.println("Your expected result is: " + result + ".");


    }

}
