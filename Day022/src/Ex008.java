
//클래스 변수, 인스턴스 변수, 지역변수로 구분하시오
class PlayingCard{
	int kind; //(3)
	int num; // (4)
	static int width; //(1)
	static int height;//(2)
	
	//멤버함수
	public PlayingCard() {super();}
	public PlayingCard(int k, int n) {super();this.kind=k;this.num=n;}
}						//(5)    (6)

/*
 * - 클래스 변수 : 1,2
 * - 인스턴스 변수 : 3,4
 * - 지역 변수 : 5,6
 */


public class Ex008 {

	public static void main(String[] args) {
		// 형식상~

	}

}
