package Practice;

import java.util.Arrays;

public class MultiDimensionArrayForLoop {
    public static void main(String[] args) {
        String[] names = {"Strawberry", "banana", "Watermelon", "Blueberry"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("The name is: " + names[i]);
        }
        System.out.println("+++++++++++++++++++++");
        for (String name : names) {
            System.out.println("The name is: " + name);

        }
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int num : numbers) {
            System.out.println("The number is in Array: " + num);
            sum = sum + num;
        }
        System.out.println("The sum all numbers is: " + sum);

        System.out.println("++++++++++++++++++++");

        int[] number = {1, 2, 3, 4, 5, 6, 7};
        for (int a:number) {
            if(a%2==0){
                System.out.println("Number "+a+" is even");
            }else{
                System.out.println("number is "+a+" odd");
            }

        }

    }

}
