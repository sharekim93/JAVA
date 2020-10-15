public class Ex001 {
	public static void main(String[] args) {
		//1) 산술연산자
		int a =10, b=3;
		System.out.println("a+b");
		System.out.println("a-b");
		System.out.println("a*b");
		System.out.println("a/b");
		System.out.println("a%b");	
		//2) 비교(관계)연산자
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);		
			/*
			 * Q1. a가 짝수라면 true, 아니라면 false
			 * 1 (홀수) 1%2 = 1 홀수라면 2로 나눴을 때의 나머지 1
			 * 2 (짝수) 2%2 = 0 짝수라면 2로 나눴을 때의 나머지 0
			 * 3 (홀수) 3%2 = 1
			 * 4 (짝수) 4%2 = 0
			 */
				System.out.println(1%2 ==0);
				System.out.println(2%2 ==0);
				System.out.println("a가 짝수 : " + (a%2 ==0));
				System.out.println("b가 짝수 : " + (b%2 ==0));
			// Q2. a가 3의 배수라면 True 출력// 아니라면 false를 출력
				System.out.println("a가 3의 배수 : " + (a%3 == 0));
		//3) 논리연산자 &&, ||
			// Q3. a가 2의 배수이면서 5의 배수라면 true 출력 아니라면 false 출력
				System.out.println((a%2==0)&&(a%5==0));
			// Q4. a가 2배수이거나 3의 배수라면 true 출력 아니라면 false 출력
				System.out.println((a%2 ==0)||(a%3==0));
		//4) 삼항연산자 조건? 참:거짓
			// Q5. a가 3의 배수가 아니라면 true를 출력 맞다면 false를 출력
				System.out.println((a%3!=0)? true:false);
			// Q6. a가 양수라면 (a>0) "양수" 출력, 아니라면 "음수" 출력
				String result = (a>0)? "양수":"음수"; System.out.println(result);
				System.out.println((a>0)? "양수":"음수");
			// Q7. a가 양수라면 1(int) 출력, 아니라면 0(int) 출력
				int result2 = (a>0)? 1:0; System.out.println(result2);
				System.out.println((a>0)? 1:0);
			// Q8. a가 양수라면 1.1 곱하기 출력, 아니라면 0.9 곱하기 출력
				double result3 = (a>0)? a*1.1:a*0.9; System.out.println(result3);
				System.out.println((a>0)? a*1.1:a*0.9);
	}			
}
