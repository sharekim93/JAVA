import java.util.Scanner;

class TV002 {
	// 멤버변수
	String channel;
	int volume;

	void show() {

		System.out.println("===== TV\nTV채널 : " + channel + "\nTV 볼륨 : " + volume);

	}

	void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("\n::::::::MYTV\n::TV채널입력 > ");
		channel = scanner.next();
		System.out.print("::TV볼륨입력 > ");
		volume = scanner.nextInt();
	}
	TV002(){};
	
	TV002(String ch, int vol) {
		this.channel = ch;
		this.volume = vol;
	}

}

public class Class010 {

	public static void main(String[] args) {
		TV002 a1 = new TV002("MBC",6);
		a1.show();
		
		TV002 a2 = new TV002();
		a2.input();
		a2.show();

	}

}
