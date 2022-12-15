package HomeWorks;

import java.util.Scanner;

public class h15_StringMethods {
    public static void main(String[] args) {
        /*
        Write a Code where user is being asked to enter a sentence
if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a" replace second and fourth characters with "G"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sent = scan.nextLine();

        if(sent.startsWith("B") || sent.endsWith("b") || sent.endsWith("E") || sent.startsWith("e") && sent.contains("A") || sent.contains("a")){
            String result = sent.substring(0,1)+"G"+sent.substring(2,3)+"G"+sent.substring(4);
            System.out.println("Replaced name is: "+result);
        }
    }
}
