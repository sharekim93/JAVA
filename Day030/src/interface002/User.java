package interface002;

import java.util.Arrays;
import java.util.Calendar;

class User implements Launch {
	int money;
	Launch [] plate;
	int cnt=0;
	boolean first =true;
	User(){money=Launch.money;plate = new Launch[3];}
	@Override
	public void eat() {}
	
	@Override
	public String toString() {
		return Arrays.toString(plate);
	}
	public void order(Launch launch) {
		plate[cnt++]=launch;
		
		if (money<0) {System.out.println("= 잔액이 부족해 더 이상 주문이 불가능합니다.");}
		else {
		if(launch instanceof Burger) {money-=Burger.price;}
		else if(launch instanceof KimchiStew) {money-=KimchiStew.price;}
		}
	}
	void show() {
		System.out.print("주문\t: ");
		for (int i=0;i<cnt;i++) {
			if(first) {first=false;}
			else System.out.print(", ");
			System.out.print(plate[i].toString());
		}
		System.out.println();
		System.out.println("주문금액\t: "+(Launch.money-money));
		System.out.println("잔액\t: "+money);
		Calendar today = Calendar.getInstance();
		System.out.println("주문시간\t: "+today.get(1)+"년 "+(today.get(2)+1)+"월 "+today.get(5)+"일");
		System.out.println();
		for (int i=0;i<cnt;i++) {
			plate[i].eat();
		}
	}

}
