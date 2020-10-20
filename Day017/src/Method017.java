
public class Method017 {
	
	public static boolean leap(int n) {
		if (n%4==0&&n%100!=0||n%400==0) return true;
		else return false;
	}
	
	//leap() : 윤년계산메소드
	//return = boolean
	//윤년 여부를 판단하여 boolean 값으로 return 한다
	
	public static void showAll(int year) {
		int hap=0; // year 이전까지의 일수 합계
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		//윤년처리하여 입력된 year까지 hap에 더하기
		for(int i=1; i<year;i++){
			if(leap(i)) {hap+=366;}
			else {hap+=365;}
		}
		//윤년인 경우 month[] 에서 2월에 해당하는 element를 29로 변경
		if (leap(year)) {months[1]=29;}
		
		//달력 출력
		for(int i=1;i<=12;i++) {
			int count=0;
			System.out.println("===================== "+i+"월 =====================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			// 첫줄 표현 
			if((hap+1)%7!=0) {
				for (int j=0;j<7;j++) {
					if(j<(hap+1)%7) {System.out.print("*\t");}
					else System.out.print(j-hap%7+"\t");
					}
				System.out.println();
			}		
			// *표 이후 출력
			for (int j=7-hap%7;j<=months[i-1];j++) {
				System.out.print(j+"\t");count++;
				if (count%7==0) {System.out.println();}
			}
			System.out.println();
			hap = hap+months[i-1];
		}
			
	}
	
	public static void main(String[] args) {
		showAll(2020);
	}

}
