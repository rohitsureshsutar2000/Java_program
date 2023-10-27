package arrayOp;
import java.util.*;
public class ArrayAddition {

	public static void addArray(int[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter 2nd array of "+ args.length+" elements");
		int[] arr=new int[args.length];
		arr=acceptData.accept();
		
		for (int i=0;i<args.length;i++)
		{
			
			arr[i]= arr[i]+args[i];
			
		}
		DisplayArr.display(arr);
		
	}

}
