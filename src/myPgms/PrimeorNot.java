package myPgms;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		System.out.println("enter a no: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2!=0) 
		{
			System.out.println("prime ");
		}
		else
		{
			System.out.println("not prime ");
		}
	}

}
