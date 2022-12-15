package HomeWorks;

import java.util.Scanner;

public class h9_Scanner {
    public static void main(String[] args){
        /*
        Write a code where User is being asked for the first number, second number and third number. Then Compare those number print the maximum number.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int a = scan.nextInt();
        System.out.println("Please enter the second number");
        int b = scan.nextInt();;
        System.out.println("Please enter the third number");
        int c = scan.nextInt();


        if(a>b && a>c){
            System.out.println("The max number is: "+a);
        }else if(b>a && b>c){
            System.out.println("The max number is: "+b);
        }else if(c>a && c>a){
            System.out.println("The max number is: "+c);
        }else{
            System.out.println("Numbers are equals");
        }


    }
}
