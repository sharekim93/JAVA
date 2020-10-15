
public class For002 {

	public static void main(String[] args) {
		/*
		 * for문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
		 * for문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
		 * for문을 이용해서 다음과 같이 출력하시오 :  JAVA1 JAVA2 JAVA3
		 * for문을 이용해서 다음과 같이 출력하시오 :  HAPPY3 HAPPY2 HAPPY1
		 */

		for (int i=1;i<=5;i++) {System.out.print(i+" ");}
		System.out.println();
		for (int i=5;i>=1;i--) {System.out.print(i+" ");}
		System.out.println();
		for (int i=1;i<=3;i++) {System.out.print("JAVA"+i+"\t");}
		System.out.println();
		for (int i=3;i>=1;i--) {System.out.print("HAPPY"+i+"\t");}
	}

}
