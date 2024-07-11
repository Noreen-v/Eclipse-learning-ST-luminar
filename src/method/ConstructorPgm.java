package method;

public class ConstructorPgm {
	
	int age;
	String nm;
	
	public ConstructorPgm(String nm, int age)
	{
		this.nm=nm;
		this.age=age;
	}
	
	public void display()
	{
		System.out.println("name: "+nm);
		System.out.println("age: "+age);
	}

	public static void main(String[] args) {
		
		ConstructorPgm person=new ConstructorPgm("ria",23);
		person.display();

	}

}
