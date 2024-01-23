package assignment.Day1;

import java.util.Scanner;

public class SpeedConversion {

	public static void main(String[] args) {
		double km,ms;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the type of conversion: \n 1. kilometers per hour (km/h) to meters per second (m/s) \n 2. meters per second (m/s) to kilometers per hour (km/h) ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.print("Enter speed in kilometers per hour (km/h): ");
            double speedKmh = sc.nextDouble();
            ms=speedKmh*1000/3600;
            System.out.println("speed in m/s: "+ms);
            break;
		case 2:
			System.out.print("Enter speed in meters per second (m/s): ");
            double speedMs = sc.nextDouble();
            km=speedMs*3600/1000;
            System.out.println("speed in km/h: "+km);
            break;
       default :
    	   System.out.println("Enter valid choice.");
    	   break;
		}

	}

}
