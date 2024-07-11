package array;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		int a[]= new int [3];
		System.out.println("enter a no:");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum is"+sum);
	}

}
