package HomeWorks;

import java.util.Scanner;

public class h11_quantity {
    public static void main(String[] args) {

           /*
        Write a Revenue program,
         Where user enters the quantity of the products sold and  the price for each product.
         Then Calculate he revenue based on giving information (hint: Revenue = quantity x price)
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the quantity of the  products sold");
        double quantity = scn.nextDouble();
        System.out.println("Please enter the price for each product");
        double price = scn.nextDouble();
        double revenue = quantity*price;

        System.out.println("The total revenue is: "+revenue);
    }
    }

