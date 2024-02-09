import java.util.Scanner;

public class SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		System.out.print("write the String : ");
		String s1=s.next();
		String plainString=s1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(plainString);
		
	}

}
