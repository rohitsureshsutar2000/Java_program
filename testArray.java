package rohit;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class testArray {
	
	 public static List<Integer> acceptArr (List<Integer> arr)
	    {
	        List<Integer> arr1=new ArrayList<>();
	        int a=0;
	        for (int i=0;i<arr.size();i++)
	        if (i==0)
	        {
	            a=arr.get(i);
	        }
	        else{
	            arr1.add(arr.get(i));
	        }
	        arr1.add(a);
//	        arr.stream().forEach(System.out::println);
	        return arr1;
	    }
	    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//	    arr.stream().forEach(System.out::println);
//	    System.out.println(d);
	    List<Integer> arr1=new ArrayList<>();
	    arr1=arr;
	    System.out.println("value arr1");
	    arr1.stream().forEach(System.out::println);
	    int a=0;
	    for (int i=0;i<d;i++)
	    {
	    	
//	    	System.out.println("after Remove all");
//	    	
//	    	arr1.stream().forEach(System.out::println);
	        arr1=acceptArr(arr);
	        arr1.stream().forEach(System.out::println);
		arr=arr1
	    }
//	    arr1.stream().forEach(System.out::println);
	    return arr1;
	    }

	public static void main(String[] args) {
		
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
//		arr.stream().forEach(System.out::println);
		System.out.println(testArray.rotateLeft(4,arr));
		
		    /*
		     * Complete the 'rotateLeft' function below.
		     *
		     * The function is expected to return an INTEGER_ARRAY.
		     * The function accepts following parameters:
		     *  1. INTEGER d
		     *  2. INTEGER_ARRAY arr
		     */
		   

		

	}

}
