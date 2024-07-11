package ctrlStmts;

public class CalcuSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=34, c,value=1;
		switch(value)
		{
			case 1: c=a+b;
					System.out.println("a+b=" +c);
					break;
			case 2: c=a-b;
					System.out.println("a-b=" +c);
					break;
			case 3: c=a*b;
					System.out.println("a*b=" +c);
					break;
			case 4: c=a/b;
					System.out.println("a/b=" +c);
					break;
			default:System.out.println("Invalid choice");
					break;
					
		}
	}

}
