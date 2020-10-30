package classArr006;

class Money_Show_ver2 {
	Money_Show_ver2(){super();}
	void show(Money_ver2 money) {
		this.menu();
		MoneyCard.cardRanking(money);
		System.out.println("[USER] "+money.getUser_name()+"고객님의 정보입니다.");
		System.out.println("잔액 : "+money.getUser_won()+"원\n");
	}
	void show(Money_ver2[] money) {
		this.menu();
		MoneyCard.cardRanking(money);
		System.out.println("[USER]\tNAME\tBALANCE\tCARD");
		for(int i=0;i<money.length;i++) {
			System.out.println("--------------------------------------------------");
			System.out.println("[USER]\t"+money[i].getUser_name()+"\t"+money[i].getUser_won()+"원"+"\t"+money[i].getCard());
		}
	}
	void menu() {
		System.out.println("===================================================");
		System.out.println(":::::::::::::: WELCOME! "+Money_ver2.BANKNAME);
		System.out.println("===================================================");
	}
}
