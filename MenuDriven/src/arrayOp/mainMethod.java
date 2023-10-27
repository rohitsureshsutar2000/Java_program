package arrayOp;
import java.util.Scanner;
public class mainMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=acceptData.accept();
		DisplayArr.display(arr);
		
		System.out.println("select 1 to find max value from array");
		System.out.println("select 2 to find min value from array");
		System.out.println("select 3 to Calculate addition of two array");
		System.out.println("select 4 to find transpose of matrix");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			FindMax.findNo(arr);
			break;
		case 2:
			FindMin.findMinimum(arr);
			break;
		case 3:
			ArrayAddition.addArray(arr);
			break;
		case 4:
			TransposeM.transM();
			break;
		}
		sc.close();
		
	}


}
