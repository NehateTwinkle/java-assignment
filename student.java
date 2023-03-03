package Test;

class parent
{
	public void get()
	{
		System.out.println("This is Parent class.");
	}
}

class parent1 extends parent
{
	public void set()
	{
		System.out.println("This is child class.");
	}
}

class parent2 extends parent1
{
	
}



public  class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent2 p=new parent2();
		p.get();
		p.set();
		
	}

}
