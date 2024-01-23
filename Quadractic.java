package assignment.Day1;

import java.util.Scanner;

public class Quadractic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-efficient of a:");
		double a=sc.nextDouble();
		System.out.println("Enter co-efficient of b:");
		double b=sc.nextDouble();
		System.out.println("Enter co-efficient of c:");
		double c=sc.nextDouble();
		
		double delta= b*b - 4*a*c;
		if (delta > 0) {
			// real roots

			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("Root 1 of x:" + root1);
			System.out.println("Root 2 of x:" + root2);
		}else if(delta==0) {
			//real and identical root
			double root=-b/(2*a);
			System.out.println("Root of x:"+root);
			
		}else {
			//complex roots
			double realPart=-b/(2*a);
			double imagPart=Math.sqrt(Math.abs(delta)) / (2 * a);//math.abs returns positive value of delta
			System.out.println("Root 1 of x:" + realPart +" + "+imagPart+"i");
			System.out.println("Root 2 of x:" +realPart +" + "+imagPart+"i" );
		}
	}		
}
