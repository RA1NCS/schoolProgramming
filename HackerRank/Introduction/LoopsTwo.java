package HackerRank.Introduction;

import java.util.*;
import java.io.*;

class LoopsTwo {
    public static void main(String []argh){

        Scanner userInput = new Scanner(System.in);

        int t = userInput.nextInt();

        for (int i = 0; i < t ; i++) {

            int a = userInput.nextInt();
            int b = userInput.nextInt();
            int n = userInput.nextInt();
            
            for (int j = 0; j < n ; j++) {

                a = a + ((int)Math.pow(2 , j) * b);

                System.out.print(a + " ");
            }

            System.out.println("");
        
        }
        
        userInput.close();

    }
}
