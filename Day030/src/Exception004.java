
public class Exception004 {
	
	public static void test(int a) throws Exception{
		System.out.println(10/a);
		System.out.println("처리완료!");
	}
	
	public static void main(String[] args) {
		try {
		test(1); //test(1) 이상 없이 실행. 10 처리완료!
		test(0); //바로 Exception으로 던져져서 catch문으로 넘어감
		}
		catch(Exception e) {System.out.println("exception 발생!");}

	}

}
