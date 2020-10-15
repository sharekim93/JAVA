
public class Extra001 {

	public static void main(String[] args) {
		// [번외]1. 서기 1년1월1일부터 금일까지의 날수
		
		// 변수
		int today=0;
		
		today= 2019*365 
			+ (2019/4) - (2019/100) + (2019/400) // 윤년 계산
			+ 31*(8/2) //홀수월 31일 계산
			+ 30*(8/2) //짝수월 30일 계산
			+ 1 // 8월 예외 덧셈
			+ (-2 + 1) // 2월 28일까지 -2일 + 윤년 1일
			+ 25;  // 9월 일수
		System.out.println(today);
	}

}
