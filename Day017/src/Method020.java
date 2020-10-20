import java.util.Scanner;

public class Method020 {
	
	//total = process_total(kor,eng,math);
	//[분석]
	//기능 : 세 개의 파라미터를 받아 총점 구해 정수형을 리턴함
	//리턴 : total => int (total의 자료형)
	//파라미터 : kor, eng, math => int kor, int eng, int math
	
	public static int process_total(int kor, int eng, int math) {
		return kor+eng+math;
	}
	public static float process_avg(float total) {
		return ((total/3f)*100)/100;
	}
	public static String process_pass(float avg, int kor,int eng,int math,String pass) {
		String result=null;
		if(avg>=60&&(kor<40||eng<40||math<40)) {result = "합격유보";}
		else if(avg>=60) {result="합격";}
		else {result="불합격";}
		return result;
	}
	
	public static String process_scholar(float avg) {
		String result=null;
		if (avg>=95) {result="장학생";}
		else {result="---";}
		return result;
	}
	
	public static String process_star(float avg) {
		String result="";
		for (int i=0;i<(int)(avg/10);i++) {
			result +="*";
		}
		return result;
	}
	
	public static String process_level (int score) {
		String result=null;
		if (score>=90) {result="수";}
		else if(score>=80) {result="우";}
		else if(score>=70) {result="미";}
		else if(score>=60 ) {result="양";}
		else {result="가";}
		
		return result;
	}
	
	public static String process_re (int kor, int eng, int math) {
		
		return ((kor<40)? "O\t":"-\t") + ((eng<40)? "O\t":"-\t") + ((math<40)? "O\t":"-\t");
	}
	
	public static void line1 () {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("----------------------------------------------------------------");
	}
	
	public static void process_show(String name, int kor, int eng, int math, int total, float avg, String pass, String jang, String star) {
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+(avg-(int)avg>0? String.format("%.2f",avg):(int) avg)+"\t"+pass+"\t"+jang+"\t"+star);
	}
	
	public static void line2() {
		System.out.println("----------------------------------------------------------------");
	}
	public static void process_show2(String level_kor,String level_eng, String level_math) {
		System.out.println("\t"+level_kor+"\t"+level_eng+"\t"+level_math);
	}
	public static void process_show3(String re) {
		System.out.println("재시험\t"+re);
	}
	
	public static void main(String[] args) {
		//변수
		String name = "";
		int kor, eng, math,total;
		float avg = 0.0f;
		String pass = "";
		String jang = "";
		String star = "";
		String level_kor = "",level_eng ="",level_math="";
		String re = "";
		Scanner scanner = new Scanner(System.in);

		//입력
		System.out.println("이름을 입력하세요 : ");
		name =scanner.next();
		System.out.println("국어 점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math = scanner.nextInt();
		
		//처리
		total = process_total(kor,eng,math);
		avg =process_avg(total);
		pass = process_pass(avg,kor,eng,math,pass);
		jang = process_scholar(avg);
		star = process_star(avg);
		
		level_kor = process_level(kor);
		level_eng = process_level(eng);
		level_math = process_level(math);
		re=process_re(kor,eng,math);
		
		//출력
		line1();
		process_show(name,kor,eng,math,total,avg,pass,jang,star);
		line2();
		process_show2(level_kor,level_eng,level_math);
		line2();
		process_show3(re);
	}

}
