
public class Ex009 {

	public static void main(String[] args) {
		System.out.println("1.논리형 : boolean");
		boolean flag = true;
		System.out.println("논리형은 맞다 틀리다. 현재 상태는 :"+flag);
		flag = false;
		System.out.println("논리형은 맞다 틀리다. 현재 상태는 :"+flag);
		
		System.out.println("\n2.정수형 : 10,20,30");
		byte by = 1; short sh =3; int in=5; long lo=10; // 용량확인을 위함
		System.out.println(by + "\t" + sh + "\t" + in + "\t" + lo + "\t");
		
		System.out.println("\n3.실수형 : 3.14"); 
		
		float fl =3.14f; double dou = 3.14; // **float는 뒤에 f를 붙여서 표현해야 함
		
		System.out.println("\n4. 문자 :"); 
		//문자
		char ch = 'A'; // **문자는 꼭 '' 처리 해야한다
		System.out.println(ch);
		//문자열
		String str = "abc";
		System.out.println(str);
	}
}
