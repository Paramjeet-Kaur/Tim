import java.util.Scanner;
public class practice_Average {

	public static void main(String[] args) 
	{
		Scanner Keyboard=new Scanner(System.in);
		
		System.out.println("Enter the score 1");
		float num1=Keyboard.nextFloat();
		
		System.out.println("Enter the score 2");
		float num2=Keyboard.nextFloat();
		
		System.out.println("Enter the score 3");
		float num3=Keyboard.nextFloat();
		
		float average=(num1+num2+num3)/3;
		System.out.println("average of three numbers is " +average);
	
	
		

	}

}
