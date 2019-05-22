package Week03;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter a number");
		int number = keyboard.nextInt();
		 //Add the numbers
		int total = 0;
		//finish the logic for adding
		for(int i =0;i<= number ; i++)
		{
			total = total + i;
		}
		System.out.println("Total is " +total);
		
		

	}

}
