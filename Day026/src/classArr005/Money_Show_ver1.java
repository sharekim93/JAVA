package classArr005;

class Money_Show_ver1 {
	Money_Show_ver1(){super();}
	void show(Money_ver1 money) {
		this.menu();
		System.out.println("[USER] "+money.getUser_name()+"고객님의 정보입니다.");
		System.out.println("잔액 : "+money.getUser_won()+"원\n");
	}
	void show(Money_ver1[] money) {
		this.menu();
		System.out.println("[USER]\tNAME\tBALANCE");
		for(int i=0;i<money.length;i++) {
			System.out.println("--------------------------------------------------");
			System.out.println("[USER]\t"+money[i].getUser_name()+"\t"+money[i].getUser_won()+"원");
		}
	}
	void menu() {
		System.out.println("===================================================");
		System.out.println(":::::::::::::: WELCOME! "+Money_ver1.BANKNAME);
		System.out.println("===================================================");
	}
}
