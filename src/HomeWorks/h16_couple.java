package HomeWorks;

import java.util.Scanner;

public class h16_couple {
    public static void main(String[] args) {
        /*
        Write a code where it meets the below requirements
- a couple just got married and goes to city hall to get their last name changed
- the officer who works there asks the couple about their first name and last name for each
- also asks if they want to use the same last name or keep their original last names ( for the same last name you can use either one of them)
- based on the answer print the couples first names and last names
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter lady first name ");
        String ladyName = scan.next();
        System.out.println("Please enter the lady last name");
        String ladyLastName = scan.next();

        System.out.println("please enter the man first name");
        String manName = scan.next();
        System.out.println("Please enter the man last name");
        String manLastName = scan.next();

        System.out.println("Do you want to use the same last name? if yes please enter 1, if no please enter 2");
        String changedOrNot = scan.next();

        int name = 1;

        if (name == 1) {
            System.out.println("Lady's first and last name " + ladyName + " " + manLastName+" "+"Mans name and lastname is "+manName+" "+manLastName);

        }else{
            System.out.println("Lady's first and last name " + ladyName + " " + ladyLastName+" "+"Mans name and lastname is "+manName+" "+manLastName);

        }
    }
}