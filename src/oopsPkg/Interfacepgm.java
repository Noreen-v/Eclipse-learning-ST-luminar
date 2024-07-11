package oopsPkg;

interface Car1
{
	public void acceleration();
	public void speed();
}

interface Carshop extends Car1
{
	public void color();
}

class Audi implements Car1, Carshop
{

	@Override
	public void acceleration() {

		System.out.println("audi acceleration");		
	}

	@Override
	public void speed() {

		System.out.println("audi speed");		
	}

	@Override
	public void color() {
		
		System.out.println("red");
		
	}
	
}


class Benz implements Car1, Carshop
{

	@Override
	public void acceleration() {

		System.out.println("benz acceleration");		
	}

	@Override
	public void speed() {

		System.out.println("benz speed");		
	}

	@Override
	public void color() {

		System.out.println("white");
		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		
		Benz b=new Benz();
		b.acceleration();
		b.speed();
		b.color();
		
		System.out.println();
		
		Audi a=new Audi();
		a.acceleration();
		a.speed();
		a.color();
				 
	}

}
