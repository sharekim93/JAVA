
public class Method016 {

	
	public static boolean leap(int n) {
		if (n%4==0&&n%100!=0||n%400==0) return true;
		else return false;
	}
	
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
	// week() : 요일 계산 메서드
	// int key : 서기 1년 1년부터 구하려는 날까지의 일수
	// return : String 
	
	
	public static void livedDays(int year, int month, int day) {
		int today_year=2020;
		int today_month=10;
		int today_day=20;
		int days=0;
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//윤년여부에 따른 year년부터 today_year년 이전까지의 일수를 days에 더함
		for(int i=year; i<today_year;i++){
			if(leap(i)) {days+=366;}
			else {days+=365;}
		}
		// 입력한 month까지의 일수를 days에서 뺌
		for (int i=0; i<month-1;i++){days-=months[i];}
		if(leap(year)){
			if(month>2){days-=1;}
		}
		//입력된 day의 전일까지 삭제
		days=days-day+1;
		
		// 올해 1월 1일부터 이번 달 전까지 일수를 days에 더함
		for (int i=0; i<today_month-1;i++){days+=months[i];}
		if(leap(today_year)){
			if(today_month>2){days+=1;}
		}
		// 이번 달 오늘날짜를 days에 더함
		days+=today_day;
		
		//출력
		System.out.println("오늘까지 살아온 날 수 : "+days);
		
		
		//return : void
		//int year,month,day : 입력한 연,월,일
		//int today_year,today_month,today_day : 오늘의 연,원,일
		
	}
	public static void main(String[] args) {
		livedDays(1993,9,4);

	}

}
