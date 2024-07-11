package oopsPkg;

class Employee1
{
	private String name="noni";
	private int id=23;

	public String getname()
	{
		return name;
	}

	public void setname(String name)
	{
		this.name=name;
	}

	public int getid()
	{
		return id;
	}

	public void setid(int id)
	{
		this.id=id;
	}

}

public class EncapsulationPgm {
	
	public static void main(String[] args) {
		
		Employee1 e=new Employee1();
		e.setid(12);
		e.setname("ria");
		System.out.println(e.getid());
		System.out.println(e.getname());
	}

}
