package bank11_instance;

class Input extends Userinfo {
	void input(Bank_v4 bank) {
		String temp[] = new String[2];
		double temp_bal =0;
		
		temp = userinfo();
		if(!validate_id(temp[0])) {return;}
		if(!validate_pass(temp[1])) {return;}
		temp_bal = inputBal();
		if(!validate_bal(temp_bal)) {return;}
		
		bank.setId(temp[0]);
		bank.setPass(temp[1]);
		bank.setBalance(temp_bal);
	}

	
}