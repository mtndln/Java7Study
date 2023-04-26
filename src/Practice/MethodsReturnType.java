package Practice;

public class MethodsReturnType {


    public static String Name(int a , int b){
        if (a>b){
            return "Mars";
        }else if(b>a){
            return "Lina";
        }else{
            return "Mira";
        }
    }
    public static void Count(int [] name){
        System.out.println("The count items in the array is: "+name.length);
        Sum(name);
    }

    public static void Sum(int [] name1){
        int sum = 0;
        for (int a : name1){
            sum = sum+a;

        }
        System.out.println("The items in the array is: "+sum);
    }

    public static void main(String[] args) {

        int [] arr = { 3,4,5,6,7,8,9};
        Count(arr);
       // Sum(arr);
        System.out.println("***********************************");
        String name = Name(8,9);
        System.out.println(name);
    }
}
