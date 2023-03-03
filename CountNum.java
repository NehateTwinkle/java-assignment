package Test;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Integer Number");
		Scanner sc = new Scanner (System.in);
		long number=0,num=0;
		 
		System.out.println("enter number..");
		number=sc.nextLong();
		while(number!=0)
		{
			number=number/10;
			num++;
		}
		System.out.println("Total number digit="+num);
		
		
		
		

	}

}
