package Practice;

import java.util.Arrays;

public class Combine2Arrays {
    // Write a method where it takes 2 int arrays
    //as input parameters and combine those 2 arrays and returns to 1 integer array

    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] combinedArray = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            combinedArray[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            combinedArray[index++] = arr2[i];
        }

        return combinedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] combinedArray = combineArrays(arr1, arr2);

        System.out.println(Arrays.toString(combinedArray)); // Output: [1, 2, 3, 4, 5, 6]
    }

}
