import java.util.Arrays;

public class Method023 {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("[BASIC002] 배열값이 전달되는 경우");
		int[] su= {1,3,5};
		print (su[0],su[1]); //1,3 call by value :  파라미터로 받은 값을 메서드 안에서 처리
		print (su); // 주소 - call by reference : 주소를 따라가서 원본을 수정함.

	}
	public static void print(int i, int j) {
		System.out.println(i+"\t"+j);
	}
	//return : void
	//parameter : int i, int j
	
	public static void print(int i[]) {
		for(int j=0;j<i.length;j++) {
			i[j]=10+i[j];
			System.out.print(i[j]+"\t");
		}
	}
	//return : void
	//parameter : int i[]
}
