
public class Ex018 {

	public static void main(String[] args) {
		
		//변수
		String name[] = {"아이언맨","헐크","캡틴","토르","호크아이"};
		String hap[] = new String[5];
		String jang[] = {"","","","",""};
		String star[] = {"","","","",""};

		int kor[] = {100,100,100,70,35};
		int eng[] = {100,100,100,80,35};
		int mat[] = {100,100,100,60,35};
		int avg[] = new int[5];
		int rank[] = {1,1,1,1,1};

		int dupl=0;
		//처리
		for(int i=0;i<name.length;i++)
		{
			//평균
			avg[i]=(kor[i]+eng[i]+mat[i])/3;

			//등수
			//평균이 다른 element보다 작은 경우 +1(중복 포함)
			for(int j=0;j<avg.length;j++)
			{
				if(avg[i]<avg[j]) {rank[i]=rank[i]+1;}
			}
			
			//합격
			if(avg[i]>=60) {hap[i]="합격";}
			else {hap[i]="불합격";}
			
			//장학
			if(avg[i]>=95) {jang[i]="장학생";}
			
			//랭킹
			for(int j=0;j<avg[i]/10;j++){star[i]+="*";}
		}

		//출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격\t장학생\t랭킹");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0;i<name.length;i++) {
		System.out.println(name[i]+"\t"+
							kor[i]+"\t"+
							eng[i]+"\t"+
							mat[i]+"\t"+
							avg[i]+"\t"+
							rank[i]+"\t"+
							hap[i]+"\t"+
							jang[i]+"\t"+
							star[i]+"\t");
		}
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

}
