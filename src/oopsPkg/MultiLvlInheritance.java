package oopsPkg;

class Father
{
	public void fathermeth()
	{
		System.out.println("father");
	}
}

class Son extends Father
{
	public void sonmeth()
	{
		System.out.println("son");
	}
}

class Grandson extends Son
{
	public void grandsonmeth()
	{
		System.out.println("grandson");
	}
}

public class MultiLvlInheritance {

	public static void main(String[] args) {
		
	Grandson gs=new Grandson();
	gs.fathermeth();
	gs.sonmeth();
	gs.grandsonmeth();
		
	}

}
