package Test;

import java.util.Scanner;

public class Averageof_5_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
			int i ,a=0,b=0;
			double avg;
			{
				System.out.println("input 5 numbers..");
			}
			
			for( i=0;i<5;i++)
			{
     		   a=sc.nextInt();
     		   
     		   b+=a;
						
     		} 
			System.out.println("sum="+b);
			
			avg=b/5;
			System.out.println("Average of 5 number is="+avg);
     		
		
			
			
		

	}

}
