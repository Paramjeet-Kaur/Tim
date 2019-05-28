import java.util.Scanner;
public class Param {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("enter the number of weeks");
		int weeks = Keyboard.nextInt();
		int days= weeks*7;
		int infected=0;
		for(int i=1; i<=days; i++)
		{
			if(i%2!=0)
			{
				if(i==1)
					infected=infected+1;
				if(i>1 && i<9)
					infected= infected+5;
				if (i>=9)
					infected= infected+8;
			}
		}
		System.out.println("infected persons: "+ infected);

	}

}

