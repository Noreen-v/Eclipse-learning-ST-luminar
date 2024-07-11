package oopsPkg;

public class ExceptionPgm {

	public static void main(String[] args) {
		 
		try
		{
		int a=30,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("arithemetic exception");
		}
		System.out.println("hello ");

	}

}
