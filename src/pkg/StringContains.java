package pkg;

import java.util.Scanner;

public class StringContains {

	public static void main(String[] args) {
		
		System.out.println("enter strings ");
		Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    
		System.out.println("enter string to search ");
		String s2=sc.nextLine();
		
		if(s1.contains(s2))
		{
			System.out.println("String contains specified word ");
		}
		else
		{
			System.out.println("not contain the word ");
		}

	}

}
