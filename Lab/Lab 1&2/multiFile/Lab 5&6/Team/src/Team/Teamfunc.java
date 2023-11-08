package Team;

import java.util.Scanner;

public class Teamfunc {

	public static void main(String [] args)
	{
		TeamServ t=new TeamServ();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(ch!=4) {
		System.out.println();
		System.out.println("select 1 for add team");
		System.out.println("select 2 for display all team");
		System.out.println("select 3 for display team by teamid");
		System.out.println("select 4 for Team name by captain name");
		System.out.println("select 5 for exit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			t.addTeam();
		case 2:
			
			t.display();
		case 3:
			Team a=t.displaybyid();
			if (a!=null)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println("Team not found");
			}
			break;
		case 4:
			a=t.displaybyName();
			if (a!=null)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println("Team not found");
			}
			break;

		case 5:
			sc.close();
			System.out.println("Tank you for Visiting...");
			break;
		default:
			System.out.println("please enter valid choice");	
		}
		
	}}
	
}
