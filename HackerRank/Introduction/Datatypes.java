package HackerRank.Introduction;

import java.util.*;
import java.io.*;

class Datatypes {
    public static void main(String []argh) {

        Scanner userInput = new Scanner(System.in);
        int t = userInput.nextInt();

        for (int i = 0 ; i < t ; i++) {
            try {
                long x = userInput.nextLong();

                System.out.println (x + " can be fitted in:");

                if (x >= -128 && x <= 127) System.out.println ("* byte");
                if (x >= -(Math.pow(2, 15)) && x <= (((Math.pow(2, 15)) - 1))) System.out.println ("* short");
                if (x >= -(Math.pow(2, 31)) && x <= (((Math.pow(2, 31)) - 1))) System.out.println ("* int");
                if (x >= -(Math.pow(2, 63)) && x <= (((Math.pow(2, 63)) - 1))) System.out.println ("* long");

            }

            catch(Exception e)

            {

                System.out.println(userInput.next() + " can't be fitted anywhere.");

            }

        }
    }
}
