import java.util.HashMap;
import java.util.Map;

public class OccurenceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String input="Hello";
		 Map<Character,Integer> map=new HashMap();
		 
		char[] chars= input.toCharArray();
		for(char ch :chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
			Integer value=map.get(ch);
				map.put(ch,value+1);
			}
		}
		 System.out.println(map);
		
	}

}
