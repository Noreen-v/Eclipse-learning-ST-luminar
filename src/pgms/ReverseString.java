package pgms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testing training center";
		String ar[]=s.split(" ");
		
		for (int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
