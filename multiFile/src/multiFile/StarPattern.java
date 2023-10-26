package multiFile;

public class StarPattern {

	public static void star(int args) {
		
		int no=args;
		int count1=no;
		for (int i=0;i<(int)(no/2)+1;i++)
		{
			
			for(int j=(int)(no/2)-1;j>=i;j--)
			{
				System.out.print(" ");
			
			}
			
			for(int j=1;j<2*(i+1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i=0;i<(int)(no/2);i++)
		{
			count1=count1-2;
			for (int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=count1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
