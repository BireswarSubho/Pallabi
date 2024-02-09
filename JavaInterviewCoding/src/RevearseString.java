import java.util.Scanner;

public class RevearseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Wrire firstname : ");
		String firstname=s.next();
		System.out.println("Wrire lastname : ");
		String lastname=s.next();
		
		String fullname=firstname.concat(lastname);
		
		System.out.println("Fullname is : "+fullname);
		
		
		//////////////////////////////////
		String rev="";
		int l=fullname.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+fullname.charAt(i);
		}

		System.out.println("reverse is : "+rev);
	}

}
