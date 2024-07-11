package pgms;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		//String s="noreen";
		
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)== ' ')) {
				count++;	
			}			
		}
		System.out.println("count of string is "+count);
		//System.out.println(s.length());
	}

}
