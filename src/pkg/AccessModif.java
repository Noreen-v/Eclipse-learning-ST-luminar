package pkg;

public class AccessModif {

	public static void main(String[] args) {
		AccessModifier ob=new AccessModifier();
		System.out.println(ob.a);   // default,protected, public r possible in same pkg
		//System.out.println(ob.priv); private not possible n same pkg
		System.out.println(ob.prot);
		System.out.println(ob.pubv);

	}

}
