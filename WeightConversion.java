package assignment.Day1;

import java.util.Scanner;

public class WeightConversion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double weightPound=sc.nextDouble();
		double weightKg=weightPound*0.45392;//1 pound=453.592gm
		System.out.println("weight in kilograms: "+weightKg +" kg");
		
	}

}
