package Test;

import java.util.Scanner;

 

public class Size {
	
	
	  static Scanner sc=new Scanner(System.in);
	
	public void get( float a)
	{
		
//		System.out.println("enter your choice.");
//		a=sc.nextInt();
		System.out.println("Square="+a*a);
		
	}
	public void get(float l,int b)
	{
//		l=sc.nextInt();
//		b=sc.nextInt();
	System.out.println("Rectangle="+l*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Size s=new Size();
		System.out.println("Enter any one number:");
		float y=sc.nextInt();
		s.get(y);
		System.out.println("Enter two number:");
		float j=sc.nextInt();
		int  k=sc.nextInt();
		s.get(j, k);

	}

}
