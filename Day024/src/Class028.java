/*
 * 다음과 같이 코드를 작성하고 예상되는 결과와 근거를 작성하시오
 * main 시작 > firstMethod 시작> (firstMethod의)secondMethod 시작
 * > (firstMethod의)secondMethod 종료
 * > (main의)secondMethod 시작 > (main의)secondMethod 종료 
 * > firstMethod 종료 > main 종료
 */
public class Class028 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음");
		firstMethod();
		secondMethod();
		System.out.println("main(String[] args)dㅣ 끝났음.");
		
	}
		static void firstMethod() {
			System.out.println("firstMethod()이 시작되었음.");
			secondMethod();
			System.out.println("firstMethod()이 끝났음.");
	}
		static void secondMethod() {
			System.out.println("secondMethod()이 시작되었음");
			System.out.println("secondMethod()이 끝났음");
		}

}
