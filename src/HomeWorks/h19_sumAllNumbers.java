package HomeWorks;

import java.util.Scanner;

public class h19_sumAllNumbers {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number and check for every number between 0 to that number
        to see how many numbers between 0 to that number can be divided to 3 and 5 and sum all those numbers, Print the result
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num= scan.nextInt();

        int sum=0;
        for (int i = 0; i < num; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Divided 3 and 5: "+ i);  // to check the all the numbers can be divided by 3 and 5
                sum=sum+i;   // I'm increasing all the numbers out of the forLoop
            }

        }
        System.out.println("Sum of all number: "+sum); //
    }
}
