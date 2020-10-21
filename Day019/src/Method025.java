import java.util.Arrays;

public class Method025 {

	public static void main(String[] args) {
		System.out.println("[TEST001] 배열값이 전달되는 경우");
		String[] name = {"아이언맨","헐크","캡틴"};
		disp(name[0],name[1],name[2]);
		disp(name);
		disp_swipe(name);
		System.out.println("4. main에서 원본 바뀌었는지 확인 : "+Arrays.toString(name));
	}

	public static void disp(String a, String b, String c) {
		System.out.println("1. disp(name[0],name[1],name[2]) => ["+a+", "+b+", "+c+"]" );
	}
	//return : void
	//parameter : String a, String b, String c

	public static void disp(String a[]) {
		System.out.println("2. disp(name) => "+Arrays.toString(a));
	}
	//return : void
	//parameter : String a[]

	public static void disp_swipe(String a[]) {
		String temp=null;
		temp=a[0];
		a[0]=a[1];
		a[1]=temp;
		System.out.println("3. 아이언맨과 헐크의 순서를 바꾸기 => disp_swipe(name) => "+Arrays.toString(a));
	}
	//return : void
	//parameter : String a[]
}
