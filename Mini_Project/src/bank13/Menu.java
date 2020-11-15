package bank13;

public class Menu implements Bank_Controller{
	public void exec() {
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r"
				+ "\n입력>>> ");
	}
}
