
public class Ex005 {

	public static void main(String[] args) {
		/*
		 * 365.2422일 >> 365일 5시간 48분 46초
		 * double year = 365.2422;
		 * 
		 * ※ 힌트
		 * 1초 :1
		 * 1분 :1*60
		 * 1시간 : 1*60*60
		 * 1일 : 1*60*60*24 = 86400
		 * 
		 */

		//변수&입력
		double year=365.2422, day = 86400, hour = 3600, min = 60, sec = 1,time = 0;
		int result_day, result_hour, result_min, result_sec;
		
		//처리
		time = year*day;
		result_day  = (int)(time/day);
		result_hour = (int)((time%day)/hour);
		result_min  = (int)((time%hour)/min);
		result_sec  = (int)((time%min)/sec);
		
		System.out.println(year+"일  >>  "
							+result_day+"일 "
							+result_hour+"시간 "
							+result_min +"분 "
							+result_sec +"초");
		
	
		
	}

}
