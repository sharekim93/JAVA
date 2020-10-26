
public class Day022_test {

	public static void main(String[] args) {
		String name[] = {"아이언맨","헐크","캡틴","토르","호크아이"};
		int size = name.length;
		int kor[] = {100,20,90,70,35};
		int eng[] = {100,50,95,80,100};
		int mat[] = {100,30,90,60,100};
		float avg[] = new float[5];
		int rank[] = {1,1,1,1,1};
		String pass[] = new String[5];
		String jang[] = {"","","","",""};
		String star[] = {"","","","",""};
		
		//1) process_aver
		for(int i=0;i<name.length;i++) {
			avg[i]=process_avg(kor[i],eng[i],mat[i]);
		}
		//2) process_rank
		process_rank(size,avg,rank);
		
		//3) process_scholoar
		process_scholar(avg,jang);
		
		//4) process_pass
		process_pass(avg,kor,eng,mat,pass);
		
		//process_star
		process_star(avg,star);
		
		//process_show
		process_show(name,kor,eng,mat,avg,rank,pass,jang,star);
	}



	private static float process_avg(int i, int j, int k) {
		return (int)((i+j+k)/3.0f*100)/100f;
	}
	
	private static void process_rank(int size, float[] avg, int[] rank) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(avg[i]<avg[j]){rank[i]++;}
			}
		}
	}

	private static void process_scholar(float[] avg, String[] jang) {
		for(int i=0;i<avg.length;i++) {
			if (avg[i]>=95) { jang[i]="장학생";}
		}
		
	}

	private static void process_pass(float[] avg, int[] kor, int[] eng, int[] mat, String[] pass) {
		for(int i=0;i<avg.length;i++) {
			if(avg[i]>=60&&(kor[i]<40||eng[i]<40||mat[i]<40)) {pass[i]="재시험";}
			else if(avg[i]>=60) {pass[i]="합격";}
			else pass[i]="불합격";
		}
		
	}

	private static void process_star(float[] avg, String[] star) {
		for(int i=0;i<avg.length;i++) {
			for(int j=0;j<(int)(avg[i]/10);j++) {
				star[i]+="*";
			}
		}
		
	}

	private static void process_show(String[] name, int[] kor, int[] eng, int[] mat, float[] avg, int[] rank, String[] pass,
			String[] jang, String[] star) {
		System.out.println("=========================================================================================");
		System.out.println("\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
		System.out.println("=========================================================================================");
		for(int i=-0;i<name.length;i++) {
			System.out.println(name[i]+"\t"+
								kor[i]+"\t"+
								eng[i]+"\t"+
								mat[i]+"\t"+
								avg[i]+"\t"+
								rank[i]+"\t"+
								pass[i]+"\t"+
								jang[i]+"\t"+
								star[i]);
		}
		System.out.println("=========================================================================================");
	}

}
