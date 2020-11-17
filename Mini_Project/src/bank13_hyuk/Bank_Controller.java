package bank13_hyuk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface Bank_Controller {
	void exec(ArrayList<BankData> lists);

}

class CheckID {
	public int checkID(ArrayList<BankData> lists) {

		int savenum = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력해주시오");
		String tempId = scanner.next();
		System.out.println("비밀번호를 입력해주시오");
		String tempPass = scanner.next();

		for(int i=0; i<lists.size(); i++) {
			BankData info=lists.get(i);
		if (tempId.equals(info.getId()) && tempPass.equals(info.getPass())) {
			savenum = i;
		}
		}
		return savenum;
	}

}

class Input implements Bank_Controller {

	@Override
	public void exec(ArrayList<BankData> lists) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		BankData a= new BankData();
		System.out.println("아이디를 입력해주시오");
		a.setId(scanner.next());
		System.out.println("비밀번호를 입력해주시오");
		a.setPass(scanner.next());
		System.out.println("잔액을 입력해주시오");
		a.setBalance(scanner.nextDouble());
		lists.add(a);

	}


}

class Show extends CheckID implements Bank_Controller {

	@Override
	public void exec(ArrayList<BankData> lists) {
		int savenum = checkID(lists);
		if (savenum == -1) {
			System.out.println("입력정보가 잘못돼었습니다");
		} else {
			System.out.println("아이디 : " + lists.get(savenum).getId());
			System.out.println("비번 : " + lists.get(savenum).getPass());
			System.out.println("잔액 : " + lists.get(savenum).getBalance());

		}
	}

	
}

class Deposit extends CheckID implements Bank_Controller {
	Scanner scanner = new Scanner(System.in);

	@Override
	public void exec(ArrayList<BankData> lists) throws InputMismatchException {
		int savenum = checkID(lists);
		if (savenum == -1) {
			System.out.println("입력정보가 잘못돼었습니다");
		} else {
			System.out.println("아이디 : " + lists.get(savenum).getId());
			System.out.println("비번 : " +  lists.get(savenum).getPass());
			System.out.println("입금액 : >>>");
			double inmon = scanner.nextDouble();
			if (inmon < 0) {
				System.out.println("마이너스금액 입력불가");
			} else {
				lists.get(savenum).setBalance(lists.get(savenum).getBalance() + inmon);
				System.out.println("잔액 : " +lists.get(savenum).getBalance());
			}

		}

	}

}

class Withdraw extends CheckID implements Bank_Controller {
	Scanner scanner = new Scanner(System.in);

	@Override
	public void exec(ArrayList<BankData> lists) throws InputMismatchException {
		int savenum = checkID(lists);
		if (savenum == -1) {
			System.out.println("입력정보가 잘못돼었습니다");
		} else {
			System.out.println("아이디 : " + lists.get(savenum).getId());
			System.out.println("비번 : " + lists.get(savenum).getPass());
			System.out.println("출금액 : >>>");
			double outmon = scanner.nextDouble();
			if (outmon >lists.get(savenum).getBalance()) {
				System.out.println("잔액부족");
			} else {
				lists.get(savenum).setBalance(lists.get(savenum).getBalance() - outmon);
				System.out.println("잔액 : " + lists.get(savenum).getBalance());
			}

		}

	}

}

class Delete extends CheckID implements Bank_Controller {
	Scanner scanner = new Scanner(System.in);

	@Override
	public void exec(ArrayList<BankData> lists) {
		int savenum = checkID(lists);
		if (savenum == -1) {
			System.out.println("입력정보가 잘못돼었습니다");
		} else {
			System.out.println("아이디 : " + lists.get(savenum).getId());
			System.out.println("비번 : " + lists.get(savenum).getPass());
			System.out.println("삭제하시겠습니까??(y or n)");
			char a = scanner.next().charAt(0);
			if (a == 'y') {
				lists.get(savenum).setId("");
				lists.get(savenum).setPass("");
				lists.get(savenum).setBalance(0);
			}

		}

	}

}
