package Test;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number a");
		a=sc.nextInt();
		System.out.println("A="+a);
		System.out.println("enter the number b");
		b=sc.nextInt();
		System.out.println("b="+b);
		System.out.println("enter the number c");
		c=sc.nextInt();
		System.out.println("c="+c);
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Gretest num is A="+a);
			}
			else
			{
				System.out.println("Grater num is c= "+c);
			}
			
		}
		else  
		{
			if(b>c)
			{
				System.out.println("Grater num is b= "+b);
			}
			else
			{
				System.out.println("greater num is c= "+c);
			}
			}
			

	}

}
