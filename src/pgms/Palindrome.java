package pgms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aloo";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
