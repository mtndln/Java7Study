package Practice;

import java.util.Scanner;

public class ForLoopBreak {
    public static void main(String[] args) {
        //break
        // we use the break statement inside forLoop when the certain conditions is met.


        //write a code where when speed limit is hit, stabilize the speed at the speed limit
        // the speed limit is 75

        int speed = 0;
        for (int i = 0; i <170 ; i++) {
            speed = speed+1;  // this code will until 170
            if(speed==75){
                break;
            }
        }
        System.out.println("The speed limit is: "+speed);

        System.out.println("=======================================");

//         User being asked to enter a name restructure the name but as soon as it sees the "l" or "L" you should
//         stop restructure
//         KukuLi

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = scan.nextLine();

        String rename = "";
        for (int i = 0; i <name.length() ; i++) {
            // rename=rename+name.charAt(i); ==> if I provide my condition inside forLoop , it will add L or l
            if(name.charAt(i) == 'l' || name.charAt(i) == 'L'){
                break;
            }
           rename=rename+name.charAt(i);

        }
        System.out.println("The rename value is: "+ rename);
    }
}
