package myPgms;

import java.util.Scanner;

interface Bank
{
	public void accountDetails();
	public void balance();
	public void deposit();
	public void withdraw();
}

class SBI implements Bank
{

	Scanner sc=new Scanner(System.in);
	static String banknm="SBI";
	int bal=8000;
	
	@Override
	public void accountDetails() {
		
		System.out.println("enter account no: ");	
		long actno=sc.nextLong();
		//System.out.println();
		System.out.println("account no: is "+actno+ " bank name: "+banknm);
	}

	@Override
	public void balance() {
		
		System.out.println(bal);
	}

	@Override
	public void deposit() {
		
		System.out.println("account balance is: "+bal);
		System.out.println("enter deposit amount");
		int damt=sc.nextInt();
		bal=bal+damt;
		System.out.println("balance after deposit: "+bal);
	}

	@Override
	public void withdraw() {
		
		System.out.println("account balance is: "+bal);
		System.out.println("enter withdrawl amt: ");
		int wamt=sc.nextInt();
		bal=bal-wamt;
		System.out.println("final balance: "+bal);
	}
	
}

public class InterfaceBank {

	public static void main(String[] args) {
				
//		SBI s=new SBI();
//		s.accountDetails();
//		s.balance();
//		s.deposit();
//		s.withdraw();
		
		SBI s=new SBI();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Banking system menu:");
		System.out.println("1. Account details");
		System.out.println("2. check balance");
		System.out.println("3. deposit");
		System.out.println("4. withdrawal");
		
		System.out.println();
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: s.accountDetails();
				break;
		case 2: s.balance();
				break;
		case 3: s.withdraw();
				break;
		case 4: s.deposit();
				break;
		default: System.out.println("Invalid choice");
		}

	}

}
