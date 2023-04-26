package Practice;

import java.util.Arrays;

public class MultiArrayExample {

    public static void main(String[] args) {
        //define a 2D array with size of 2,4 respectively
        //assign all the odd numbers starting from 1 as elements to the array:

        int [][] odds = new int[2][4];//{{0,0,0,0},{0,0,0,0}}

        int start = 1;
        for (int i = 0; i < odds.length; i++) {
           // int start = 1;
            for (int j = 0; j < odds[i].length ; j++) {
                odds[i][j]=start;  //{{1,1,1,1},{1,1,1,1}}
                start=start+2;     //1,3,4,7,9
            }
        }
        System.out.println("the odds array is: "+ Arrays.deepToString(odds));



    }
}
