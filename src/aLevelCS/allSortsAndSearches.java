package aLevelCS;
import java.util.Scanner;

public class allSortsAndSearches {

    public static void main(String[] args) {
        int[] arrayUsed = {
        		-1, 
        		2,
				4, 
				5, 
				7, 
				12, 
				14, 
				17, 
				19
		};

        Scanner userInput = new Scanner(System.in);
        int toFind = userInput.nextInt();
        
        System.out.println(binarySearch(arrayUsed, toFind));

        insertionSort(arrayUsed);
        printArray(arrayUsed);
    }

    public static boolean linearSearch(int[] arrayUsed, int toFind) {
        for (int i : arrayUsed) if (toFind == i) return true;
        return false;
    }

    public static boolean binarySearch(int[] arrayUsed, int toFind) {
        try {
            int left = 0, right = arrayUsed.length, mid;
            boolean found = false;
            while (!found) {
                mid = (left + right) / 2;
                if (arrayUsed[mid] == toFind) return true;
                else if (arrayUsed[mid] > toFind) right = mid - 1;
                else if (arrayUsed[mid] < toFind) left = mid + 1;
            } return found;
        } catch (ArrayIndexOutOfBoundsException e) {return false;}
    }

    public static void bubbleSort (int[] arrayUsed) {
        for (int i = 0; i < arrayUsed.length - 1; i++) {
            for (int j = 0; j < arrayUsed.length - 1; j++) {
                if (arrayUsed[j] < arrayUsed[j + 1]) {
                    int temp = arrayUsed[j];
                    arrayUsed[j] = arrayUsed[j + 1];
                    arrayUsed[j + 1] = temp;
                }
            }
        }
    }

   public static void insertionSort (int[] arrayUsed) {
        for (int i = 1; i < arrayUsed.length; i++) {
            int previousValue = arrayUsed[i];
            while (i > 0 && arrayUsed[i - 1] < previousValue) {
                arrayUsed[i] = arrayUsed[i - 1];
                i--;
            }
            arrayUsed[i] = previousValue;
        }
   }

    public static void printArray (int[] arrayUsed) {
        for (int i : arrayUsed) System.out.println(i);
    }

}