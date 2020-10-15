import java.util.Scanner;

public class For017 {

	public static void main(String[] args) {
		
		//변수
		int kor=0, eng=0, math=0,tot=0;
		float avg=0f;
		String name=null,star=null, pass=null,lev_kor =null, lev_eng = null, lev_math = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("이름을 입력하세요 > ");
		name = scanner.next();
		
		for(;;)
		{
			System.out.println("국어점수를 입력하세요 > ");
			kor = scanner.nextInt();
			if (kor>=0&&kor<=100) {break;}
			else {System.out.println("0부터 100 사이의 수를 입력하세요");}
		}
		for(;;)
		{
			System.out.println("영어점수를 입력하세요 > ");
			eng = scanner.nextInt();
			if (eng>=0&&eng<=100) {break;}
			else {System.out.println("0부터 100 사이의 수를 입력하세요");}
		}for(;;)
		{
			System.out.println("수학점수를 입력하세요 > ");
			math = scanner.nextInt();
			if (math>=0&&math<=100) {break;}
			else {System.out.println("0부터 100 사이의 수를 입력하세요");}
		}
		
		//처리
		tot = (kor + eng + math); //총점
		avg = Math.round(tot/3f*100)/100f; //평균
		
		if ((avg>=70)&&(kor<40||eng<40||math<40)) {pass = "재시험";}
		else if(avg>=70) {pass="합격";}
		else {pass="불합격";} //재시험여부
		
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
		
		String re = "";
		re += (kor <40)? "O\t":"-\t";
		re += (eng <40)? "O\t":"-\t";
		re += (math<40)? "O\t":"-\t"; // 재시험과목 출력
		
		//출력
		System.out.println("================================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t\t장학생");
		System.out.println("================================================================================");
		System.out.print(name+"\t"
				+kor+"("+lev_kor+")"+"\t"
				+eng+"("+lev_eng+")"+"\t"
				+math+"("+lev_math+")"+"\t"
				+tot+"\t"+avg+"\t"+pass+"\t");
		for(int i=1;i<=(int)avg/10;i++) {System.out.print("★");};
		System.out.println("(LV"+(int)avg/10+")"+"\t"+(avg>=95? "장학생":"비해당"));				
		System.out.println("================================================================================");
		if (kor<40||eng<40||math<40)
		{
			System.out.println("재시험과목\t"+re);
			System.out.println("================================================================================");
		}
		
		scanner.close();
	}

}
