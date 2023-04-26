package Practice;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //Multidimensional Arras are basically array inside of array
        //names = {{"Ziya","John","Eloise"},{"Anil","Rami"}

        int[][] numbers = {{3,4,5,6,7,8},    {8,7,3,4,1,0,-123},    {90,23,145,109,107}};

        ///                   index 0           index1                    index2

        int a = numbers[0][1];
        System.out.println("number a is: "+a);
        System.out.println("the number is: "+numbers[1][6]);

        int len = numbers.length;
        System.out.println("The length of outer Array is: "+len);
        System.out.println("the numbers array is: "+numbers[2]);

        //Define Multi Array
        int[][] number = new int[2][3]; //==> {{0,0,0},{0,0,0}}
        System.out.println("The numbers array: "+ Arrays.deepToString(number));

    }
}
