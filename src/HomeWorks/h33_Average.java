package HomeWorks;

import java.util.Scanner;

public class h33_Average {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter for 5 employee salaries and store those salaries
Then find the average salary of those 5 employees
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 5 employee's salary ");

        double[] salary = new double[5];
        double sum = 0;

        for (int i = 0; i <salary.length; i++) {
            System.out.println("Please enter the annual salary for each person");
            salary[i] = scan.nextDouble();
            sum = sum + salary[i];
        }
        double average = sum/5;
        System.out.println("Average of the salary for each person: "+average);
    }
}
