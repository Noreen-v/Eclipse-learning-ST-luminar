package pkg;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		
		System.out.println("enter a no: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=2;i<=n/2;i++) {
		if(i>n/2) 
		{
			System.out.println("no: is prime ");
		}
		else
		{
			System.out.println("not a prime ");
		}
		}
	}

}
