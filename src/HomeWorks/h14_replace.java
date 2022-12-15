package HomeWorks;

import java.util.Scanner;

public class h14_replace {
    public static void main(String[] args) {
        /*
        Write a code where user is being asked to enter a name:
if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result
         */

        //Returns a string where a specified value is replaced with a specified value

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scanner.next();
        if (name.startsWith("A") && name.endsWith("L")) {
            System.out.println(name.replace("A","B"));
        }else{
            System.out.println("Sorry you entered Invalid name");

        }

    }
}
