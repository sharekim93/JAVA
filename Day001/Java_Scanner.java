import java.util.Scanner;
public class Java_Scanner {
	
	public static void main(String[] args) {
		//[GIGO]
		//변수
		int 	mynum =0;
		Scanner scanner = new Scanner(System.in);
		// 1. Scanner (입력을 받아주는 클래스) = new(Scanner 사용을 위한 공간 마련)
		// 2. Scanner(System.in) System.in(키보드로 입력 하겠다.)
		// 3. Ctrl + Shift + o (알파벳)
		
		//입력
		System.out.println("당신이 좋아하는 숫자는?");
		mynum = 10; //예시
		mynum = scanner.nextInt(); //키보드로 정수형 입력 받는 기능		
		
		//처리&출력
		System.out.println("내가 좋아하는 숫자는 " + mynum + "입니다.");
		
		/*
			1) Scanner
			 - Scanner 클래스는 입력 스트림으로 데이터를 입력 받는 클래스
			 - 고급 입출력 자바 I/O 에서 제공하는 클래스를 사용. Scanner는 상대적으로 간단한 입력을 처리할 때 사용
			 - 객체를 생성할 때 입력 스트림을 변경하면 키볻, 문자열, 파일, 네트워크 등에서 데이터를 받아올 수 있다.
			
			2) 다른 자료형의 사용
			int : nextInt()
			float : nextFloat()
			double : nextDouble()
			String : next()
			char : next.charAt()
			
			3) 타입캐스팅
			한시적으로 자료형을 바꾸는 방법
			10 / (float) 3
			String.format("%.2f", 값);
		 */
		// 아래 내용은 편의를 위해 다른 클래스에서 인용한 것으로 Scanner 클래스를 다시 로드하지 않음
		
		int korean, english, math;
				
		System.out.println("국어점수 입력 : ");
		korean = scanner.nextInt();
		
		System.out.println("영어점수 입력 : ");
		english = scanner.nextInt();
		
		System.out.println("수학점수 입력 : ");
		math = scanner.nextInt();

		System.out.println("======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(
				korean+"\t"+ english+"\t"+ math+"\t" + (korean + english + math) + "\t" + 
				String.format("%.2f",(float)(korean + english + math)/3));
		System.out.println("======================================");
	}

}
