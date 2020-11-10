package bank12;

class Show extends Userinfo implements Bank_Controller {
	public void exec(Bank_v6 bank) {
		int index = userIndex(bank,userinfo());
		try {
			if(index==-1) {throw new Exception("조회에 실패했습니다.");}
			else {
			System.out.println("======조회결과======\n\n아이디 : "
					+bank.getId()+"\n암호 : "
					+bank.getPass()+"\n잔액 : "
					+bank.getBalance()
					+"\n조회가 성공했습니다.\n");
			}
		}
		catch(Exception e) {System.out.println(e.getMessage());}
	}
}
