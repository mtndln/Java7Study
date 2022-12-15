package Practice;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        //Write a code where user being asked to enter 2 numbers and
        //find how many even numbers are in between those 2 numbers

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number"); // Assuming firstNum smaller than second number
        int firstNum = scan.nextInt();;
        System.out.println("Please enter the second number");
        int secondNum = scan.nextInt();

        int count = 0;
        while(firstNum < secondNum){

            if(firstNum%2 == 0){
                count++;
            }
            firstNum++;          // if you don't increase the firstNum this loop will infinite

        }
        System.out.println("The count of numbers is "+count);

        System.out.println("==============================================");

        String name = "Nawras";
        int i = 0;

        while(i<name.length()){
            if(name.charAt(i)=='a'){
                break;
            }
            System.out.println("The char at index " +i+" is: "+name.charAt(i));
            i++;

        }

        //print all the numbers between 1 and 10 except number 5,8,2

        int i1 = 1;

        while(i1 < 10){

            if(i1 == 5 || i1==8 || i1==2) {
                i1++;
                continue;
            }
            System.out.println("The all numbers between 1 to 10: "+i1);
            i1++;

        }
        System.out.println("==========================");

        // print all the chars in the string "Nawras" except char 'a'

        String name1 = "Nawras";
        int j = 0;
        while(j < name1.length()){
            if(name1.charAt(j) == 'a'){
                j++;
                continue;
            }
            System.out.println("the rename is: "+name1.charAt(j));
            j++;   // if you don't increase the starting point here , it will go until infinite

        }




    }
}
