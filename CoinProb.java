package hello;

// Amount is 13			then total coins are 6 and 132

import java.util.Scanner;

public class CoinProb {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println(" Enter No");	//13
		int num=sc.nextInt();
		int one=0;							//0
		int two=0;							//0
		int five=(num-4)/5;					//1													five=1
		if((num-5*five)%2==0)				//(13-5)%2==0					//8%2==0			
		{									//									|							
			one=2;							//				<--------------------				one=2	
		}
		else
		{
			two=1;
		}
		two =(num-5*five-one)/2;			//	(13-5*1-2)/2	//6/2		//					two =3	
		System.out.println(one+two+five);
		System.out.println(five);
		System.out.println(two);
		System.out.println(one);

	}

}
