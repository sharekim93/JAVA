package interface006;

import java.util.Arrays;
import java.util.Scanner;

class Using001 extends UserInfo implements Menu {


	UserInfo[] users;
	static int usercnt=0;
	Scanner scanner;
	
	public Using001() {users = new UserInfo[3]; scanner = new Scanner(System.in);}
	
	@Override
	public String toString() {
		return "Using001 [users=" + Arrays.toString(users) + "]";
	}
	
	@Override
	public void menu() {
		while(true) {
			System.out.print("=== 메뉴를 선택하시오\n1.추가\n2.조회\n3.종료\n=선택>>>");
			System.out.println(Arrays.toString(users));
			int num=scanner.nextInt();
			switch(num) {
			case 1:create();break;
			case 2:read();break;
			case 3:return;
			}
		}
	}

	@Override
	public void create() {
		if(usercnt>2) {System.arraycopy(users, 0, users = new UserInfo[usercnt+1], 0, usercnt-1);}
		users[usercnt] = new UserInfo();
		bar();
		System.out.println("= 유저정보 입력");
		bar();
		users[usercnt].setUno(++ucnt);
		System.out.print("ID\t입력: ");
		users[usercnt].setUid(scanner.next());
		System.out.print("PASS\t입력: ");
		users[usercnt].setUpass(scanner.next());
		usercnt++;
	}

	@Override
	public void read() {
		bar();
		System.out.println("NO\tID\tPASS");
		bar();
		for(int i=0;i<usercnt;i++) {
			System.out.println(users[i].toString());
			System.out.println("-------------------------------------------");
		}

	}
	public void bar() {
		System.out.println("============================================");
	}

}
