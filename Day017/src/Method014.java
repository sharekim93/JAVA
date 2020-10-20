
public class Method014 {

	public static boolean leap(int n) {
		if (n%4==0&&n%100!=0||n%400==0) return true;
		else return false;
	}
	public static String mycal001(int a, int b, int c)	{
		String result=null;
		int year=0,month=0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=1; i<a;i++){
			if(leap(i)) {year+=366;}
			else {year+=365;}
		}
		
		for (int i=0; i<b-1;i++){month+=months[i];}
		if(leap(a)) {month+=1;}
				
		
		//출력
		result = "001. YEAR : "+(year)+"\n002. MONTH : "+month+"\n003. DAY : "+c
				+"\n서기 1년 1월 1일 ~"+a+"년 "+b+"월 "+c+"일 : "+(year+month+c);
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(mycal001(2020,10,19));
	}

}
