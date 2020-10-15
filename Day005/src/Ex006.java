
public class Ex006 {

	public static void main(String[] args) {
		// 아래와 같이 출력하세요
		// 2019년도는 윤년입니까? false
		
		//변수
		int year = 2019; 
		boolean fouryr_con, hundyr_con, fourhundyr_con, result;
		
		//처리
		fouryr_con = (year%4==0)? true:false;
		hundyr_con = (year%100 ==0)? true:false;
		fourhundyr_con = (year%400 ==0)? true:false;
		
		result	 = fouryr_con&&!hundyr_con||fourhundyr_con ;
		
		//출력
		System.out.println("2019년도는 윤년입니까? " +result);

	}

}
