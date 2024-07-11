package pgms2;

public class InsertStrMiddle {

	public static void main(String[] args) {


		String str="Java 3.0";
		String mid="tutorial";
		
		int midstr= str.length();
		String res=str.substring(0,midstr)+" " +mid+ "  "+str.substring(midstr);
		
		System.out.println(res);

	}

}
