package myPgms;

class Stud
{
	private String snm;
	private int sid;
	public String getSnm() {
		return snm;
	}
	public void setSnm(String snm) {
		this.snm = snm;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
}

public class Encapsulationpgm2 {

	public static void main(String[] args) {
		
		Stud s=new Stud();
		s.setSid(44);
		s.setSnm("noni");
		System.out.println(s.getSid());
		System.out.println(s.getSnm());
	}

}
