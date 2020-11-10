package bank11_instance;

import java.util.Scanner;

class Delete extends Userinfo {
	void delete(Bank_v4[] bank) {
		Scanner scanner = new Scanner(System.in);
		int index = userIndex(bank,userinfo());
		if(index==-1) {System.out.println("계좌 정보가 없습니다.");return;}
		else {
			System.out.print("삭제하시겠습니까? (Y/N)");
			if(scanner.next().equalsIgnoreCase("Y"))
			{bank[index].setId(null);bank[index].setPass(null);bank[index].setBalance(0);}
			}
	}
}
