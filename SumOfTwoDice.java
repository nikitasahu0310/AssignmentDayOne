package assignment.Day1;

import java.util.Random;

public class SumOfTwoDice {

	public static void main(String[] args) {
		Random random=new Random();

		int dice1=random.nextInt(6)+1;//+1 ensures that the generated values are in the range 1 to 6 (inclusive), excluding 0
		int dice2=random.nextInt(6)+1;
		int sum = dice1+ dice2;
		System.out.println("first dice: "+dice1);
		System.out.println("Second dice: "+dice2);
		System.out.println("sum of two dice: "+sum);
	}

}
