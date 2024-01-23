package assignment.Day1;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in seconds:");
		int totalSec=sc.nextInt();
		
		int hours=totalSec/3600;//1 hour=60min and 1min=60sec so in 1hr=3600sec ,dividing by 3600 gives you hour
		int min=(totalSec%3600)/60;//it calculate remaining seconds after removing hr and dividing this value by 60 gives the no of min
		int seconds = totalSec % 60;//it calculate remaining sec after the hour and min
		
		System.out.println(totalSec+" seconds = "+hours+" hours, "+min+" minutes, and "+seconds+" seconds");
	}

}
