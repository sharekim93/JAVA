package bank11_instance;

class Show extends Userinfo {
	
	void show(Bank_v4[] bank) {
		int index = userIndex(bank,userinfo());
		if(index==-1) {System.out.println("조회에 실패했습니다.");return;}
		else {
		System.out.println("======조회결과======\n\n아이디 : "
				+bank[index].getId()+"\n암호 : "
				+bank[index].getPass()+"\n잔액 : "
				+bank[index].getBalance()
				+"\n조회가 성공했습니다.\n");
		}
	}
}
