package Test;

import java.util.Scanner;

public class LeapYear {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter year :");
		 year=sc.nextInt();
		
			 if(year%4==0)
		     {
			    System.out.println(+year+":is leap year");
	       	}
		
		else
		{
			System.out.println(+year+":is not leap year");
		}
			 System.out.println("Natural Number..");
		int i=1;	
		while( i<=10)
		{
			System.out.println(+i);
			i++;
		}
		 
	}

}
