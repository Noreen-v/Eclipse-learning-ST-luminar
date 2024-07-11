package pgms2;
							//8			27-05-2024
import java.util.Scanner;

public class DoWhileAdd {

	public static void main(String[] args) {
		 char choice;
		 
		 do
		 {
			 System.out.println("enter 2 no: ");
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				int sum=a+b;
				System.out.println("sum is "+sum);
				
				System.out.println("do u want to perform operation again? (y|n): ");
				choice=sc.next().charAt(0);
		 }while(choice =='Y' || choice =='N');

	}

}
