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
