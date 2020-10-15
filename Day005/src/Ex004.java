
public class Ex004 {

	public static void main(String[] args) {
		// int money = 54320;
		// 출력된 결과 : 만원 5장 /천원 4장 / 백원 3개 / 십원 2개
		
		int money = 54320;
		int man = 0, chun = 0, baek =0, sip = 0;
		
		man = money/10000;
		chun = (money-man*10000)/1000;
		baek = (money-man*10000-chun*1000)/100;
		sip  = (money-man*10000-chun*1000-baek*100)/10;
		
		System.out.println("만원 " +man+"장 / "
				+"천원 "+ chun + "장 /"
				+"백원 " + baek + "개 /"
				+"십원 " + sip  + "개");
	}

}
