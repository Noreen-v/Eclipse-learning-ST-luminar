package oopsPkg;

interface BasicAnimals
{
	public void eat();
	public void sleep();
}

class Monkey 
{
	public void jump() 
	{
		System.out.println("monkey jump");
	}
	public void bite() 
	{
		System.out.println("monkey bite");
	}
}

class Human extends Monkey implements BasicAnimals
{
	public void speak()
	{
		System.out.println("human speaks");
	}

	@Override
	public void eat() {

		System.out.println("humans eat");		
	}

	@Override
	public void sleep() {
		
		System.out.println("humans sleep");		
	}
}

public class InterfacePgm2 {

	public static void main(String[] args) {

		Human h=new Human();
		h.bite();
		h.eat();
		h.sleep();
		h.speak();
		h.jump();		

	}

}
