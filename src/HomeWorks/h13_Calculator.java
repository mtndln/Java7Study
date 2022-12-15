package HomeWorks;

import java.util.Scanner;

public class h13_Calculator {
    public static void main(String[] args) {
        /*
        Write a calculator program by following instructions:
1) Ask the user to enter 1st number
2) Ask the user to enter second number
3) Ask the user to select the operation ( ask user to enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.)
4) based on the selection perform operation and print the result of the operation
(Ex. enter 1st number : 20
	enter 2nd number: 25
	Select operation  enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.: 1
	The result is : 45.)
         */


        // if you want to use this functions again, you need to use return methods
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any operation to have your result");
        int operation = scanner.nextInt();

        if(operation == 1){
            System.out.println(sum(20,25));
        }else if(operation == 2){
            System.out.println(subtraction(20,25));
        }else if(operation == 3){
            System.out.println(multiplication(20,25));
        }else if(operation == 4){
            System.out.println(division(20,25));
        }

    }

    public static int sum(int a, int b) {
        return (a+b);
        // what kind of data type are you using return that this value.(int)

    }
    public static int subtraction(int a , int b){
       return (a-b);

    }
    public static int multiplication(int a , int b){
        return (a*b);
    }
    public static int division(int a , int b){
        return (a/b);

    }

}
