package Practice;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {

        //Arrays.toString
        int [] numbers = {12,34,56,78,90};
        /*

        for (int i = 0; i <numbers.length ; i++) {      ==> Instead of doing this we''ll use Arrays.toString
            System.out.println(numbers[i]);
        }
         */

        System.out.println("All the elements in Array "+ Arrays.toString(numbers));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Arrays.sort ==> doesn't return anything

        int[] numb = {34,56,78,90};
        Arrays.sort(numb);
        System.out.println("The numb array is now: "+Arrays.toString(numb));

        System.out.println("+++++++++++++++++++++++++++++++");

        String names = "Ziya Hrakar NIlufer Sena";
        System.out.println("The string name is: "+names);
        String [] nm = names.split(" ");
        System.out.println("nm contains: "+Arrays.toString(nm));
        System.out.println("the length od nm array is: "+nm.length);

        String nums = "1234567619871";
        String [] number = nums.split("1");
        System.out.println("the number array is: "+Arrays.toString(number));

        String forbid = "Thisisjust a Test";
        String [] ts = forbid.split(""); // you cannot use (*,?,+) on the split)
        System.out.println(Arrays.toString(ts));

        String var2 = "THISISATESTFORALI";
        String [] test = var2.split(" ",10);
        System.out.println("The test array is: "+Arrays.toString(test));


        


    }
}
