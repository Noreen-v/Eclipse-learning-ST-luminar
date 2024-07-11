package myPgms;

import java.util.Scanner;

public class BasicAddition {

	public static void main(String[] args) {
		System.out.println("enter 2 no: ");
		Scanner sc=new Scanner (System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		System.out.println("sum of 2 no: is : "+sum);

	}

}
