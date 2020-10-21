
public class Day019_3 {

	public static String hi(String name, int repeat) {
		
		String result=null;
		result =name;
		for (int i=0; i<repeat;i++) {
			result+=" 안녕!";
		}
		return result;
	}
	// 리턴 : String
	// 파라미터 : String name, int repeat
	
	public static void main(String[] args) {
		System.out.println(hi("sally",2));

	}

}
