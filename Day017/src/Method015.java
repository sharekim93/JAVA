import java.util.Arrays;

public class Method015 {
	
	public static boolean leap(int n) {
		if (n%4==0&&n%100!=0||n%400==0) return true;
		else return false;
	}
	//[분석]
	//리턴값 : boolean (true/false)
	//파라미터 : int n
	//기능 : 윤년인지 평년인지 판단해서 윤년이면 true, 평년이면 false 를 return
	
	public static String week(int key) {
		String result=null;
		switch(key%7)
		{
		case 0: result ="일요일";break;
		case 1: result ="월요일";break;
		case 2: result ="화요일";break;
		case 3: result ="수요일";break;
		case 4: result ="목요일";break;
		case 5: result ="금요일";break;
		case 6: result ="토요일";break;
		}
		return result;
	}
	
	//[분석]
	//리턴값 : String
	//파라미터 : int key
	//기능 : 입력한 int key를 7로 나눠서 나머지에 따라 요일을 return 하는 기능
	

	public static void myCalendar(int a, int b, int c)	{
		String result=null,date=null;
		int year=0,month=0,hap=0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		//입력된 연도(a) 이전까지의 합 = year
		for(int i=1; i<a;i++){
			if(leap(i)) {year+=366;}
			else {year+=365;}
		}
		
		//입력된 연도(a)의 입력된 월(b) 이전까지의 합 = month
		for (int i=0; i<b-1;i++){month+=months[i];}
		if(leap(a)) {month+=1;}
		
		//일자의 합
		hap=year+month+c;
		
		//요일
		date=week(hap);
		show(hap,b,months[b-1],c);
		System.out.println("* 서기 1년 ~ 오늘 총 날수 : "+hap+"\n* "+a+"년 "+b+"월 "+c+"일 "+date);

		//[분석]
		//리턴값 : 없음(void)
		//파라미터 : int a(연도), int b(월), int c(일)
		//기능 : 입력한 int a,b,c(연,월,일)을 처리하여 서기 1년 1월 1일부터 오늘까지의 날수를 출력 및 달력을 출력
		
	}

	public static void show(int hap, int month, int end, int date) {
		System.out.println("===================== "+month+"월 =====================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 첫줄 표현 
		if((hap+1)%7!=0) {
			for (int j=0;j<7;j++) {
				if(j<=(hap+1)%7) {System.out.print("*\t");}
				else System.out.print(j-(hap+1)%7+"\t");
				}
			System.out.println();
		}		
		// *표 이후 출력
		int count=0;
		for (int j=7-(hap+1)%7;j<=end;j++) {
			System.out.print(j+"\t");count++;
			if (count%7==0) {System.out.println();}
		}
		System.out.println();
	}
	//[분석]
	//리턴값 : 없음(void)
	//파라미터 : int hap(입력 연월일까지의 서기 1년 1월 1일부터의 총 일수), int month(입력 월), 
	//        int end(해당 월의 마지막 일 = 숫자), int date(입력 일자)
	//기능 : 입력한 변수를 이용 입력월의 달력을 출력하는 기능
	
	public static void main(String[] args) {
		myCalendar(2020,10,23);

	}

}
