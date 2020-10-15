import org.omg.Messaging.SyncScopeHelper;

public class Equals001 {
	public static void main(String[] args) {
		
		System.out.println("문자열(String) 비교는 ==으로 처리해서는 안 된다.");
		
		char op = '+';
		String a = "Hello";
		String b = a;
		String c = new String("Hello");
		
		// == 비교하는 대상의 (링크)를 비교
		// equals 비교하는 대상의 (값,내용)을 비교
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println("주소확인 1 : " + System.identityHashCode(a));
		System.out.println("주소확인 2 : " + System.identityHashCode(b));
		System.out.println("주소확인 3 : " + System.identityHashCode(c));
	}
}
