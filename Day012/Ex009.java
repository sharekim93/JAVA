
public class Ex009 {

	public static void main(String[] args) {

		String str = "12345";
		int a=0;
	
		for (int i = 0; i < str.length(); i++) {
			a+=str.charAt(i)-'0';
		}
		System.out.println(a);
	}

}
