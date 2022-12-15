package Practice;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        //Write  a code with following requirements
        //user should be asked about how many numbers that is going to add to array
        //User should be asked for each element for the array
        //find the sum of all the elements in array

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number that you'd like to add");
        int size = scan.nextInt();
        double[] numbers = new double [size];

        double sum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Please enter the "+(i+1)+" number: ");
            double num = scan.nextDouble();
            numbers[i]= num;
            sum= sum+numbers[i];
        }
        System.out.println("The sum of the all numbers in array "+sum);
    }
}
