package OtherPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class gradeCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your marks here: ");

        String Alpha = userInput.nextLine();
        boolean goAhead = false;


        // Checking if the passed input is an integer.
        
        try 
		{ 
			Integer.parseInt(Alpha);
			System.out.println("Processing...");
            goAhead = true; // Flag is set to true if passed input is an integer
		}  
		catch (NumberFormatException e)  
		{ 
			System.out.println("Don't you know the meaning of 'marks'?"); 
		}

        if (goAhead) // Since 'Integer.parseInt only works with a string, the user's input is taken as a string, and is converted to an integer here (if the Integer.parseInt function returns true). If we take an input as a integer, and then the user inputs a string, it is going to give a Java error, and I made this thing in order to prevent that.
        {
            int Beta = Integer.parseInt(Alpha); // Convert string to integer
            
            if (Beta >= 85 && Beta <= 100)
            {
                System.out.print("Your grade is an A*");
            }
                else if (Beta >= 70 && Beta <= 84)
                {
                    System.out.print("Your grade is an A");
                }
                    else if (Beta >= 60 && Beta <= 69)
                    {
                        System.out.print("Your grade is a B, you don't deserve to live!");
                    }
                        else if (Beta >= 50 && Beta <= 59)
                        {
                            System.out.print("Your grade is a C, kill yourself!");
                        }
                            else if (Beta <= 49 && Beta >= 0)
                            {
                                System.out.print("You are a failure.");
                            }
                                else System.out.print("Nice Try Kid, Enter Your Actual Marks.");

            }

    }

}
