package HomeWorks;

import java.util.Scanner;

public class h12_studentPoint {
    public static void main(String[] args) {
        /*
        -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
- based on the point the code should automatically determine the grade of Student with the full name of the student
- This should be done for each student
- Assuming we do not know how many student are there but your code should still handle this situation
-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
- When the point is between 90 to 100 the grade should be A
- When the point is between 80 to 90(excluded) the grade should be B
- When the point is between 70 to 80(excluded) the grade should be C
- When the point is between 60 to 70 (excluded) the grade should be D
- When the point is less than 60 the grade should be F
- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
         */

        Scanner student = new Scanner(System.in);
        System.out.print("Please enter Student's first name: ");
        String nameFirst = student.next();
        System.out.print("Please enter Student's last name: ");
        String nameLast = student.next();
        System.out.print("Please enter Student's exam result: ");
        double result = student.nextDouble();

        if(result <= 90 && result >= 100){
            System.out.println("First Name : " + nameFirst + " Last Name : " + nameLast + " Grade : A");
        }else if(result >= 80 && result < 90){
            System.out.println("First Name : " + nameFirst + " Last Name : " + nameLast + " Grade : B");
        }else if(result >= 70 && result < 80){
            System.out.println("First Name : "+ nameFirst + "Last Name : "+ nameLast + " Grade : C");
        }else if(result >=60 && result < 70){
            System.out.println("First Name : "+ nameFirst + "Last Name : "+ nameLast + " Grade : D");
        } else if (result <60) {
            System.out.println("First Name : "+ nameFirst + "Last Name : "+ nameLast + " Grade : F");
        }else{
            System.out.println("You entered invalid number");
        }

    }
}

