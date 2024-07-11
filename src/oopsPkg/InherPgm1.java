package oopsPkg;

class Member
{
	int age,ph,salary;
	String nm, address;
	
	public void printdetails()
	{
		System.out.println("Name: "+nm);
		System.out.println("age: "+age);
		System.out.println("phone: "+ph);
		System.out.println("address: "+address);
		System.out.println("salary: "+salary);
	}
}

class Employee extends Member
{
	String splization;
}


class Manager extends Member
{
	String dept;
}

public class InherPgm1 {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.nm="john";
		e.age=23;
		e.ph=98787667;
		e.address="kerala";
		e.salary=40000;
		
		e.splization="HR";
		
		e.printdetails();
		System.out.println(e.splization="Tester");
		System.out.println();
		
		Manager m=new Manager();
		m.nm="ria";
		m.age=24;
		m.ph=8923456;
		m.address="goa";
		m.salary=45000;
		
		m.dept="tester";
		
		m.printdetails();
		System.out.println(m.dept="IT");
	}

}
