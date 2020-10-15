
public class Ex007 {

	public static void main(String[] args) {
		int a =1, b=1, c=1, d=1, e=1;
		// 
		a = a+1;
		System.out.println("a+1 =" + a); //2
		
		b+=1; //1을 더해서 b에 저장
		System.out.println("b+=1 " + a); //2

		// 출력 이후 1 증가
		System.out.println("c++ : " + c++);  //1
		System.out.println("c : " + c); //2
		
		// 출력 이전 1 증가		
		System.out.println("++d = " + ++d); //세미콜론 이후 d에 1 증가
		System.out.println("d: " + d);
		
		// 독립적으로 사용하면 앞에 쓰든 뒤에 쓰든 같음
		e++;
		System.out.println("1개 증가 : " + e); //세미콜론 전 e에 1증가
		++e;
		System.out.println("1개 증가 : " + e);

	}

}
