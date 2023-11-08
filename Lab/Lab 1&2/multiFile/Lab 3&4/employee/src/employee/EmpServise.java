package employee;


import java.time.LocalDate;
import java.util.Scanner;

public class EmpServise {

	private static int count=0,newCh=0;
	private static Employee[] arr=new Employee[100] ;
		static {
			arr[0]=(new ContractEmp(2,"rohit","5151","roht@gmail.com",10,"hr",LocalDate.of(2012, 8, 12), 1200, 50));
			count++;
			arr[1]=(new Sal_emp(5,"pranav","5151","roht@gmail.com",10,"hr",LocalDate.of(2012, 8, 12), 12, 50));
			count++;
			arr[2]=(new Vendors(8,"sahil","5151","roht@gmail.com",10,"hr",LocalDate.of(2012, 8, 12), 12, 50));
			count++;
			arr[3]=(new ContractEmp(9,"raj","5151","roht@gmail.com",10,"hr",LocalDate.of(2012, 8, 12), 12, 500));
			count++;
			arr[4]=(new ContractEmp(10,"rohit","5151","roht@gmail.com",10,"hr",LocalDate.of(2012, 8, 12), 12, 500));
			count++;
		}
	
	private int id;
	private String name;
	private String mobile;
	private String email;
	
	private int dept;
	private String desg;
	private LocalDate doj;
	
	private double sal;
	private int bonus;
	
	private int hr;
	private int charges;
	
	private int noOfEmp;
	private double amt;
	
	
	public void addContEmp(){
		
		
		Scanner sc=new Scanner(System.in);
//		int id, String name, String mobile, String email,int dept, String desg, LocalDate doj,int hr, int charges
//		ContractEmp e=new ContractEmp(2,"rohit","5151","roht@gmail.com",10,"hr",LocalDate.of(2012, 8, 12), 12, 50);
		ContractEmp e=new ContractEmp();
		System.out.println(e);
		Vendors e1=new Vendors();
		String s = "y";
		
		for(int i=count;i<100;i++)
		{
			
			if("y".equals(s) || "Y".equals(s)) {
				System.out.println();
				System.out.println("If you want to add Salaried employee select 1 ");
				System.out.println("If you want to add contract employee select 2 ");
				System.out.println("If you want to add vendor select 3 ");
				newCh=sc.nextInt();
			System.out.println("Enter id :");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name :");
			name=sc.nextLine();
			System.out.println("Enter mobile :");
			mobile=sc.nextLine();
			System.out.println("Enter email :");
			email=sc.nextLine();
			System.out.println("Enter dept :");
			dept=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter desg :");
			desg=sc.nextLine();
			System.out.println("Enter year :");
			int y=sc.nextInt();
			System.out.println("Enter month :");
			int m=sc.nextInt();
			System.out.println("Enter day  :");
			int d=sc.nextInt();
			doj=LocalDate.of(y, m, d);
			
			switch(newCh)
			{
			case 1:
				System.out.println("Enter sal :");
				sal=sc.nextDouble();
				System.out.println("Enter bonus :");
				bonus=sc.nextInt();
				arr[i]= new Sal_emp(id,name,mobile,email,dept,desg,doj,sal,bonus);

				break;
			case 2:
				System.out.println("Enter hours:");
				hr=sc.nextInt();
				System.out.println("Enter charges :");
				charges=sc.nextInt();
				arr[i]= new ContractEmp(id,name,mobile,email,dept,desg,doj,hr,charges);
				break;
				
			case 3:
				System.out.println("Enter hr :");
				noOfEmp=sc.nextInt();
				System.out.println("Enter charges :");
				amt=sc.nextDouble();
				arr[i]= new Vendors(id,name,mobile,email,dept,desg,doj,noOfEmp,amt);
				break;
			default:
				System.out.println("enter valid choice");
				break;
				
			}
			
			count++;
			System.out.println("If you want to add 1 more contract employee Press Y");
			s=sc.next();
			
		}
			else
			{
				break;
			}
		}
		
	
		
	}
	public static void display()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void searchById() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int newId=sc.nextInt();
		for (int i=0;i<count;i++)
		{
			if (arr[i].getId()==newId)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	public void searchByName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String Name1=sc.next();
		for (int i=0;i<count;i++)
		{
			if (arr[i].getName().equals(Name1))
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	public static void modifySal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int gId=sc.nextInt();
		System.out.println("enter New Salary");
		int sal=sc.nextInt();
		
		for (int i=0;i<count;i++)
		{
			if (arr[i].getId()==gId)
			{
				System.out.println("to confirm press Y or N ");
				String cc=sc.next();
				if ("y".equals(cc) || "Y".equals(cc))
				{
					((Sal_emp)arr[i]).setSal(sal);
					System.out.println(arr[i]);
				}
				
			}
		}
	}
	
	
	
}
