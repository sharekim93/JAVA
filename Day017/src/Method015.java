import java.util.Arrays;

public class Method015 {
	
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

			
		
	}

	public static void show(int hap, int month, int end, int date) {
		System.out.println("===================== "+month+"월 =====================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i=0;i<7;i++) {
			if(i<(hap-date+1)%7) {System.out.print("*\t");}
			else System.out.print(i-(hap-date)%7+"\t");
		}
		System.out.println();
		int count=0;
		for (int i=7-(hap-date)%7;i<=end;i++) {
			System.out.print(i+"\t");count++;
			if (count%7==0) {System.out.println();}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		myCalendar(2019,2,27);

	}

}
