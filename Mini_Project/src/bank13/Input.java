package bank13;

public class Input extends BankUsing implements Bank_Controller {
	Input(){super();}
	public void exec() {
		String temp[] = new String[2];
		double temp_bal =0;
		
		temp = super.userinfo();
		if(!super.validate_id(temp[0])) {return;}
		if(!super.validate_pass(temp[1])) {return;}
		temp_bal = super.inputBal();
		if(!super.validate_bal(temp_bal)) {return;}
		model.add(new Model(temp[0],temp[1],temp_bal));
	}	
}