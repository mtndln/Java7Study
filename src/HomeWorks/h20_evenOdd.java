package HomeWorks;

import java.util.Scanner;

public class h20_evenOdd {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number.
Find the sum of all the even numbers between 0 to that number (included)
Find the sum of all the odd numbers between 0 to that number (included)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < number ; i++) {
            if( i%2 == 0){
                sumEven+=i;
            }else{
               sumOdd+=i;
            }
        }
        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("sumOdd of odd numbers = " + sumOdd);
    }
}
