import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//변수
		int kor=0,eng=0,math=0;
		float avg=0.f;
		String id=null,pass=null,rank=null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("ID\t입력 > ");
		id = scanner.next();
		
		for(;;)
		{
			System.out.println("국어점수입력 (0~100사이)>");
			kor=scanner.nextInt();
			if(kor<=100&&kor>=0) {break;}
			else System.out.println("잘못입력하셨습니다");
		}
		
		for(;;)
		{
			System.out.println("영어점수입력 (0~100사이)>");
			eng=scanner.nextInt();
			if(eng<=100&&eng>=0) {break;}
			else {System.out.println("잘못입력하셨습니다");}
		}
		for(;;)
		{
			System.out.println("수학점수입력 (0~100사이)>");
			math=scanner.nextInt();
			if(math<=100&&math>=0) {break;}
			else {System.out.println("잘못입력하셨습니다");}
		}

		//처리
		avg=Math.round((kor+eng+math)/3f*100)/100f;
		
		if (avg>=60&&(kor<40||eng<40||math<40)){pass="합격유보";}
		else if(avg>=60) {pass="합격";}
		else {pass="불합격";}

		
		//출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("ID\t국어\t영어\t수학\t평균\t합격여부\t장학생\t랭킹");
		System.out.print(id+"\t"+kor+"\t"+eng+"\t"+math+"\t"+avg+"\t"+pass+"\t"+
				(avg>=95? "장학생\t":"\t"));
			
				for(int i=1;i<=(int)(avg/10);i++) 
				{
					System.out.print("*");
				}
				System.out.println("\t");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print("재시험\t");
		
		if(kor<40) {System.out.print("O\t");}
		else {System.out.print("X\t");}
		
		if(eng<40) {System.out.print("O\t");}
		else {System.out.print("X\t");}
		
		if(math<40) {System.out.print("O\t");}
		else {System.out.print("X\t");}
		
		
	}

}
