import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int num=s.nextInt();
		int org=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse is : "+rev);

		if(org==rev)
		{
			System.out.println(org+" is palindrome ");
		}
		else
			System.out.println("Not a palindrome number");
	}

}
