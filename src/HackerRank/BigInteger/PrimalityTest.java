package HackerRank.BigInteger;

import java.math.*;
import java.util.*;

public class PrimalityTest {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        BigInteger Alpha = userInput.nextBigInteger();

        userInput.close();

        System.out.println(primeCheck(Alpha));

    }

    public static String primeCheck (BigInteger Alpha) {

        String returnValue;

        if (Alpha.isProbablePrime (1)) {

            returnValue = "prime";

        } else {

            returnValue = "not prime";

        }

        return returnValue;

    }

}
