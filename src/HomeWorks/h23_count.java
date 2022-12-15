package HomeWorks;


import java.util.Scanner;

public class h23_count {
    public static void main(String[] args) {
        /*
        Write a program where the user is being asked to enter a String and that   will   count   how   many   times   "a" or 'A'   is   found   in that entered String
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str = scan.nextLine();

        int counta = 0;
        int countA = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 'a'){
                counta++;
            }else if(str.charAt(i) == 'A'){
                countA++;
            }
        }
        System.out.println("There are "+counta+" 'a' and "+countA+" 'A' in the given String");
    }
}
