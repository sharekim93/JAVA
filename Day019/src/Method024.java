import java.util.Arrays;

public class Method024 {

	public static void main(String[] args) {
		char[] abc = {'a','b','c'};
		System.out.println("1. 배열명은 주소를 가짐 : "+abc);
		System.out.println("2. 배열에 들어가 있는 값 확인 : "+ abc[0]);
		System.out.println("3. abc의 주소 : "+ System.identityHashCode(abc));
		re_abc(abc);
		System.out.println("5. "+Arrays.toString(abc));
		
	}
	public static void re_abc(char a[]) {
		System.out.println("4. re_abc의 주소 : "+ System.identityHashCode(a));
		System.out.println("5. 주소를 줄께 따라가서 처리해");
		for (int i=0;i<a.length;i++) {
			a[i]=(char)(a[i]-32);
		}
		//return : void
		//parameter : char a[]
	}
}
// 1.call by value : 함수명(value1, value2)와 같이 호출
// method 내에서 value++;와 같이 파라미터로 받은 값을 변경하는 경우 원본 값을 변경하지 않음
// parameter로 받은 값을 메서드 내에서 복사한다고 생각할 수 있음

// 2.call by reference : 함수명 (int array[])와 같이 배열을 호출.(배열은 주소값)
// method 내에서 값을 변경하는 경우 원본 값 또한 변경이 됨.
// parameter로 주소를 받아 왔기 때문에 원본 값이 변경된다 생각할 수 있음
