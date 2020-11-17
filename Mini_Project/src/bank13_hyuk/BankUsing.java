package bank13_hyuk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankUsing {
	ArrayList<BankData> lists;
	Bank_Controller a;

	
	public BankUsing() {
		super();
		this.lists = new ArrayList<BankData>();
		
	}


	void title() {
		System.out.println("======BANK======\r\n" + "*1. 추가\r\n" + "*2. 조회\r\n" + "*3. 입금\r\n" + "*4. 출금\r\n"
				+ "*5. 삭제\r\n" + "*9. 종료\r\n" + "입력 >>");

	}


	public void menu() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			while (num != 9) {
				title();
				System.out.println(lists.toString());

				num = scanner.nextInt();
				if (num == 1) {
					a= new Input();
					a.exec(lists);
					
				} else if (num == 2) {
					a= new Show();
					a.exec(lists);
				} else if (num == 3) {
					a = new Deposit();
					a.exec(lists);
				}

				else if (num == 4) {
					a = new Withdraw();
					a.exec(lists);
				}

				else if (num == 5) {
					a = new Delete();
					a.exec(lists);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다");
			menu();
		}
	}

}
