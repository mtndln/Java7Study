package HomeWorks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class h17_allStringMethods {
    public static void main(String[] args) {

        /*
        First create one string and copy paste below paragraf.
And make modifications on the given paragraph listed below.
Make sure to create multiple string with each sentence from given paragraph
Make sure each sentence start with upper case letter.
Make sure city name start with the capital letter.
Make sure the rest of the letters are lower case.
Make sure to change the name, age and city information based on your information
make sure to get rid of the empty spaces in front and end of the sentences.
after you make the modification check each sentense’s length
Print each sentence and make sure they are correctly modified.
Print 1st, 4th and 5th indexed characters for each sentence
At the end combine all the sentence to get proper paragraph with modified sentences
         */

      /*
      hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.
       I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,
      finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.
        I designed and DEVELoped many automation test cases using BDD FRamework.
       */
        String para = " hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.   I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.";
        Scanner input = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = input.next();

        String myName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Your age: ");
        String age = input.next();
        String myAge = age.substring(0, 1).toUpperCase() + age.substring(1).toLowerCase();

        System.out.println("Your city: ");
        String city = input.next();
        String myCity = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();

        String[] sentence = para.split("[.]");
        String paragraph = "";
        for (int a = 0; a < sentence.length; a++) {
            String aTrim = sentence[a].trim();
            String sentences = aTrim.substring(0, 1).toUpperCase() + aTrim.substring(1).toLowerCase() + ".";
            String updatedSentences = sentences.replace("<yourname>", myName).replace("<yourage>", myAge).replace("<yourcity>", myCity);
            int lengthSentences = updatedSentences.length();
            String chars = updatedSentences.charAt(0) + ", " + updatedSentences.charAt(3) + ", " + updatedSentences.charAt(4);
//            ArrayList <String> newPara= new ArrayList<>();
//
////            String [] newPara ;
//            for(int i=0;i<sentence.length;i++){
//                newPara = updatedSentences[i] + " ";
//            }
//            System.out.println(newPara);
            System.out.println(updatedSentences + "This sentence has: " + lengthSentences + " characters, and first, third, fifth letters are: " + chars);
            paragraph = paragraph + updatedSentences;
        }
        System.out.print(paragraph);

    }
    }
