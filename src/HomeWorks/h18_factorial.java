package HomeWorks;




public class h18_factorial {
    public static void main(String[] args){
        /*
        Write a code where user is asked to enter an integer number:
Using the given number find the factorial of that number and Print the result.
example: 5 ==> 5! = 5*4*3*2*1 = 120
         */
        System.out.println("Factorial is: "+Factorial(5));
        System.out.println(Factorial(4));

    }

    public static int Factorial(int param1){

        int result = 1; //5*4*3*2*1

        for (int i = 1; i <= param1; i++) {
            result= result*i;
        }
        return result;
    }
}

