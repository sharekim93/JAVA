
public class Method005 {

	public static void line(String str) {
		System.out.println("\n\n[" + str + "]");
	}

	public static int return_num() {return 5;}
	public static float return_float() {return 3.333f;}
	public static String myColor() {return "RED";}
	public static String jangsu() {return "★★★★★";}
	public static int add(int a, int b) {return a + b;}
	public static char myClass() {return 'A';}
	public static String stdId(int n) {return "G"+n;}
	
	public static String stdAvg(int n) {
		if(n>=100) {return "오입력";}
		else if(n>=90) {return "A";}
		else if(n>=80) {return "B";}
		else if(n>=70) {return "C";}
		else {return "D";}
	}
	
	public static void main(String[] args) {
		System.out.println("RETURN");
		line("ver-1");
		System.out.println("1. 내가 좋아하는 숫자는 : " + 5);
		System.out.println("2. 10/3을 실수로 표현 : " + 3.333);
		System.out.println("3. BEST COLOR : " + "RED");
		System.out.println("4. 장수돌침대 별이 : " + "★★★★★");
		System.out.println("5. 10+20 = : " + 30);
		System.out.println("6. 반(A/B) : " + 'A');
		line("ver-2");
		System.out.println("1. 내가 좋아하는 숫자는 : " + return_num());
		System.out.println("2. 10/3을 실수로 표현 : " + return_float());
		System.out.println("3. BEST COLOR : " + myColor());
		System.out.println("4. 장수돌침대 별이 : " + jangsu());
		System.out.println("5. 10+20 = : " + add(10,20));
		System.out.println("6. 반(A/B) : " + myClass());
		System.out.println("7. 당신의 학번은? " +stdId(1111));
		System.out.println("8. 당신의 평균은? " +stdAvg(60));
	}

}
