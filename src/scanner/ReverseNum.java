package scanner;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;
		int rev=0, rem;
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
