
public class Method007 {
	public static int max(int a, int b, int c) {
		int result=0;
		if(a>b) {
			if(b>c) result = a;
			else if(a>c) result = a;
			else result = c;
		}
		if(a<b) {
			if(b>c) result = b;
			else result = c;
		}
		return result;
	}
	public static void main(String[] args) {
		//세 개의 숫자를 입력 받아 최대값을 출력하는 메서드를 작성하시오
		int res3=max(3,5,7);
		System.out.println("최대값 : "+res3);
	}

}
