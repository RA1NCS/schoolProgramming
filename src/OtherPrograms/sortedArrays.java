package OtherPrograms;

public class sortedArrays {

    public static void main(String[] args) {

        int[] arrayOne = {1,2};
        int[] arrayTwo = {3,4};

        double finalMedian = findMedianSortedArrays(arrayOne, arrayTwo);

        System.out.println(finalMedian);


    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double finalAnswer = ((medianOfArray(nums1) + medianOfArray(nums2)) / 2);
        return finalAnswer;

    }

    public static String checkOddEven(int s) {

        String oddEven;

        if (s % 2 == 0) {

            oddEven = "even";

        } else if (s % 2 == 1) {

            oddEven = "odd";

        } else {

            oddEven = "unknown";

        }

        return oddEven;

    }

    public static double lengthOfArray (int[] nums) {

        return (nums.length);

    }

    public static double medianOfArray(int[]nums) {

        int arrayIndex1;
        int arrayIndex2;
        double EvenArrayFirstNum = ((lengthOfArray(nums)) / 2);
        double median = 0.0;

        if (checkOddEven(nums.length).equals("odd")) {

            arrayIndex1 = (int) (EvenArrayFirstNum - 0.5);
            median = nums [arrayIndex1];

        } else if (checkOddEven(nums.length).equals("even")) {

            arrayIndex1 = (int) (EvenArrayFirstNum - 1);
            arrayIndex2 = (int) EvenArrayFirstNum;

            median = ((nums[arrayIndex1]) + (nums[arrayIndex2])) / 2;

        } else {

            arrayIndex1 = 0;
            arrayIndex2 = 0;
            median = 0.0;

        }

        return median;


    }


}

// 0 1 2 3 4 5 6 7 8
