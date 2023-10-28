package student;

import java.util.Scanner;

public class InsertData {
	InsertData[] arr;
	static int id;
	private String name;
	static int[] marks;
	public InsertData()
	{
	id=0;
	name=null;
	marks[0]=0;
	marks[1]=0;
	marks[2]=0;
	marks[3]=0;
	marks[4]=0;

		
	}
	public InsertData(int id2, String name2, int marks1, int marks2, int marks3, int marks4, int marks5) {
		id=id2;
		name=name2;
		marks[0]=marks1;
		marks[1]=marks2;
		marks[2]=marks3;
		marks[3]=marks4;
		marks[4]=marks5;
	}

	public static int[] insertMarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks: ");
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}
	

	public void insert() {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		name=sc.nextLine();
		int[] marks=InsertData.insertMarks();
		arr[0]=new InsertData(id,name,marks[0],marks[1],marks[2],marks[3],marks[4]);
//
	}
//	
	public void diplay()
	{
		System.out.println(id+name);
		for (int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}
	}
	

}
