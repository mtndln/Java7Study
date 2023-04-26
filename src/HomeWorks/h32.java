package HomeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class h32 {
    public static void main(String[] args) {


    /*
    //Write   a     program   to   with following requirements
1) user should be prompted about how many numbers is going to be entered
2) User should be prompted for the values of the numbers
3) Reverse the all the given numbers and print it
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter how many numbers that you want in the array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the: "+(i+1));
            int values = scan.nextInt();
            numbers[i] = values;
        }
        System.out.println("Array \'values\' reversed order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }


    }
}