
public class Exception001 {

	public static void main(String[] args) {		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Error1: by zero");
			//e.printStackTrace();
		}
		/*finally {
			System.out.println("-예외가 발생하지 않든 무조건 수행하는 부분");
		}
		*/
		System.out.println("Q2.오류찾기");
		
		
		try {
			int[] a = {10,20,30};
			for(int i=0;i<=3;i++) {
				System.out.println(a[i]);
				//오류내용 : i의 범위가 배열 a의 길이보다 큼
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error2 : index의 범위를 확인해주세요.");
		}
		
		
		
		
		System.out.println("Q3. 오류찾기");
		Integer test2 = null;
		try {
		System.out.println(10/test2);
		//오류내용 : test2가 정의되지 않음. null임
		}
		catch(NullPointerException e) {System.out.println("Error 3: null로 나눌 수 없어요.");}
	}
}
