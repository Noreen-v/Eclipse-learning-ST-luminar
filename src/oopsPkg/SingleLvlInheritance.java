package oopsPkg;

class Parent
{
	public void parentmethod()
	{
		System.out.println("parenthood");
	}
}

class Child extends Parent
{
	public void childmethod()
	{
		System.out.println("childhood");
	}
}

public class SingleLvlInheritance {

	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.childmethod();
		ch.parentmethod();

	}

}
