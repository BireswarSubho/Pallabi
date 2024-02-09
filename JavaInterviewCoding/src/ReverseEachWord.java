
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="bireswar adhikary";
		System.out.println("Original string : "+input);
		
		String output="";
		
		String[] words=input.split(" ");
		
		for(String word :words)
		{
			String revword="";
		for(int i=word.length()-1;i>=0;i--)
		{
			revword=revword+word.charAt(i);
		}
		output=output+revword+" ";
		
		}
		System.out.println("Reverse String is : "+output);
		
	}

}
