package array;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]=new int[3];
		
		/*
		a[0]=22;
		a[1]=33;
		a[2]=44;
		
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		*/
		System.out.println("enter names:");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("entered name:");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
