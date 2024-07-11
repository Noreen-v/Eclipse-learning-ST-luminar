package pgms2;
							//1		//27-05-2024
import java.util.Scanner;

public class NaturalnoSum {

	public static void main(String[] args) {
		
		System.out.println("enter a no: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(" sum of natural no: "+sum);
	}

}
