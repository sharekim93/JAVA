package classArr005;

class Money_ver1 {
	static final String BANKNAME = "GREEN BANK";
	static double rate =0.1;
	private String user_name;
	private long user_won;
	
	//생성자
	Money_ver1(){
		super();
		this.user_name	=	"";
		this.user_won	=	0L;
	}
	Money_ver1(String name, long won){
		super();
		this.user_name	=	name;
		this.user_won	=	won;
	}
	
	//toString
	@Override
	public String toString() {
		return "Money_ver1 [user_name=" + user_name + ", user_won=" + user_won + "]";
	}

	//getter, setter
	public String getUser_name() {return user_name;}
	public long getUser_won() {return user_won;}
	public void setUser_name(String user_name) {this.user_name = user_name;}
	public void setUser_won(long user_won) {this.user_won = user_won;}
	
	
}
