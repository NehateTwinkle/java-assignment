package Test;
//• Create a class named 'Shape' with a method to print "This is this is shape". Then 
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
//having a method to print "This is rectangular shape" and "This is circular shape" 
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
//object of 'Square' class
class Shape
{
	public void set()
	{
		System.out.println("This is Shape.");
	}
}
class Rectangle extends Shape
{
	public void set()
	{
		System.out.println("This is Rectangle Shape. ");
	}
}


class Circle extends Shape
{
	public void set()
	{
		System.out.println("This is circular shape.");
	}
}

class Square extends Rectangle
{
	public void get1()
	{
		System.out.println("Square is a Rectangle.");
	}
}
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.get1();
		s.set();
		
		

	}

}
