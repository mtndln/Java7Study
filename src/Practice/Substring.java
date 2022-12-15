package Practice;

public class Substring {
    public static void main(String[] args) {

        String word = "BareFoot";
        //Index        01234567

        // substring to get r and roof

        String sub = word.substring(2,3);
        System.out.printf("Word contains %s%n",sub);

        String sub1 = word.substring(4,8);
        System.out.printf("Word contains %s",sub1);


        // which index you are looking for it will start from that index , and always +1 more to have index that you want to have.
    }
}
