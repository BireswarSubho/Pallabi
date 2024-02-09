import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		System.out.print("write the String : ");
		String s1=s.next();
		StringBuilder sb1=new StringBuilder();
		s1.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
	}

}
