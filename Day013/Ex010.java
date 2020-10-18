
public class Ex010 {

	public static void main(String[] args) {
		//2020년 10월 13일
		//서기 1년~오늘까지 총 일수:737711을 출력하세요
		int year=2020, month=10, date=13;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String yoil[] = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"}; //요일
		int days=0; //총 일수
		
		//처리
		for(int i=1;i<=year;i++)
		{	
			if (i==year)
			{
				for (int j=0;j<month-1;j++)
				{
					days+=months[j];
				}
				days+=date;
			}
			else {
				for(int k=0;k<months.length;k++)
				{
					days+=months[k];
				}
			}
			if(i%4==0&&i%100!=0||i%400==0) {days++;}
		}
		
		// 총 일수 출력
		System.out.println("* 서기 1년~오늘까지 총 일수:"+days);
		System.out.print("* "+year+"년 "+month+"월 "+date+"일 ");
		
		// 요일 출력
		for(int k=0;k<7;k++)
		{
			if(days%7==k) {System.out.println(yoil[k]);}
		}
	}
}
