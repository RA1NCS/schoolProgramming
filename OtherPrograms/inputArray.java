package OtherPrograms;

import java.util.*;

public class inputArray {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.print("Please enter the first number to be added: ");
		int inputOne = userInput.nextInt();
		
		System.out.print("Please enter the second number to be added: ");
		int inputTwo = userInput.nextInt();
		
		System.out.print("Please enter the third number to be added: ");
		int inputThree = userInput.nextInt();
		
		System.out.print("Please enter the fourth number to be added: ");
		int inputFour = userInput.nextInt();

		System.out.print("Please enter the fifth number to be added: ");
		int inputFive = userInput.nextInt();
		
		int Alpha[] = {inputOne, inputTwo, inputThree, inputFour, inputFive};
		
		int finalSum = Alpha[0] + Alpha[1] + Alpha[2] + Alpha[3] + Alpha[4];
				
		System.out.println("The total sum of the numbers is: " + finalSum);
		

}
	
}
