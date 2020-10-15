
public class Ex008 {

	public static void main(String[] args) {
		// 다음 연산의 결과를 적으시오
		// 우선순위를 따지는 문제
		int x = 2;
		int y = 5;
		char c ='A'; // A의 문자코드 65
		
		System.out.println(y >= 5|| x<0 && x>2); // true. true||false 일 때 true
		System.out.println(y += 10 - x++); // 13
		// 0. 5+= 10 -2++
		// 1. 2 뒤에 ++는 우선순위 1순위 ; 이후 계산
		// 2. 10 -2
		// 3. 5+8 = 13
		// 4. (1.)의 뒷처리 x=3
		
		System.out.println(x+=2); //5
		System.out.println(!('A' <= c && c <= 'Z')); // false
				
		System.out.println('C'-c); // 2 (C에 해당하는 숫자 67, A에 해당하는 숫자 65)
		System.out.println('5'-'0'); // 아스키코드가 5만큼 차이남
		System.out.println(c+1); //66 아스키코드 +1 = 65+1
		System.out.println(++c); //B 단항의 경우 문자열을 증가시킴.
		System.out.println(c++); //B
		System.out.println(c); //C
		
	}

}
