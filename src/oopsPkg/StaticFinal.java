package oopsPkg;

public class StaticFinal {
	
	static String course="Soft.Testing";
	final double pi=3.14;
	static final int r=5;

	public static void main(String[] args) {

		System.out.println(course); //static
		System.out.println(course="ML/AI");
		//System.out.println(pi);  final keyword should always depend on obj.
		StaticFinal sf=new StaticFinal();
		System.out.println(sf.pi);
		System.out.println(r); 

	}

}
