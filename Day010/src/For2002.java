
public class For2002 {

	public static void main(String[] args) {

		// for
		System.out.println("============for문으로 풀기============");
		for (int i = 2; i <= 4; i++) {
			System.out.println("[" + i + "단]");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}

		// while
		System.out.println("============while문으로 풀기============");
		int i = 2, j = 1;
		while (i <= 4) {
			System.out.println("[" + i + "단]");
			while (j <= 9) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}

		// do~while
		System.out.println("============do ~while문으로 풀기============");
		i = 2;
		j = 1;
		do {
			System.out.println("[" + i + "단]");
			do {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;
			} while (j <= 9);
			System.out.println();
			j = 1;
			i++;
		} while (i <= 4);

	}

}
