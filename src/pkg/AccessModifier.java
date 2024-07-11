package pkg;


public class AccessModifier {
	
	private int priv=10;
	public int pubv=9;
	protected int prot=5; 
	int a=89;

	public static void main(String[] args) {
		
		AccessModifier am=new AccessModifier();
		System.out.println(am.priv);
		System.out.println(am.pubv);
		System.out.println(am.prot);
		System.out.println(am.a);

	}

}
