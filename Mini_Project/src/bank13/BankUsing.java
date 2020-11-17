package bank13;

import java.util.Scanner;

public class BankUsing extends BankUtil{
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		Bank_Controller[] con = new Bank_Controller[] {
				new Menu(),
				new Input(),
				new Show(),
				new Deposit(),
				new Withdraw(),
				new Delete()};
		while(true){
		con[0].exec();
		System.out.println(model.toString());
		
		int num = scanner.nextInt();
			switch(num) {
			case 1:int index = checkCapacity(model);
					if(index!=-1) {con[1].exec();break;}
					else {break;}
			case 2:con[2].exec();break;
			case 3:con[3].exec();break;
			case 4:con[4].exec();break;
			case 5:con[5].exec();break;
			case 9:System.out.println("종료합니다.");return;
			}
		}
	}
}