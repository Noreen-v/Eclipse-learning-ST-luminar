package oopsPkg;

abstract class Car
{
	abstract public void acceleration();
	abstract public void speedlimit();
	
	public void carcolor()
	{
		System.out.println("red");
	}
}

class Kia extends Car
{

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("speed limit kia");
		
	}
	
}

class BMW extends Car
{

	@Override
	public void acceleration() {
		System.out.println("BMW acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("speed limit BMW");
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {


		Kia k=new Kia();
		k.carcolor();
		k.acceleration();
		k.speedlimit();
		System.out.println();
		
		BMW b=new BMW();
		b.carcolor();
		b.acceleration();
		b.speedlimit();
		
	}

}
