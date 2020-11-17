package bank13_hyuk;

public class BankData {
	private String id;
	private String pass;
	private double balance;
	static String Company = "(주)회사";

	// getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static String getCompany() {
		return Company;
	}

	public static void setCompany(String company) {
		Company = company;
	}

	// 생성자
	public BankData() {
		super();

	}

	// toString
	@Override
	public String toString() {
		return "BankData [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}

}
