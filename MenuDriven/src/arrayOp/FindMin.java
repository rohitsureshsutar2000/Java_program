package arrayOp;

public class FindMin {

	public static void findMinimum(int[] args) {
		int min=args[0];
		for (int i=1;i<args.length;i++)
		{
			if (min>=args[i])
			{
				min=args[i];
			}
		}
		System.out.println("the Smalllest number is "+min);
	}

}
