package bank12;

class Input extends Userinfo {
	public void exec(Bank_v6 bank) {
		String temp[] = new String[2];
		double temp_bal =0;
		Userinfo user = new Userinfo();
		
		temp = user.userinfo();
		if(!user.validate_id(temp[0])) {return;}
		if(!user.validate_pass(temp[1])) {return;}
		temp_bal = user.inputBal();
		if(!user.validate_bal(temp_bal)) {return;}
		
		bank.setId(temp[0]);
		bank.setPass(temp[1]);
		bank.setBalance(temp_bal);
	}

	
}