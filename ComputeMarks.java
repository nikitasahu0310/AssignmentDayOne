package assignment.Day1;

import java.util.Scanner;

public class ComputeMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		String name=sc.nextLine();
		System.out.println("Enter Physics marks:");
		double phyMarks=sc.nextDouble();
		System.out.println("Enter chemistry marks:");
		double chemMarks=sc.nextDouble();
		System.out.println("Enter Mathematics marks:");
		double mathMarks=sc.nextDouble();
		
		double totalmarks=phyMarks+chemMarks+mathMarks;
		double phyPercentage=(phyMarks/100.0)*100;
		double chemPercentage=(chemMarks/100.0)*100;
		double mathPercentage=(mathMarks/100.0)*100;
		double totalPercentage=(totalmarks/300.0)*100;
		
		System.out.println(name+"  obtained following % of marks in PCM:");
		System.out.println("Physics: ["+phyPercentage+"%], Chemistry: ["+chemPercentage+"%], Maths: ["+mathPercentage+"%]");
		System.out.println("Total: ["+totalPercentage+"%]");
		
		

	}

}
