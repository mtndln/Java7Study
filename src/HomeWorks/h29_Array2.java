package HomeWorks;

import java.util.Arrays;

public class h29_Array2 {
    public static void main(String[] args) {
        /*
        write a code with following requirements
- define an array with following values {90,34,23,87,45,36,98}
- Print the values that can be divided by 2 or 3
         */
        int[] Array = {90, 34, 23, 87, 45, 36, 98};

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0 || Array[i] % 3 == 0) {
                System.out.println(Array[i] + " can be divided by 2 or 3.");
            }
        }

    }

}

