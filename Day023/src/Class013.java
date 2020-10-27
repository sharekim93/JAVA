import java.util.Scanner;

class Coffee003{
	//멤버변수
	String name=null;
	int price[]= {1000,1500,2000};
	int num;
	
	//멤버함수
	void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("::::::::COFFEE ORDER\n아메리카노 : 1000\t카페라떼 : 1500\t카푸치노 : 2000\n::커피이름 입력 >");
		this.name = scanner.nextLine();
		System.out.print("\n::잔수(개수)입력 > ");
		this.num = scanner.nextInt();
	}
	void show() {
		System.out.print("===== COFFEE_SHOW\n= 커 피 명  : ");
		this.coffee_name();
		System.out.print("\n= 커피잔수   : "
						    +this.num+"\n= 커피가격   : ");
		this.coffee_calc();
	}
	void coffee_calc() {
		int result=0;
		if(this.name.contains("아메")) {result=this.price[0]*this.num;}
		if(this.name.contains("카페")||this.name.contains("라떼")) {result=this.price[1]*this.num;}
		if(this.name.contains("카푸")) {result=this.price[2]*this.num;}
		System.out.println(result);
	}
	void coffee_name() {
		if(this.name.contains("아메")) {this.name="아메리카노";}
		if(this.name.contains("카페")||this.name.contains("라떼")) {this.name="카페라떼";}
		if(this.name.contains("카푸")) {this.name="카푸치노";}
		System.out.print(this.name);
	}
	//생성자
	Coffee003(){};
	Coffee003(String name,int num){
		this.name=name;
		this.num=num;
	}
	
}

public class Class013 {

	public static void main(String[] args) {
		Coffee003 a1= new Coffee003("아메리카노",3);
		a1.show();
		// 1. Coffee003라는 자료형으로 만들 수 있는 인스턴스 변수 : name, num, price[]
		// 2. new : 공간 빌리기. 인스턴스 생성
		// 3. Coffee003("아메리카노",3) => 인스턴스 변수에 [name="아메리카노",num=3] 셋팅됨.
		// 4. 인스턴스 변수를 사용할 수 있게 주소를 가지고 있는 것 : a1
		Coffee003 a2 = new Coffee003();
		// 1. Coffee003라는 자료형으로 만들 수 있는 인스턴스 변수 : name, num, price[]
		// 2. new : 공간 빌리기. 인스턴스 생성
		// 3. Coffee003() => 인스턴스 변수에 [name=null,num=0] 셋팅됨.
		// 4. 인스턴스 변수를 사용할 수 있게 주소를 가지고 있는 것 : a2
		a2.input();
		//5. input() 을 통해 name,num 값을 받음.
		a2.show();
		//6. show()에서 coffee_name, coffee_calc() 메서드를 통해 name, price를 출력. num의 경우 input()에서 대입된 num을 출력
	}

}
