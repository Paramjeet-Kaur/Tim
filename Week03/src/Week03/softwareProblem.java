
package Week03 ;

import java.util.Scanner;

public class softwareProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("How many software do you want?" );
		int numsoftware= Keyboard.nextInt();
		double discount=0;
		
		if(numsoftware >= 10 && numsoftware<=19)
		{
			//discount 20%
			discount = 0.20;
		}
		else if (numsoftware>=20 && numsoftware >=49)
		{
			discount= 0.30;
		}
		
		
		//calculate the discount
		//show the output
			double subtotal =99* numsoftware;
			double discountedamount= subtotal * discount;
			double finalamount= subtotal - discountedamount;
			
			
		
		//--discount amount
		//--total
			System.out.println("subtotal: $" +subtotal);
			System.out.println("discount: $" +discountedamount);
			System.out.println("Final Amount: $" +finalamount);
			System.out.printf("Final Amount: $ %.2f \n" ,finalamount); //if u want 2 decimal points
	}

}
