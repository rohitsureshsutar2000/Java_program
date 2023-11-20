package leetCode;

import java.util.Collection;
import java.util.Collections;

public class longComPre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs= {"flower","flow","flight"};
		System.out.println(strs.length);
		int count=0;
		String ss="";
		StringBuilder s =new StringBuilder("");
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
		
		for (int i=0;i<ss.length();i++)
        {
			char c=ss.charAt(i);
            for (int j=0;j<strs.length;j++)
            {
            	if (strs[j].charAt(i)==c)
            		{
            		count++;
            		}
            	if (count==strs.length)
            	{
            		s.append(c);
            	}
            }
            count=0;
        }
		
		System.out.println(s);
			
	}

}
