package Practice;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any name that you want to reverse");
        String name = scan.nextLine();

        String reverse ="";  //
        for (int i = name.length()-1; i >= 0 ; i--) {  //start from the last index until you come to first index
            reverse = reverse + name.charAt(i);  //it's going to go until end

        }
        System.out.println("The reverse of the given name is: "+reverse);



    }
}
