//@author bmisra21 (Bharavi Misra)
//StringHW
//Mr. Ellis P6

import java.util.Scanner;
public class StringMain 
{

	public static void main (String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String fname = in.next();
		String lname = in.next();
		String fullName = fname + lname;
		
		System.out.print("\nEnter a ten digit phone number: ");
		String phoneNumber = in.next();
		String areaCode = "(" + phoneNumber.substring(0,3) + ")";
		String prefix  = "-" + phoneNumber.substring(3,6) + "-";
		String lineNumber = phoneNumber.substring(6,10);
		String fullNumber = areaCode + prefix + lineNumber;
		
		System.out.printf("\n%-20s %s \n%s %s ", "Name: ", fullName, "Phone Number: ", fullNumber );
		
	}
	
}
