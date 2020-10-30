package bank9_v2;

class Bank_v2{
	private String id;
	private String pass;
	private double balance;
	static String company ="(주)면나눔";
	
	//생성자
	Bank_v2(){super();
	this.id="";
	this.pass="";
	this.balance=0;
	}
	
	//toString 함수
	@Override
	public String toString() {
		return "Bank_v2 [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}

	//getter
	public String getId() {return id;}
	public String getPass() {return pass;}
	public double getBalance() {return balance;}
	//setter
	public void setId(String id) {this.id = id;}
	public void setPass(String pass) {this.pass = pass;}
	public void setBalance(double balance) {this.balance = balance;}

}
