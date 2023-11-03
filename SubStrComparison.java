package rohit;

import java.util.ArrayList;
import java.util.Collections;
public class SubStrComparison {

	public static void main(String[] args) {
		String s="helloworld";
		int a=3;
		ArrayList<String> arr=new ArrayList();
		for (int i=0;i<s.length()-4;i++)
        {
            arr.add(s.substring(i,i+a));
            
        }
		 System.out.println(arr);
		Collections.sort(arr);
//		System.out.println;
		String smallest =arr.get(0);
        String largest = arr.get(arr.size()-1);
        System.out.println(arr);
        System.out.println("smallest string : "+smallest);
        System.out.println("largest string : "+largest);
        
	}

}
