import java.util.Scanner;

class Coffee005{
	//멤버변수
	static String coffeeName[];
	static int coffeePrice[];
	String name;
	int num,price;
	Scanner scanner = new Scanner(System.in);
	static{
		String names[] = {"아메리카노","카페라떼","카푸치노"};
		coffeeName=names;
		int prices[] = {1000,1500,2000};
		coffeePrice=prices;
	}
	
	//멤버함수
	void input() {
		System.out.println("\n::::::COFFEE ORDER");
		for(int i=0;i<coffeeName.length;i++) {
			System.out.print(coffeeName[i]+" : "+coffeePrice[i]+"\t");
		}
		System.out.print("\n커피이름 입력 > ");
		this.name = scanner.next();
		if(this.name.contains("아메")) {this.name=(coffeeName[0]);}
		else if(this.name.contains("라떼")) {this.name=(coffeeName[1]);}
		else if(this.name.contains("카푸")) {this.name=(coffeeName[2]);}
		
		System.out.print("잔수(개수) 입력 > ");
		this.num=scanner.nextInt();
	}
	
	void coffee_calc() {
		if(this.name==coffeeName[0]) {this.price=coffeePrice[0]*this.num;}
		if(this.name==coffeeName[1]) {this.price=coffeePrice[1]*this.num;}
		if(this.name==coffeeName[2]) {this.price=coffeePrice[2]*this.num;}
	}
	
	void show() {
		coffee_calc();
		System.out.println("\n===== COFFEE_SHOW\n= 커  피  명  : "+this.name);
		System.out.println("= 커피잔수  : "+this.num);
		System.out.println("= 커피가격  : "+this.price);
	}
	
	//생성자
	Coffee005(){}
	Coffee005(String name, int num){this.name=name;this.num=num;}	
}

public class Class025_static_Ex3 {

	public static void main(String[] args) {
		Coffee005 a1 = new Coffee005("아메리카노",3); a1.show();
		Coffee005 a2 = new Coffee005(); a2.input(); a2.show();
	}

}
