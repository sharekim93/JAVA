import java.util.Arrays;

public class Method030 {

	public static void main(String[] args) {
		int beforeweight[] = {100,110,120};
		int afterweight[] = return_arr(beforeweight);
		
		show(beforeweight, afterweight);

	}
	public static int[] return_arr(int arr[]) {
		int result[] = new int[3];
		for(int i=0;i<arr.length;i++) {
			result[i]=arr[i]-50;
		}
		return result;
	}
	//method name : return_arr
	//return : int[]
	//parameter : int arr[]

	public static void show(int beforeweight[],int afterweight[]) {
		System.out.println(":::::: 검사표\nBEFORE\tAFTER");
		for(int i=0;i<beforeweight.length;i++) {
			System.out.println(beforeweight[i]+"\t"+afterweight[i]);
		}
	}
}
