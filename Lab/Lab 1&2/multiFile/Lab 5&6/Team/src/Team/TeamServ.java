package Team;

import java.util.Scanner;

public class TeamServ {
	private static Player[] arr=new Player[2];
	private static Player c;
	private static Team[] teamadd=new Team[10];;
	static int count;
	
	public TeamServ()
	{
		Player c= new Player(11,"Sunil chettari","Striker");
		Player[] arr={
				new Player(1,"Gurpreet Singh Sandhu","Goalkeeper"),
				new Player(2,"Sandesh Jhingan","Defender")
				};
				
		
		teamadd[0]=new Team(1,"Indian Football team",c,arr);
		
		count++;
	}
	public static void addTeam() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Team no");
		int tno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter team name");
		String tname=sc.nextLine();
		
		System.out.println("enter captain no");
		int cno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter captain name");
		String cname=sc.nextLine();
		System.out.println("enter captain skill");
		String cskill=sc.nextLine();
		Player c=new Player(cno,cname,cskill);
		
		for (int i=0;i<2;i++) {
			System.out.println("enter player id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter player name");
			String pname=sc.nextLine();
			System.out.println("enter player skill");
			String pskill=sc.nextLine();
			arr[i]=new Player(id,pname,pskill);
		}
		teamadd[count]=new Team(tno,tname,c,arr);
		count++;
	}
	public static void display()
	{
		for (int i=0;i<count;i++)
		{
			System.out.println(teamadd[i]);
		}
	}
	public Team displaybyid() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Team no");
		int tno=sc.nextInt();
		for (int i=0;i<count;i++)
		{
			if(tno==teamadd[i].getTno())
			{
				return teamadd[i];
			}
		}
		return null;
		
	}
	public Team displaybyName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Team Captain Name");
		String tname=sc.nextLine();
		
		for (int i=0;i<count;i++)
		{
			if(teamadd[i].getCaptain().getName().equals(tname))
			{
				return teamadd[i];
			}
		}
		return null;
	}
}
