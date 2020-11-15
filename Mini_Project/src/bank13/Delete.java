package bank13;

public class Delete extends BankUsing implements Bank_Controller{
	Delete(){super();}
	public void exec() {
		int index = userIndex(userinfo());
		try {
		if(index==-1) {throw new Exception("계좌 정보가 없습니다.");}
		else {
			System.out.print("삭제하시겠습니까? (Y/N)");
			if(scanner.next().equalsIgnoreCase("Y"))
			{model.get(index).setId(null);model.get(index).setPass(null);model.get(index).setBalance(0);}
			}
		}
		catch (Exception e) {System.out.println(e.getMessage());}
	}
}
