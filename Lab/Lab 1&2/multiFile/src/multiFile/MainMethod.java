package multiFile;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select 1 for printing Dimond");
		System.out.println("select 2 for check prime number or not");
		System.out.println("select 3 to print table");
		int caseNo=sc.nextInt();
		
		switch(caseNo) {
		case 1:
			System.out.println("Enter no.: ");
			int no=sc.nextInt();
			StarPattern.star(no);
			break;
		case 2:
			System.out.println("Enter no.: ");
			no=sc.nextInt();
			PrimeNo.PrimeNo(no);
			break;
		case 3:
			System.out.println("Enter no.: ");
			no=sc.nextInt();
			PrintTable.printtable(no);
			break;
		}
		sc.close();

	}

}
