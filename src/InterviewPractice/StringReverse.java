package InterviewPractice;

public class StringReverse {

    public static String ReversedString(String name){

        String reversed ="";

        for (int i = name.length()-1; i>=0; i--) {
            reversed+=name.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReversedString("Dilan");
    }
}
