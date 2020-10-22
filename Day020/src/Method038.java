
public class Method038 {

	public static void main(String[] args) {
		String name[] = {"아이언맨","헐크","캡틴","토르","호크아이"};
		int size = name.length;
		
		int[] kor = {100,20,90,70,35};
		int[] eng = {100,50,95,80,100};
		int[] mat = {100,30,90,60,100};
		
		int avg[] = new int[5];
		int rank[] = {1,1,1,1,1,};
		String pass[] = new String[5];
		String jang[] = {"","","","",""};
		String star[] = {"","","","","",};
		// 1) process_aver - 평균 구하기
		for(int i=0; i<name.length;i++) {
			avg[i]=process_avg(kor[i],eng[i],mat[i]);
			}
		//2) process_rank - 등수 구하기	
		process_rank(size, avg, rank);
		//3) process_scholar - 장학생 95점 이상
		process_scholar(avg, jang);
		//4) process_pass - 합격 :60이상이고 각각 40이상/재시험 : 각각 40미만인 게 있다면/불합격
		process_pass(avg,kor,eng,mat,pass);
		// process_star - 별
		process_star(avg,star);
		// process_show - 출력
		process_show(name,kor,eng,mat,avg,rank,pass,jang,star);
		
	}	
	public static int process_avg(int kor, int eng, int mat) {
		return (kor+eng+mat)/3;				
	}
	//method name : procee_avg
	//return : int
	//parameter : int kor, int eng, int mat
	
	public static void process_rank(int size, int avg[], int rank[]) {
		for (int i=0; i<size;i++) {
			for (int j=0;j<size;j++) {
				if(avg[i]<avg[j]) {rank[i]+=1;}
			}
		}	
	}
	//method name : process_rank
	//return : void
	//parameter : int size, int avg[], int rank[]
	
	public static void process_scholar(int avg[],String jang[]) {
		for(int i=0;i<avg.length;i++) {
			if(avg[i]>=95) {jang[i]="장학생";}
		}
	}
	//method name : process_scholar
	//return : void
	//parameter : int avg[],String jang[]
	
	public static void process_pass(int avg[],int kor[], int eng[], int mat[],String pass[]) {
		for(int i=0;i<avg.length;i++) {
			if(avg[i]>=60&&(kor[i]<40||eng[i]<40||mat[i]<40)) {pass[i]="재시험";}
			else if(avg[i]>=60) {pass[i]="합격";}
			else {pass[i]="불합격";}
		}
	}
	//method name : process_pass
	//return : void
	//parameter : int avg[],int kor[], int eng[], int mat[],String pass[]
	
	public static void process_star(int avg[],String star[]) {
		for(int i=0;i<avg.length;i++) {
			for(int j=0;j<(int)(avg[i]/10);j++) {
			star[i] += "★";
			}
		}
	}
	//method name : process_star
	//return : void
	//paramter : int avg[],String star[]
	
	public static void process_show(String name[],int kor[],int eng[],int mat[],int avg[],int rank[],String pass[],String jang[],String star[]) {
		String rename="";
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<2;j++) {
				rename+=name[i].charAt(j);
			}
			name[i]=rename;
			rename="";
		}
		
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		for (int i=0; i<name.length;i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+avg[i]+"\t"+rank[i]+"\t"+pass[i]+"\t"+jang[i]+"\t"+star[i]);
		}
	}
	//method name : process_show
	//return : void
	//parameter : String name[],int kor[],int eng[],int mat[],int avg[],int rank[],String pass[],String jang[],String star[]
}
