
public class Method026 {

	public static void main(String[] args) {
		// 10씩 더해서 출력하시오
		int[][] num = { { 1, 3, 5 }, { 2, 4, 6 } };
		print(num);
	}

	public static void print(int array[][]) {
		boolean first = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (first) {
					first = false;
				} else {
					System.out.print(", ");}
					array[i][j] += 10;
					System.out.print(array[i][j]);
				}
				System.out.println();
				first = true;
			}
		
	}
	// return : void
	// parameter : int array[][]
}
