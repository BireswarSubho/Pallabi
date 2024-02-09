import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=s.nextInt();
		long factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}

		System.out.print("Factorial of a number is :"+factorial);
	}

}
