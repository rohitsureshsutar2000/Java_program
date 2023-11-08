package employee;

import java.time.LocalDate;
import java.util.Scanner;

public class TestEmp { 
	
	public static void main(String[] args)
	{
		int ch=1;
		
		Scanner sc =new Scanner(System.in);
		while(ch!=0) {
		System.out.println();
		System.out.println("Select 0 for exit ");
		System.out.println("Select 1 for add employee ");
		System.out.println("Select 2 for Search Employee by ID ");
		System.out.println("Select 3 for Search Employee by Name");
		System.out.println("Select 4 for modify sal ");
		System.out.println("Select 5 for Display all data");
		
		ch=sc.nextInt();
		switch(ch)
		{
		case 0:
			System.out.println("Thank You for Visiting...");
			break;
		case 1:
			EmpServise e=new EmpServise();
			e.addContEmp();
			e.display();
			break;
		case 2:
			EmpServise.searchById();
			break;
			
		case 3:
			EmpServise n=new EmpServise();
			n.searchByName();
			break;
		case 4:
			EmpServise.modifySal();
			break;
		case 5:
			EmpServise.display();
			break;
		
		default:
			System.out.println("Enter valid choice");
		
		}
		
		}

	
	}

}
