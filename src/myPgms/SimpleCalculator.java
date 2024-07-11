package myPgms;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		System.out.println("enter 2 no: ");
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		
		System.out.println("enter an operator (+,-,*,/)");
		char operator =sc.next().charAt(0);
		double result;
		
		switch(operator)
		{
			case '+': result=n1+n2;
						System.out.println("sum: "+ result);
						break;
			case '-': result=n1-n2;
						System.out.println("subtraction: "+ result);
						break;
			case '*': result=n1*n2;
						System.out.println("multiplication: "+ result);
						break;
			case '/': result=n1/n2;
						System.out.println("division: "+ result);
						break;
			default: System.out.println("invalid choice");
						
		}//System.out.println("result is: "+ result);
	}		
}
