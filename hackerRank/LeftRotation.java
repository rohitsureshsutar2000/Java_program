import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	public static List<Integer> acceptArr (List<Integer> arr2)
    {
        List<Integer> arr3=new ArrayList<>();
        int a=0;
        for (int i=0;i<arr2.size();i++) {
        if (i == 0)
        {
            a=arr2.get(i);
        }
        else{
            arr3.add(arr2.get(i));
        }
        }
        arr3.add(a);

        return arr3;
    }
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {

	    List<Integer> arr1=new ArrayList<>();
	    arr1=arr;
	    int a=0;
	    for (int i=0;i<d;i++)
	    {
	    	
//	    	System.out.println(arr1);
	        arr1=acceptArr(arr);
	        arr=arr1;}

	    return arr1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		System.out.println(testArray.rotateLeft(4,arr));
	}

}
