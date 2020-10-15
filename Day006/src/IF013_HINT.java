
public class IF013_HINT {

	public static void main(String[] args) {
		float result = 0.0f;
		String a = null;
		char op = '+';
		
		result = (op=='/')? 3.14f:a;
		System.out.println(result);
		// 삼항연산자에서 '참:거짓'에 들어가는 자료형은 동일해야 함.
		// 실수형 : 정수형 의 경우 실수형으로 변경 됨
		// 실수형 : string 은 실수형을 String으로 바꿔 줘야 함
		System.out.println((op == '/')?
				("" + 10 + '/' + 3 + "="+result)
				:("" + 10 + '/' + 3 + "="+(int) result));
	}

}
