package Test;

//• Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
//method by creating an object of each of the three classes.

 abstract class Bank
{
	 void display()
	 {
		 System.out.println("Bank Balance:  ");
	 }
	abstract void getbalance();
}
 
 class BankA extends Bank
 {
	 void getbalance()
	 {
		 System.out.println("Bank A's Balance = $100");
	 }
 }
 class BankB extends Bank
 {
	 void getbalance()
	 {
		System.out.println("Bank B's Balance = $150"); 
	 }
 }
 class BankC extends Bank
 {
	 void getbalance()
	 {
		 System.out.println("Bank C's Balance = $200");
	 } 
 }

public class bank_demo {

	public static void main(String[] args) {
		
		BankA a=new BankA();
		a.getbalance();
		BankB b=new BankB();
		b.getbalance();
		BankC c=new BankC();
		c.getbalance();
		

	}

}
