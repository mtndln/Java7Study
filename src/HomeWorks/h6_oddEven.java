package HomeWorks;

public class h6_oddEven {
    public static void main(String[] args) {
        /*
        Write a code where it has a variable int data type name Number:
check if the number is Even or Odd ( PS. If a number can be divided by 2 (0 remainder) it is even)
if number is even == > print "The number is even"
If it is not even then print "The number is odd"
         */

        int Number = 53;
        if(Number%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
