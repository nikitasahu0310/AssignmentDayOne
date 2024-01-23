package assignment.Day1;

import java.util.Scanner;

public class PrintOrderDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order Id:");
        int orderId=sc.nextInt();
        System.out.println("Enter the item name:");
        String itemName=sc.next();
        System.out.println("Enter the item Quantity:");
        int quantity=sc.nextInt();
        System.out.println("Enter the cost:");
        double cost=sc.nextDouble();
        System.out.println("Order "+orderId+" :"+ quantity+" of"+" "+itemName+" for a total of Rs "+cost);
        
	}

}
