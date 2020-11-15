package bank13;

public class Withdraw extends BankUsing implements Bank_Controller{
	Withdraw(){super();}
	public void exec() {
		double money=0;
		
		int index = userIndex(userinfo());
		System.out.println("=====출금 계좌정보 입력=====");
		try{
			if(index==-1) {throw new Exception("계좌 정보가 없습니다.");}
			else {
			System.out.print("출금액 : ");
			money=scanner.nextDouble();

			if (money<0) {throw new Exception("잘못 입력하셨습니다.");}
			else if (model.get(index).getBalance()-money>=0) {model.get(index).setBalance(model.get(index).getBalance()-money);}
			else if (model.get(index).getBalance()-money<0) {throw new Exception("금액이 모자랍니다");}

			}
		}
		catch(Exception e) {System.out.println(e.getMessage());}

	}
}