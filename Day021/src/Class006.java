class Score001{
	String name,p,s;
	int kor,eng,math,total,aver;
	
	void process() {
		total = (kor+eng+math);
		aver = total/3;
	}
	void pass() {
		p =(aver>=60)? "합격":"불합격";
	}
	void scholar() {
		s =(aver>=95)? "장학생":"";
	}
	void star() {
		for(int i=0;i<aver/10;i++) {
			System.out.print("*");
		}
	}
	void show() {
		process();
		pass();
		scholar();
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.print(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+aver+"\t"+p+"\t"+s+"\t");star();
		System.out.println();
		System.out.println();
	}
}


public class Class006 {

	public static void main(String[] args) {
		Score001 iron=new Score001();
		iron.name="아이언맨";iron.kor=100;iron.eng=100;iron.math=100;
		iron.show();

		Score001 hulk=new Score001();
		hulk.name="헐크";hulk.kor=20;hulk.eng=50;hulk.math=30;
		hulk.show();
	}

}
