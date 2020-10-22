
public class Day020_5 {
	
	public static String star(int star) {
		String result=null;
		result=star+"개 ";
		for(int i=0; i<star;i++) {
			result+="★";
		}
		return result;
	}
	//method name : star
	//return : String
	//parameter : int star
	
	public static void main(String[] args) {
		System.out.println("장수돌침대는 별이 " +star(5));

	}

}
