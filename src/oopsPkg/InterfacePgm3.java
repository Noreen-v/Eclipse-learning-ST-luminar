package oopsPkg;

interface TvRemote
{
	public void old();
}

interface SmartTvRemote extends TvRemote
{
	public void new1();
}

class TV implements SmartTvRemote
{

	@Override
	public void old() {

		System.out.println("can use old remote");		
	}

	@Override
	public void new1() {

		System.out.println("can use smart remote");
	}
	
}

public class InterfacePgm3 {

	public static void main(String[] args) {
		
		TV t=new TV();
		t.old();
		t.new1();
	}

}
