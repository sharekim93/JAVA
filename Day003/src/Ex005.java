
public class Ex005 {

	public static void main(String[] args) {
			int year = 0;
			int age = 19;
			
			System.out.println(year); // 결과 : 0
			System.out.println(age); // 결과 : 19
			
			year = age + 2000; //변수 age의 값에 2000을 더해서 변수 year에 저장
			age = age + 1; //변수 age에 저장된 값을 1 증가 시킨다.

			System.out.println(year); // 결과 : 2019
			System.out.println(age); // 결과 : 20
	}

}
