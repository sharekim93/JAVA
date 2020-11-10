package collection;

import java.util.Scanner;
import java.util.Vector;

class CoffeeInfo{

	public static int no;
	private int cnt;
	private String name;
	private int price;
	private int num;
	private int total;
	
	CoffeeInfo(){super();}
	CoffeeInfo(String name, int price, int num){    
		super(); this.cnt=++no;this.name=name;this.price=price;this.num=num;this.total=price*num;
	}
	
	@Override
	public String toString() {
		return "ORDER" + cnt + " : " + name + "\t" + price + "\t" + num + "\t" + total+
				"\n---------------------------------------------------";
	}
	
}

public class Collection005 {
	public static void main(String[] args) {
		Vector coffees = new Vector();
		Scanner scanner = new Scanner(System.in);
		
		coffees.add(new CoffeeInfo("카페라떼  ",1800,2));
		coffees.add(new CoffeeInfo("아메리카노",1500,3));
		coffees.add(new CoffeeInfo("에스프레소",2000,1));
		
		menu();
		for(int i=0;i<coffees.size();i++) {
			System.out.println(coffees.get(i));
		}
		while(true) {
		System.out.println("주문정보입니다.");
		System.out.print("주문이름을 적어주세요 > ");
		String temp = scanner.next();

		if (temp.contains("카페")||temp.contains("라떼")){menu();System.out.println("\n"+coffees.get(0));}
		else if(temp.contains("아메")){menu();System.out.println("\n"+coffees.get(1));}
		else if(temp.contains("에스")){menu();System.out.println("\n"+coffees.get(2));}
		else System.out.println("잘못 입력하셨습니다.");
		}
	}
	static void menu() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\t NAME\t\tPRICE\tNUM\tTOTAL");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
}
