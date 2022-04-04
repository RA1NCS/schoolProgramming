package HackerRank.Strings;

import java.util.Scanner;

public class Tokens {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String sentenceInput = userInput.nextLine().trim();
        userInput.close();

        String[] sentenceArray = sentenceInput.split("[^\\p{Alpha}]+");

        int lengthOfArray = (sentenceInput.isEmpty()) ? 0 : sentenceArray.length;
        System.out.println(lengthOfArray);

        for (String s : sentenceArray) {
            System.out.println(s);
        }

    }

}
