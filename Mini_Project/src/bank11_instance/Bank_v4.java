package bank11_instance;

class Bank_v4 {
	private String id;
	private String pass;
	private double balance;
	static String company="(주)면나눔";
	
	Bank_v4() {super();}
	Bank_v4(String id, String pass, double balance){
		super();
		this.id=id;	this.pass=pass;	this.balance=balance;
	}

	@Override
	public String toString() {
		return "id=" + id + ", pass=" + pass + ", balance=" + balance;
	}

	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

	public double getBalance() {
		return balance;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
