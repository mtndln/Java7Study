package Practice;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {

        //Arrays.toString
        int [] numbers = {12,34,56,78,90};
        /*

        for (int i = 0; i <numbers.length ; i++) {      ==> Instead of doing this we''ll use Arrays.toString
            System.out.println(numbers[i]);
        }
         */

        System.out.println("All the elements in Array "+ Arrays.toString(numbers));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Arrays.sort ==> doesn't return anything

        int[] numb = {34,56,78,90};
        Arrays.sort(numb);
        System.out.println("The numb array is now: "+Arrays.toString(numb));


    }
}
