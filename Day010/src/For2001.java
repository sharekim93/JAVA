
public class For2001 {

	public static void main(String[] args) {

		// for
		System.out.println("============for문으로 풀기============");
		for (int i = 1; i <= 2; i++) {
			System.out.println("[" + i + "층]");
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + "호실");
			}
			System.out.println();
		}
		// while
		System.out.println("============while문으로 풀기============");
		int i = 1, j = 1;
		while (i <= 2) {
			System.out.println("[" + i + "층]");
			while (j <= 3) {
				System.out.print(j + "호실");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}
		// do~ while
		System.out.println("============do ~while문으로 풀기============");
		i = 1;
		j = 1;
		do {
			System.out.println("[" + i + "층]");
			do {
				System.out.print(j + "호실");
				j++;
			} while (j <= 3);
			System.out.println();
			i++;
			j = 1;
		} while (i <= 2);

	}

}
