package HomeWorks;

import java.util.Scanner;

public class h21_square {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number:
Calculate the square of all the numbers from 0 to given number and
print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        int result = 0;
        for (int i = 0; i < num ; i++) {
            result = i*i;
            System.out.println("All number between 0 to given number: "+i);
        }

    }
}
