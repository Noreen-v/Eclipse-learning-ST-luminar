package myPgms;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		
		System.out.println("enter a year");
		Scanner sc=new Scanner(System.in);
		int yr=sc.nextInt();
		
		if((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}

	}

}
