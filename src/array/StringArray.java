package array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String nm[]=new String[3];
		System.out.println("enter name");
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<3;i++)
		{
			nm[i]=sc.next();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(nm[i]);
		}

	}

}
