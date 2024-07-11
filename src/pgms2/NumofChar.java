package pgms2;
						//5		//27-05-2024
public class NumofChar {

	public static void main(String[] args) {
		
		String s="hello hi its me";
		int c=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				c++;
			}
		}
			System.out.println(c);
	}

}
