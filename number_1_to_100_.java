package Test;

import java.util.Scanner;

public class number_1_to_100_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner (System.in);
		for(num=1;num<=100;num++)
		{
			if( num%3==0)
			{
				System.out.println("divide by 3="+num);
			}
			
			else if(num%5==0)
		{
			//System.out.println("Divisible by 5=");
			System.out.println("divide by 5="+num);
		}
			
			else if(num%15==0)
			{
				System.out.println("divide by both="+num);
			}
			
//			else
//			{
//				System.out.println(+num);
//			}
			
		}
	}

}
