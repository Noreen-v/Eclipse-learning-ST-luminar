package oopsPkg;

class Mother
{
	public void mothermthd()
	{
		System.out.println("mother ");
	}
}

class Child1 extends Mother
{
	public void child1mthd()
	{
		System.out.println("son");
	}
}

class Child2 extends Mother
{
	public void child2mthd()
	{
		System.out.println("daughter");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.child1mthd();
		c1.mothermthd();
		
		Child2 c2=new Child2();
		c2.child2mthd();
		c2.mothermthd();

	}

}
