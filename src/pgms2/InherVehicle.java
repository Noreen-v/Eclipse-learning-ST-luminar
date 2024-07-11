package pgms2;
					//27-05-2024
class Vehicle
{
	public void drive()
	{
		System.out.println("driving");
	}
}

class Car extends Vehicle
{
	@Override
	public void drive()
	{
		System.out.println("repairing a car");
		super.drive();
	}
}

public class InherVehicle {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.drive();

	}

}
