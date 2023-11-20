package leetCode;

import java.util.Collection;
import java.util.Collections;

public class longComPre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs= {"flower","flow","flight"};
		String ss=null;
		for (int i=0;i<strs.length-1;i++) {
			if (strs[i].length()<=strs[i+1].length())
			{
				ss=strs[i];
			}
			else
			{
				ss=strs[i+1];
			}
		}
		
		System.out.println("==============="+ss);
		StringBuilder s =new StringBuilder("");
		int count=0;
		for (int i=0;i<ss.length();i++)
		{
			char c=ss.charAt(i);
			
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
