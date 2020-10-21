import java.util.Arrays;

public class Method022 {

	public static void main(String[] args) {
		System.out.println("1 : " + print('A'));
		System.out.println("2 : " + print(10));
		int []arr= {1,2,3};
		
		System.out.println("3-1. 배열명은 주소를 가짐 : "+arr);
		System.out.println("3-2. 배열에 들어가 있는 값 꺼내쓰기 : "+arr[0]);
		System.out.println("3-3. arr의 주소 : "+ System.identityHashCode(arr));
		print(arr);
		System.out.println("3-8. 메인에서의 배열은 arr :" +Arrays.toString(arr));
		//System.out.println("3-9.  : "+ print(arr[]));
	}
	public static char print(char i) {
		return i;
	}
	//return : char
	//parameter : char i
	
	public static int print(int i) {
		return i;
	}
	//return : int
	//parameter : int i
	
	public static void print(int [] a) {
		//주소 복사해서 가져옴
		System.out.println("3-4. 배열명은 무엇을 가지고 있는지 확인 : "+a);
		System.out.println("3-5. 메서드 안 :" + System.identityHashCode(a));
		System.out.println("3-6. 값 : " +a[0]);
		a[0]=100;
		System.out.println("3-7. 메서드 안에서 값 바꿔 보기 : " + Arrays.toString(a));
	}
	
	//return : void
	//parameter : int[]
}
