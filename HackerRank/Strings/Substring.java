package HackerRank.Strings;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String stringOne = userInput.next();
        int startNumber = userInput.nextInt();
        int endNumber = userInput.nextInt();

        String printString = stringOne.substring(startNumber, endNumber);
        
        System.out.println(printString);

    }

}
