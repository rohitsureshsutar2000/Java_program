package arrayOp;

import java.util.Scanner;

public class TransposeM {

	public static void transM() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows");
		int r=sc.nextInt();
		System.out.println("Enter how many columns");
		int c=sc.nextInt();
		System.out.println("Enter matrix");
		int[][] arr=new int[r][c];
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("before tanspose");
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print( arr[i][j] +"  ");
			}
			System.out.println();
		}
		System.out.println("After tanspose");
		for (int i=0;i<c;i++)
		{
			for (int j=0;j<r;j++)
			{
				System.out.print( arr[j][i] +"  ");
			}
			System.out.println();
		}
		

	}

}
