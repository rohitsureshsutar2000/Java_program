package rohit;

import java.util.HashMap;

public class Parantheses {

	public static void main(String[] args) {
		HashMap <String,String> map=new HashMap<>();
		map.put("(",")");
		map.put("{","}");
		map.put("[","]");
		String s="({)}";
		int count=0;
		if ((s.length())%2!=0)
		{
			System.out.println(false);
		}
		else {

			for (int i=0;i<s.length();i++)
			{
				if (map.containsKey(Character.toString(s.charAt(i))))
				{
					
					String val=map.get(Character.toString(s.charAt(i)));
					System.out.println(val);
					if (s.contains(val))
					{
						count++;
					}
				}
			}
			if (count==s.length()/2)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
			
		}
		
	}

}
