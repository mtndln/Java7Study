package Practice;

public class forLoop {
    public static void main(String[] args) {
        //Write a code where you find the even numbers between 10 - 120(not included)

        int countEven = 0;
        for (int i = 10; i < 120 ; i+=2) { // if i start i = 11 , it's gonna count odd numbers
            countEven++;
            System.out.println("even numbers between 10 to 120 "+i); // to find which number are even between 10-120
            // inside for loop
        }
        System.out.println("there are "+countEven+" even numbers between 10 to 120"); // but if you want to see sum or how many number are even between thoose number out of for loop

        int countOdd = 0;
        for (int i = 11; i < 120; i+=2) {
            countOdd++;
        }
        System.out.println("there are "+countOdd+" odd numbers between 10 to 120");
    }
}
