package test1;

public class RevString {

	public static void main(String[] args) {
		String s="hello welcome to java test";
		String ar[]=s.split(" ");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
