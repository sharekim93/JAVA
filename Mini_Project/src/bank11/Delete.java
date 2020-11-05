package bank11;

import java.util.Scanner;

class Delete extends Userinfo {
	static void delete(Bank_v4 bank) {
		Scanner scanner = new Scanner(System.in);
		if(!userinfo(bank)) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("삭제하시겠습니까? (Y/N)");
		if(scanner.next().equalsIgnoreCase("Y"))
		{bank.setId(null);bank.setPass(null);bank.setBalance(0);}
		}
}
