package pgms2;
								//4
import java.util.Scanner;

public class SumofAvg {

	public static void main(String[] args) {
		
		System.out.println("enter 3 no: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int sumof3=(a+b+c)/3;
		System.out.println("sum of average of 3 no: "+sumof3);

	}

}
