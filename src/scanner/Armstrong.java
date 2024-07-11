package scanner;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;
		int r,s=0;
		
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if (temp==s)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}
