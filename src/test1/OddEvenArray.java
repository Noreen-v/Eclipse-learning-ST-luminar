package test1;

public class OddEvenArray {

	public static void main(String[] args) {
		
		int num[]= {1,2,8,9,7};
		
		//even
		for(int i=0; i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println("even no: are: "+num[i]);
			}
		}
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0)
			{
				System.out.println("odd no: are: "+num[i]);
			}
		}

	}

}
