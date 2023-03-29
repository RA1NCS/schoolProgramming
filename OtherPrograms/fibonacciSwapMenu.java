package OtherPrograms;

import java.util.Scanner;

public class fibonacciSwapMenu {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Do you want to swap numbers, or create a fibonacci styled sequence? Type 's' for swapping, and 'f' for creating the sequence: ");
		String mainMenuChoice = userInput.nextLine();

			if (mainMenuChoice.equals("f") || mainMenuChoice.equals("F")) 
			
				{
					System.out.print("Please enter your first number here: ");
					int numberOne = userInput.nextInt();
					
					System.out.print("Please enter your second number here: ");
					int numberTwo = userInput.nextInt();
							
					System.out.print("Please enter the number of counts to be displayed here: ");
					int Beta = userInput.nextInt();
					
					int numberThree , Alpha;
					
					System.out.print ("Resultant Sequence: " + numberOne + " " + numberTwo);
					
					for (Alpha = 2 ; Alpha < Beta ; ++Alpha)
					
					{
						
						numberThree = numberOne + numberTwo;
								
						System.out.print(" " + numberThree);
						
						numberOne = numberTwo;
						
						numberTwo = numberThree;
						
					}
				} 
			
			else if (mainMenuChoice.equals("s") || mainMenuChoice.equals("S")) 
	
			{
				
				System.out.print("Please enter the first term: ");
				int swapOne = userInput.nextInt();

				System.out.print("Please enter the second term: ");
				int swapTwo = userInput.nextInt();

				System.out.println("-");
				System.out.println("-");
				System.out.println("-");

				System.out.println("Before Swapping, The first term was " + swapOne + ", and the second term was " + swapTwo + ".");
				
				System.out.println("-");

				int tempVariable;

				tempVariable = swapTwo;
				swapTwo = swapOne;
				swapOne = tempVariable;

				System.out.println("After Swapping, The first term is " + swapOne + ", and the second term is " + swapTwo + ".");

			} else {

				System.out.println("Stop testing the program, go back to elementary school. S or F doesn't include '" + mainMenuChoice + "' smh");

			}

		
	} //publicStaticVoid

} //publicClass
