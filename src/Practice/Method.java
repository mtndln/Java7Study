package Practice;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Method {

    // write a method that has 3 input parameters and finds the max number between those 3 numbers

    public static void MyFunc(int a,int b,int c){
        int max =0;
        if(a>b && a>c){
            max = 0;
        }else if( b>c && b>c){
            max=b;
        }else{
            max=c;
        }
        System.out.println("The Max number is: "+max);
    }

    public static void PrintName(String name){
        System.out.println("The name is : "+name);
    }

    public static void PrintName1(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("The name is : Mira");

        }
    }


    public static void main(String[] args) {
        MyFunc(9,18,27);

        System.out.println("*****************************");

        for (int i = 0; i < 10 ; i++) {
            PrintName("Dilan");

        }
        System.out.println("****************************");
        PrintName1(4);


    }
}
