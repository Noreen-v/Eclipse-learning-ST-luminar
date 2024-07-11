package scanner;

import java.util.Scanner;

public class CalcScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter 2 no:");
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		System.out.println("enter choice");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		default:System.out.println("invalid");
		break;
		
		}
	}

}
