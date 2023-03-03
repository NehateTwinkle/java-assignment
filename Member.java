package Test;

import java.util.Scanner;

public class Member {
	Scanner sc=new Scanner(System.in);
  String name ,address;
  int age;
  long num;
  double  salary;
	
	public void name()
	{
		System.out.println("Enter name");
	    name=sc.next();
		
	}
	public void Age() {
		System.out.println("Enter age");
		 age=sc.nextInt();
		
	}
	public void Number() {
		System.out.println("Enter number");
		 num=sc.nextLong();
		
	}
	public void Address() {
		System.out.println("Enter Address");
		address=sc.next();
		
	}
	public void Salary() {
		System.out.println("Enter Salary");
		 salary=sc.nextDouble();
		
	}
	 
	public void Data()
	{
		System.out.println("Name:" +name);
		System.out.println("Age:"+age);
		System.out.println("Number:"+num);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
		
	}

	
	
//	• Create a class named 'Member' having the following members:
//		1. Data members
//		2. Name
//		3. Age
//		4. Phone number
//		5. Address
//		6. Salary
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m=new Member();
		System.out.println("Enter your data:");
		m.name();
		m.Age();
		m.Number();
		m.Address();
		m.Salary();
		System.out.println("----Your data is-------");
		m.Data();
		

	}

}
