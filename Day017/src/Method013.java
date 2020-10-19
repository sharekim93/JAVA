
public class Method013 {

	public static boolean leap(int n) {
		if (n%4==0&&n%100!=0||n%400==0) return true;
		else return false;
	}
	public static void main(String[] args) {
		System.out.println("[BASIC002] 윤년인지 평년인지 판단해서 윤년이면 true, 평년이면 false를 return ");
		if(leap(2020)) {
			System.out.println("윤년");}
		else System.out.println("평년");
		
	}

}
