package interface006;

class UserInfo {

	public static int ucnt=0;
	private int uno;
	private String uid,upass;
	
	UserInfo(){super();}
	
	@Override
	public String toString() {
		return uno+"\t"+uid+"\t"+upass;
	}
	
	public int getUno() {
		return uno;
	}
	public String getUid() {
		return uid;
	}
	public String getUpass() {
		return upass;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
}
