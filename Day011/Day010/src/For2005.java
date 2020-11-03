
public class For2005 {

	public static void main(String[] args) {
		// for
		System.out.println("============for문으로 풀기============");
		for (int i = 4; i >= 1; i--) {
			for (int j = 0; i-j>0; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// while
		System.out.println("============while문으로 풀기============");
		int i = 4, j = 0;
		while (i >= 1) {
			while (i-j > 0) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i--;
			j = 0;
		}

		// do ~while
		System.out.println("============do ~while문으로 풀기============");
		i = 4;
		j = 0;
		do {
			do {
				System.out.print(i);
				j++;
			} while (i-j > 0);
			System.out.println();
			i--;
			j = 0;
		} while (i >= 1);

	}
}	


