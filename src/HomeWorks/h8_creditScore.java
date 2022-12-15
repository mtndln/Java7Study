package HomeWorks;

public class h8_creditScore {
    public static void main (String[] args){
        /*
        write a code where it check the credit score for a person.
The code should have First Name, Last name and Credit Score of a person. (think about what datatype of variables you need to use)
If a person have a credit score less then 500 == > print "<person First Name>  <Person Last Name> has Bad Credit Score"
if a person have credit between 500-700 ==> print "<person First Name>  <Person Last Name> has Average Credit Score"
if a person have credit between 700-750 ==> print "<person First Name>  <Person Last Name> has Good Credit Score"
if a person have credit between greater than 750==> print "<person First Name>  <Person Last Name> has Great Credit Score"
         */

        String firstName = "Justin";
        String lastName = "Humber";
        double creditScore = 750;

        if(creditScore < 500 ){
            System.out.println(firstName+" has Bad Credit Score");
        }else if(creditScore >= 500 && creditScore <= 700){
            System.out.println(firstName+" "+lastName+" has Average Credit Score");
        }else if(creditScore >= 700 && creditScore <=750 ){
            System.out.println(firstName+" "+lastName+" has Good Credit Score");
        }else{
            System.out.println(firstName+" "+lastName+" has Great Credit Score");
        }
    }
}
