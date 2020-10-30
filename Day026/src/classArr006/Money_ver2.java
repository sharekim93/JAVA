package classArr006;

class Money_ver2 {
	static final String BANKNAME = "GREEN BANK";
	static double rate =0.1;
	private String user_name;
	private long user_won;
	private String card;
	
	//생성자
	Money_ver2(){
		super();
		this.user_name	=	"";
		this.user_won	=	0L;
		this.card ="";
	}
	Money_ver2(String name, long won){
		super();
		this.user_name	=	name;
		this.user_won	=	won;
	}
	
	//toString
	@Override
	public String toString() {
		return "Money_ver2 [user_name=" + user_name + ", user_won=" + user_won + ", card=" + card + "]";
	}
	//getter, setter
	public String getUser_name() {return user_name;}
	public long getUser_won() {return user_won;}
	public void setUser_name(String user_name) {this.user_name = user_name;}
	public void setUser_won(long user_won) {this.user_won = user_won;}
	public String getCard() {return card;}
	public void setCard(String card) {this.card = card;}
	
	
}
