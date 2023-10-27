package arrayOp;

public class FindMax {

	public static void findNo(int[] args) {
		int min=args[0];
		for (int i=1;i<args.length;i++)
		{
			if (min<=args[i])
			{
				min=args[i];
			}
		}
		System.out.println("the greater number is "+min);
	}

}
