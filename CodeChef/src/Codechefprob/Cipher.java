package Codechefprob;

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="NPWF!TPVUI!XFTU!UP!41LN";
//		String s2="WEST TO";
		
		
		String s1="SPZ[LU3’[OL’JYHa`’ISHJR’JH['Z[VW’^OLYL’`V\\’HYL";
		String s2="CRAZY BLACK CAT";
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int j=0,diff=0, i=0;
		for(i=0;i<ch1.length-4;i++)
		{
			if(diff==0)
			{
			int a=(int)ch1[i]-(int)ch2[j];
				diff=a;
				j++;
//				System.out.println(diff);
				continue;
//				j++;
			}
			if((int)ch1[i]-(int)ch2[j]==diff)
			{
				j++;
				if (j==4)
				{
					break;
				}
			}
			else
			{
				diff=0;
				j=0;
			}
		}
//		System.out.println(diff);
		
		for(int k=0;k<ch1.length;k++)
		{
			if((ch1[k]-diff)==8210)// it give '-' because actual value of " ' " (this is not singlecote)they add symbol thats why we have to adjust it
				{System.out.print(" ");}
			else
				{
					
					System.out.print( (char)(ch1[k]-diff));
				}
		}
		
		
	}

}
