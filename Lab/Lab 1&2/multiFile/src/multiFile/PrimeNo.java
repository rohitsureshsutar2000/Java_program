package multiFile;

public class PrimeNo {

	public static void PrimeNo(int no) {
		int storeNo=1;
		for (int i=2;i<no;i++)
		{
			
			if (no%i==0)
			{
				storeNo++;
			}
		}
		if (storeNo==1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
