package Test;

import java.util.Scanner;

class Class
{
		public void marks()
	{
		System.out.println("enter your marks:");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=91&&marks<=100)
		{
			System.out.println("you get AA grade:)");
		}
		else if(marks>=81&&marks<=91)
		{
			System.out.println("you get AB geade:)");
		}
		else if(marks>=71&&marks<80)
		{
			System.out.println("you get BB grade:)");
		}
		else if(marks>=61&&marks<=70)
		{
			System.out.println("you get BC gread:)");
		}
		else if (marks>=51&&marks<=60)
		{
			System.out.println("you get CD grade:)");
		}
		else if (marks>=51&&marks<40) 
			
		{
			System.out.println("you get DD grade:)");
		}
		else {
			System.out.println("Fail...");
		}
	}
}

public class school {

	public static void main(String[] args) {
		
		Class c=new Class();
		c.marks();

	}

}
