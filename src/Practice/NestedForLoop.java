package Practice;

public class NestedForLoop {
    public static void main(String[] args) {

        //You have 3 different fruit each have 10. you want to give 10 people equally each one of the fruit
        // assume you have 10 kids and, you will give them one of every each fruit

        for (int i = 0; i < 3; i++) {
            System.out.println("The distribution is: " + i);
            for (int j = 0; j < 10; j++) {  // each fruit for 10 kid
                System.out.println("Fruit: " + i + " for the kid: " + j);
            }
        }
        System.out.println("The fruit are distributed");
    }
}
