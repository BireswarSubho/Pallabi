import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int a=s.nextInt();
		 int b=s.nextInt();
		 
		 System.out.println("Before swapping the numbers are : "+a+" and "+b );
		 
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("Afer swapping the numbers are : "+a+" and "+b  );

	}

}
