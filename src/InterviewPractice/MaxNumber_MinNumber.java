package InterviewPractice;

public class MaxNumber_MinNumber {
    // write a method where it gets an Array of int
    // as input parameter and returns to the max number in array


    public static int MaxNUm(int [] num){

     int max = num[0]; // must start from the first index
        for (int a:num) {
            if(max<a){
                max = a;
            }
        }
        return max;

    }

    public static int MinNum(int [] num1){

        int min = num1[0];
        for (int b:num1) {
            if(min>b)
                min = b;

        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr1 = { -90,-30,-20,0};
        int maximum = MaxNUm(arr1);
        System.out.println("The maximum number int the array is: "+maximum);

        System.out.println("**************************");

        int added = MaxNUm(arr1)+10;
        System.out.println("The added version is: "+added);

        System.out.println("**************************");

        int [] arr2 = {-15,-35,-45};
        int minimum = MinNum(arr2);
        System.out.println("The minimum number in the array is: "+minimum);

    }
}