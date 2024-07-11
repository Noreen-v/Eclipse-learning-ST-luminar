package oopsPkg;

import java.util.Scanner;

interface Bank{
	
	public void accountDetails();
	public void withdraw();
	public void balance();
	public void deposit();
}

class SBI implements Bank
{
	int bal=85000;
	Scanner sc=new Scanner(System.in);
	//int with=sc.nextInt();
	
	@Override
	public void accountDetails() {

		
		
		System.out.println("enter a Name ");
		String name=sc.nextLine();
		System.out.println("enter bank name: ");
		String banknm=sc.nextLine();
		System.out.println("enter IFSC code ");
		int ifsc=sc.nextInt();
		System.out.println("enter account no:  ");
		int accno=sc.nextInt();
		
//		System.out.println("Name "+name);
//		System.out.println("Account no: "+accno);
//		System.out.println("bank name "+banknm);
//		System.out.println("IFSC code "+ifsc);
	}
	
	@Override
	public void withdraw() {
		
		System.out.println("enter amount to withdraw ");
		int with=sc.nextInt();
		int b=bal-with;
		System.out.println("balance amount after withdraw is: "+b);
	}
	
	@Override
	public void balance() {
		
		
		System.out.println("Bank balance: "+bal);
	}
	
	@Override
	public void deposit() {
		
		System.out.println("enter amount to deposit ");
		int deposit=sc.nextInt();
		int tot=deposit+bal;
		System.out.println("amount after deposit "+tot);
		
	}
	
}

public class BankInterface {

	public static void main(String[] args) {
				
		SBI bb=new SBI();
		bb.accountDetails();
		bb.balance();
		bb.withdraw();
		bb.deposit();

	}

}
