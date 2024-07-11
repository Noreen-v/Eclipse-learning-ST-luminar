package pgms;

public class LargestNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {22,55,99,33,11};
		int max=n[0];
		
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>max)
			{
				max=n[i];
			}
		}
         System.out.println(max);
	}

}
