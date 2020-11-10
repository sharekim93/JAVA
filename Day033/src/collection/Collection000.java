package collection;

import java.util.Arrays;

public class Collection000 {

	public static void main(String[] args) {
		// 1. 문자열 배열 3개
		
		System.out.println("[ver-1] 배열");
		String[] arr = new String[] {"RED","GREEN","BLUE"};
		
		// 2. 데이터를 더 늘리려고 함. 문자열 배열을 5개로 늘리기
		System.out.println("\n[ver-2] System.arraycopy 배열을 5개로 늘리기");
		String temp[] = new String[5];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr=temp;
		
		// 3. 매번 할 때마다 배열의 개수를 고려해야함.
		System.out.println("\n[ver-3] Collection 프레임워크");
		System.out.println(Arrays.deepToString(arr));

	}

}
