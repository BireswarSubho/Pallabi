package pattern;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int range =s.nextInt();
		
		for(int i =1;i<=range;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
