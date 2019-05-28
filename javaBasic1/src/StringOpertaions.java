import java.lang.String;
public class StringOpertaions {

	public static void main(String[] args) 
	{
		//creating a string
	String name="reet";
	System.out.println(name);
	
		//number of characters in string
	int numchar=name.length();
	System.out.println("num of charatcters" +numchar);
		//get a specific character
	
	char charAtPosition4=name.charAt(3);
	System.out.println("char ps " +charAtPosition4);
	 //get a substring
	
	String sub=name.substring(0,3);
	System.out.println("get substring 2:" +sub);
	
	//check if string is equal to another
	 String a="reetu";
	 String b="raman";
	 String c="harman";
	 if(a.contentEquals(c))
	 {
		 System.out.println("no they are same");
		}
	 else 
	 {
		 System.out.println("they are not same");
	 }
	 
	 //do an object comparison between a and b
	 if(a==b)
	 {
		 System.out.println("yes they are same");
		 
	 }
	 else
	 {
		 System.out.println("they are not same");
	 }
	 //converting to upper case
	 String m="rajiya";
	 System.out.println(m.toUpperCase());
	 System.out.println(m.toLowerCase());
	 
	 
	 

	}

}
