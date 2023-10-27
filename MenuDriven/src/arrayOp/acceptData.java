package arrayOp;
import java.util.Scanner;

public class acceptData {

	public static int[] accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element");
		int a=sc.nextInt();
		int[] arr=new int[a];
		for (int i=0;i<a;i++)
		{
			System.out.println("Enter no: ");
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}

}
