
import java.util.Scanner;
public class Tim2 {

public static void main(String[] args)
{
Scanner Keyboard = new Scanner(System.in);
System.out.println("Enetr the first nmber");
float x=Keyboard.nextFloat();
System.out.println("enter 2 nummber");
float y = Keyboard.nextFloat();
System.out.println("Which opertaion do you want to perform?");
System.out.println("1.Addition");
System.out.println("2.Subtracton");
System.out.println("3.Multiplication");
System.out.println("4.Division");
int number = Keyboard.nextInt();
if(number==1)
{
float z=x + y;	
System.out.println("your sum is "+z);
}
else if(number==2)
{
float z=x - y;	
System.out.println("your subtraction is "+z);
}
else if(number==3)
{
float z=x * y;	
System.out.println("your mul is "+z);
}
else if(number==4)
{

float z=x / y;	
System.out.println("your division is "+z);
}
else
{
System.out.println("enter the number from given values");
}

}

}
