package HomeWorks;

import Practice.Array;

public class h28_Array {
    public static void main(String[] args) {
        /*
        Write a code with following requirements:
- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
- Print the minimum number in the given array
         */
        int[] Array = {6,7,2,3,90,-2,-90,-122,96,35};
        int min = Array[5];   // to compare any value in the array no matter what you assign here
                              // = Integer.MIN_Value
        for (int i = 0; i <Array.length ; i++) {
            if(min>Array[i]){
                min= Array[i];
            }
        }
        System.out.println("The min value is "+min);
    }
}
