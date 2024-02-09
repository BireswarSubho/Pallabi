import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int a=s.nextInt();
		
		int count =0;
		
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			
				System.out.println("Prime number");
			
			else
				System.out.println("Not a prime number");

	}

}
