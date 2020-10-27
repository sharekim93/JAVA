import java.util.Scanner;

class TV002{
	//멤버변수
	String channel;
	int volume;
	Scanner scanner = new Scanner(System.in);
	
	//멤버함수
	void show() {
		System.out.println("===== TV \nTV채널 : "+channel+"\nTV볼륨 : "+volume);
	}
	void input(){
		System.out.print("::::::::::MYTV\n::TV채널입력 > ");
		this.channel=scanner.next();
		System.out.print("TV볼륨입력 > ");
		this.volume=scanner.nextInt();
	}
	
	TV002(){};
	TV002(String channel,int volume){
		this.channel = channel;
		this.volume = volume;
	}
	
}

public class Day023_review {

	public static void main(String[] args) {
		//1. TV002라는 자료형으로 만들 수 있는 인스턴스 변수 : channel, volume
		//2. new - 어떤 역할 : 메모리에 로딩 등 인스턴스 생성
		//3. TV002("MBC",6) => 인스턴스 변수에 초기값 셋팅됨. 초기화
 		
		TV002 a1 = new TV002("MBC",6);
		a1.show();
		
		TV002 a2 = new TV002();
		a2.input();
		a2.show();
	
	}

}
