import java.util.Scanner;
public class Ex003_Total {
	public static void main(String[] args) {
		System.out.println("주어진 변수를 이용하여 GIGO의 형식으로 작성하시오 \n"
				+ "//변수\n"
				+ "String name = \"\";\n"
				+ "int kor=0, eng=0, math=0, total=0\n"
				+ "float avg=0.0f\n"
				+ "String level=\"\"\n");
		
		//변수
		String name = null, level=null;
		int kor=0, eng=0, math=0, total=0;
		float avg = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("이름 입력 > ");
		name = scanner.next();
		System.out.println("국어 입력 > ");
		kor = scanner.nextInt();
		System.out.println("영어 입력 > ");
		eng = scanner.nextInt();
		System.out.println("수학 입력 > ");
		math = scanner.nextInt();
		
		//처리
		total = (kor+eng+math);
		avg = Math.round((total/(float)3)*1000)/1000f; // == total/3.0f
		level = String.format("Lv"+(int)avg/10);
				
		//출력 
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::\t\t\tGREEN IT SCORE\t\t\t::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t레벨");
		System.out.println(name+"\t" +kor+"\t" +eng+"\t" +math+"\t"
						  +total+"\t"+avg+"\t" + level);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
}
