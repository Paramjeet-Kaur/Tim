import java.util.Scanner;
public class Practice_RecipiECalculator {

	public static void main(String[] args) 
	{
		Scanner Keyboard=new Scanner(System.in);
		System.out.println("how many timbits you want to make");
		double timbits = Keyboard.nextDouble();
		double sugar=(1.5/48)*timbits;
		double butter=(1.0/48)*timbits;
		double flour=(2.75/48)*timbits;
		System.out.println("Amount of sugar you will require is "+ sugar );
		System.out.println("Amount of butter you will require is "+ butter);
		System.out.println("Amount of flour you will require is "+ flour);
	
		System.out.println("\nENJOY YOUR TIMBITS!!");
	}

}
