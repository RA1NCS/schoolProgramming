package HackerRank.Introduction;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        
            Scanner userInput = new Scanner(System.in);
            
            System.out.println("================================");
            for (int i = 0 ; i < 3 ; i++){
                
                String inVarString = userInput.next();
                int inVarInt = userInput.nextInt();
                
                System.out.printf("%-15s", inVarString);
                System.out.printf("%03d %n", inVarInt);
                
            }
            
            System.out.println("================================");

    }
}
