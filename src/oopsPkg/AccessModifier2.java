package oopsPkg;

import pkg.AccessModifier;

public class AccessModifier2 extends AccessModifier {

	public static void main(String[] args) {


		AccessModifier2 ob=new AccessModifier2();
		System.out.println(ob.prot);  // public , protected can access from diff. pkg
		System.out.println(ob.pubv);
		//System.out.println(ob.a); //default modif. not possible

	}

}
