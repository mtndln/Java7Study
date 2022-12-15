package HomeWorks;

import java.util.Scanner;

public class h27_duplicate {
    public static void main(String[] args) {
        /*
        Write a code which asks user to enter a String and removes all the duplicate characters from the String and prints the result
ex. "AAAAAVVVCCDDAA" ==> "AVCD"
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String ");
        String name = scan.nextLine();
        String n = "";

        for (int i = 0; i <name.length() ; i++) {
            String str = "" + name.charAt(i);
            if(n.contains(str)){
                continue;
            }
            n = n+name.charAt(i);
        }
        System.out.println("The new String is: "+n);



    }
}