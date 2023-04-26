package HomeWorks;

import java.util.Scanner;

public class h24_Palindrome {
    public static void main(String[] args) {
        /*
        Write a code where user is being asked to enter a String and that checks if the String is Palindrome
PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
 such as madam or racecar. (Java, or Ziya or Cat are not palindrome)
(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together)
         */


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a word for checking :");
        String word1 =scan1.nextLine();
        String newword="";
        char ch;

        for (int i = 0; i <word1.length() ; i++) {
            ch=word1.charAt(i);
            newword = ch+newword;

        }
        if (newword.equals(word1)){
            System.out.println(word1+" is a palindrome word");
        }else {
            System.out.println(word1 + " is not a palindrome word");
        }
    }
    }





