package oopsPkg;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading ol=new MethodOverloading();
		ol.add();
		ol.add(10, 20);
		ol.add(5.5, 40);
		ol.add(3, 3.3);
		ol.add(2.7, 7.2);

	}
	
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("c: "+c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println("c is "+c);
	}
	
	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println("c= "+c);
	}
	
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println("value of c "+c);
	}

}
