package ctrlStmts;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=19,w=89;
		if(age>18)
		{
			if(w>=55)
			{
				System.out.println("can donate blood");
			}
			else
			{
				System.out.println("underweight");
			}
		}
		else
		{
			System.out.println("cannot donate blood");
		}
	}

}
