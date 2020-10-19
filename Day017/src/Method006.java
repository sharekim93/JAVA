
public class Method006 {

	public static int abs(int n) {
		if(n>0) {return n;}
		else if(n<0) {return n*-1;}
		else {return 0;}
	}
	public static void main(String[] args) {
		// 한 개의 숫자를 입력 받아 절대값을 출력해주는 메서드를 작성하시오
		int res1=-3;
		System.out.println("입력값 : "+ res1);
		System.out.println("절대값 : "+abs(res1));
	}

}
