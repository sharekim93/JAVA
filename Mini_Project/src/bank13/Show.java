package bank13;

public class Show extends BankUsing implements Bank_Controller {
	Show(){super();}
	public void exec() {
		int index = userIndex(userinfo());
		try {
			if(index==-1) {throw new Exception("조회에 실패했습니다.");}
			else {
			System.out.println("======조회결과======\n\n아이디 : "
					+model.get(index).getId()+"\n암호 : "
					+model.get(index).getPass()+"\n잔액 : "
					+model.get(index).getBalance()
					+"\n조회가 성공했습니다.\n");
			}
		}
		catch(Exception e) {System.out.println(e.getMessage());}
	}
}
