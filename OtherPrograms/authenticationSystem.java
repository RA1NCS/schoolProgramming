import java.util.HashMap;
import java.util.Scanner;

public class authenticationSystem {

    public static void main (String[] args) {

        HashMap <String, String> javaDataBase = new HashMap <String, String>();
        Scanner userInput = new Scanner(System.in);

        javaDataBase.put ("Alpha", "Beta");
        javaDataBase.put ("Gamma", "Delta");
        javaDataBase.put ("Zeta", "Theta");
        javaDataBase.put ("Sigma", "Sine");
        javaDataBase.put ("Cosine", "Tangent");

        System.out.println("Would you like to login, or register?");

        System.out.print("I would you like to: ");

        String homePage = userInput.nextLine();

        if (homePage.equals("Login") || homePage.equals("login")) {

            System.out.print(
                "Please Enter Your Username: ");

            String loginUsername = userInput.nextLine(); // Login Username Input
    
            if (javaDataBase.containsKey(loginUsername)){
    
                System.out.print("Please Enter Your Password: ");

                String loginPassword = userInput.nextLine(); // Login Password Input
    
                if (javaDataBase.containsValue(loginPassword)){
    
                    System.out.println("Credentials are verified, please continue to open this link in your browser: https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    
                } else {
    
                    System.out.println("Authentication failed, please run the program again.");
    
                } 
    
    
            } else {
    
                System.out.println("Username is not found in our database, Please enter a valid username.");
    
            }

        }

        else if (homePage.equals("Register") || homePage.equals("register")) {

            System.out.print("Please enter your desired username here: ");

            String regUsername = userInput.nextLine(); // Registration Username Input
            
            if (javaDataBase.containsKey(regUsername)) {

                System.out.println("This username is already taken, please re-run the program in order to register again.");

            }

            else {

                System.out.print("Please enter your desired password here: ");

                String regPassword = userInput.nextLine(); // Registration Password Input
    
                javaDataBase.put (regUsername, regPassword);
                
                if (javaDataBase.containsKey(regUsername)) {
    
                    System.out.println("Registration Successful! \nPlease continue to login by re-running the program.");
                    
                }

            }

        }

        else 

        {

            System.out.println("Please choose a valid option, " + homePage + " is not a valid option.");

        }

    userInput.close();
        
    } // mainMethod

} // publicClass