import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a=s.nextInt();
		
		System.out.print("Enter second number : ");
		int b=s.nextInt();
		
		System.out.print("Enter range : ");
		int c=s.nextInt();
		
		
		System.out.print("Fibonacci series is : ");
	for(int i=2;i<c;i++)
	{
		int next=a+b;
		a=b;
		b=next;
		System.out.print(next+" ");
	}
		

	}

}
