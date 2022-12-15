package Practice;

import java.util.Scanner;

public class ForLoopContinue {
    public static void main(String[] args) {
        // We use continue key word to disregard that iteration when certain condition are met


        for (int i = 0; i < 10; i++) {

            if(i == 5){
                continue;
            }
            System.out.println("The i value for each iteration "+i);
        }

        // Write  a code where user is being asked to enter a name restructure the name to not contain "H" or 'h"
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scan.nextLine();

        String rename= "";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'h' || name.charAt(i) == 'H'){
                continue;
            }
            rename = rename+name.charAt(i);
        }
        System.out.println("The rename is "+rename);

    }
}
