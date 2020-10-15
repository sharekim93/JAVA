import java.util.Scanner;

public class IF015 {

	public static void main(String[] args) {
		/*
		 * 	  0) 학번 담을 자료형선택해  학번이라 변수명을 정하고 입력받기		  
			  1) 국어점수 담을 자료형선택해 kor이라 변수명을 정하고 입력받기
			  2) 영어점수 담을 자료형선택해 eng이라 변수명을 정하고 입력받기
			  3) 수학점수 담을 자료형선택해 math이라 변수명을 정하고 입력받기
			  4) 총점점수 담을 자료형선택해 tot이라 변수명을 정하고 총점구하기 		
			  5) 평균점수 담을 자료형(float)선택해 avg이라 변수명을 정하고  평균구하기 
			  6) 모두 출력 	- 평균은 소수점이 처리되게 만들기 	
			  7) 평균 95이상이면 장학생
			  8) 국어점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
			  9) 평균이 70이상이면 "합격"
				 단, 세과목중에서 한과목이라도 40미만이면
				 합격이 아니라 "재시험"
				 평균이 70미만이면 무조건 "불합격" 
		 */
		//변수
		int kor = 0, eng = 0, math = 0, tot = 0,lev = 0;
		float avg =0.0f;
		String hakbun =null,  janghak = "-", pass ="불합격",
			   lev_kor =null, lev_eng = null, lev_math = null;
		char   re_kor ='-', re_eng = '-', re_math = '-';
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("학번 입력 > ");
		hakbun = scanner.next();
		System.out.println("국어점수 입력 > ");
		kor = scanner.nextInt();
		System.out.println("영어점수 입력 > ");
		eng = scanner.nextInt();
		System.out.println("수학점수 입력 > ");
		math = scanner.nextInt();
	
		// 처리
		tot = (kor + eng + math); // 총점
		avg = Math.round((tot/3f)*100)/100f; // 평균
		
		if (kor >= 90){lev_kor = "수";}
		else if (kor >= 80) {lev_kor = "우";}
		else if (kor >= 70) {lev_kor = "미";}
		else if (kor >= 60) {lev_kor = "양";}
		else {lev_kor = "가";} // 국어등급
		
		if (eng >= 90){lev_eng = "수";}
		else if (eng >= 80) {lev_eng = "우";}
		else if (eng >= 70) {lev_eng = "미";}
		else if (eng >= 60) {lev_eng = "양";}
		else {lev_eng = "가";} // 영어등급
		
		if (math >= 90){lev_math = "수";}
		else if (math >= 80) {lev_math = "우";}
		else if (math >= 70) {lev_math = "미";}
		else if (math >= 60) {lev_math = "양";}
		else {lev_math = "가";} // 수학등급
		
		if (avg >=70){pass = "합격";}// 합격여부		
		if (avg >= 95) {janghak="장학생";} // 장학여부
		lev = (int)(avg/10f); // 레벨
		
		if (kor <40) {re_kor  = 'O';}
		if (eng <40) {re_eng  = 'O';}
		if (math<40) {re_math = 'O';}
		
		/*
		 * String re = null;
		 * if (kor<40){re += "O\t";} else {Re += "-\t";}
		 * re += (eng <40)? "O\t":"-\t";
		 * re += (amth<40)? "O\t":"-\t";
		 */

		//출력
		System.out.println("========================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("========================================================================");
		System.out.println(hakbun+"\t"
							+kor+"("+lev_kor+")"+"\t"
							+eng+"("+lev_eng+")"+"\t"
							+math+"("+lev_math+")"+"\t"
							+tot+"\t"
							+avg+"\t"
							+pass+"\t"
							+janghak+"\t"
							+"Lv"+lev);
		System.out.println("========================================================================");
		System.out.println("재시험과목\t "+re_kor+"\t "+re_eng+"\t "+re_math);
		System.out.println("========================================================================");
		
		/* if (kor<40||eng<40||math<40)
		 * {System.out.println("재시험\t" +re);
		 */
	}

}
