
public class Ex017 {

	public static void main(String[] args) {
		
		// 성적처리 프로그램 만들기
		// 장학생 avg>=95, 합격 >=60
		
		//입력(배열)
		//suggested
		String[] name = {"아이언맨","헐크","캡틴","토르","호크아이"};
		int[] kor= {100,20,90,70,35};
		int[] eng= {100,50,95,80,100};
		int[] mat= {100,30,90,60,100};
		int[] avg= new int[5];
		int size=name.length;
		
		//added
		String[] hap= new String[5];
		String[] jang= new String[5];
		
		//처리
		for (int i=0;i<size;i++)
		{
			//평균
			avg[i]=(kor[i]+eng[i]+mat[i])/3;
			
			//합격		
			if(avg[i]>=60) {hap[i]="합격";}
			else {hap[i]="불합격";}

			//장학
			if(avg[i]>=95) {jang[i]="장학생";}
			else {jang[i]="----";}		
		}
		
		//출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0;i<size;i++)
		{
			System.out.println(name[i]+"\t"+
								kor[i]+"\t"+
								eng[i]+"\t"+
								mat[i]+"\t"+
								avg[i]+"\t"+
								hap[i]+"\t"+
								jang[i]);
		}
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		

	}

}
