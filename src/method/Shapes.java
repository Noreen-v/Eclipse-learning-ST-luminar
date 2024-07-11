package method;

public class Shapes {

	public static void main(String[] args) {
		
		Shapes sh=new Shapes();
		sh.rect();
		
		int val=sh.square();
		System.out.println("area of square"+val);

		sh.circle(3);
		
		double v=sh.triangle(3, 5);
		System.out.println("area of triangle"+v);
	}
	//without parameter , return type
			public void rect()
			{
				int l=10,b=22,a;
				a=l*b;
				System.out.println("area of rect"+a);
			}

	//without parameter with return
			public int square()
			{
				int s=10,a;
				a=s*s;
				return a;
			}
			
	//with parameter without return
			public void circle(double r)
			{
				double a=22.7*r*r;
				System.out.println("area of circle"+a);
			}
			
	//with parameter,return
			public double triangle(int b,int h)
			{
				double a=0.5*b*h;
				return a;
			}
}
