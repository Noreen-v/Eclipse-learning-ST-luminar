package pkg;

public class SwapString {

	public static void main(String[] args) {
		
		String s1="hi";
		String s2="welcome";
		String temp;
		
		temp= s1;
		s1=s2;
		s2=temp;
		System.out.println("after swapping:  "+s1+ " "+s2);

	}

}
