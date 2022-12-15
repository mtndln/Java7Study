package Practice;

public class ArrayEx2 {
    public static void main(String[] args) {
        //Swap
        //create dummy or temp variable

        String [] fruits ={"Banana","Cherry","Watermelon"};

        String dummy = fruits[2];
        fruits[2] = fruits[0];
        fruits[0] = dummy;


        System.out.println("{ "+fruits[0]+", "+fruits[1]+", "+fruits[2]+" }");


    }
}
