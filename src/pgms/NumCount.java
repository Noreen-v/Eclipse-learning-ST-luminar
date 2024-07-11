package pgms;

import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {
		
		System.out.println("enter no's: ");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int digit,sum=0;
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("sum of digits:"+sum);

	}

}
