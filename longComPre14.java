package leetCode;

import java.util.Collection;
import java.util.Collections;

public class longComPre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs= {"flower","flow","flight"};
		
		StringBuilder s =new StringBuilder("");
		int count=0;
		for (int i=0;i<strs[0].length();i++)
		{
			char c=(strs[0].charAt(i));
			
			for (int j=0;j<strs.length;j++)
			{
				
				if (c==strs[j].charAt(i))
				{
					count++;
					if (count==strs.length) {
						s.append(c);
					}
				}
			}
			count=0;
		}
		System.out.println(s);
		String str=s.toString();
		
	}

}
