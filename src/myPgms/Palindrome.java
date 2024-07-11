package myPgms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String a="aaa";
		String rev= " ";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(a))
		{
			System.out.println("palindrome: ");
		}
		else
		{
			System.out.println("not palindrome: ");
		}

	}

}
