package HomeWorks;

import java.util.Scanner;

public class h26_Reverse {
    public static void main(String[] args) {
        /*
        Write a code where it ask user to enter an integer number
- Reverse the given number and print the result
- Example input ( 5678 )
- Example output ( 8765 )
         */

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan1.nextInt();
        int remainder, revNum = 0;

        while(num > 0){
            remainder = num%10;   // for last digit
            num = num/10;
            revNum = (revNum*10)+remainder;  // for every each iteration
        }
        System.out.printf("Reversed number is %d",revNum);
    }
}