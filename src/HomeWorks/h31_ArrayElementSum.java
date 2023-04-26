package HomeWorks;

import java.util.Scanner;

public class h31_ArrayElementSum {
    public static void main(String[] args) {
        /*
        Write   a   program   that   creates   an   array   of   10   elements   size.
 Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
array   elements. ( we already did this in the class but try to do it again)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number that you'd like to add to array ");
        int size = scan.nextInt();
        double[] numbers = new double[size];

        double sum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Please enter the "+(i+1));
            double num = scan.nextDouble();
            numbers[i] = num;
            sum = sum +numbers[i];
        }
        System.out.println("The sum of all number is: "+sum);

    }

}
