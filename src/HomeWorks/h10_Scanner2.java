package HomeWorks;

import java.util.Scanner;

public class h10_Scanner2 {
    public static void main (String[] args){

        /*
        Write a code where user is being asked to enter a number and based on the entered number print the number is positive, negative or zero
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scan.nextInt();

        if(number < 0 ){
            System.out.println("Number is negative");
        }else if(number == 0){
            System.out.println("Number is zero");
        }else if(number > 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Invalid number");
        }
    }
}
