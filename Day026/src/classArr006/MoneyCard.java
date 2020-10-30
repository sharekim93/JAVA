package classArr006;

class MoneyCard {
	MoneyCard(){super();}
	public static void cardRanking(Money_ver2[] users) {
		for(int i=0;i<users.length;i++) {
		if(users[i].getUser_won()>=25000) {users[i].setCard("gold");}
		else if(users[i].getUser_won()>=15000) {users[i].setCard("silver");}
		else {users[i].setCard("green");}
		}
	}
	public static void cardRanking(Money_ver2 users) {
		if(users.getUser_won()>=25000) {users.setCard("gold");}
		else if(users.getUser_won()>=15000) {users.setCard("silver");}
		else {users.setCard("green");}
	}
}
