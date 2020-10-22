
public class Day020_1 {

	public static void main(String[] args) {

		System.out.println("====for버전");
		for (int i = 0; i < 3; i++) {
			System.out.print("class" + (i + 1) + "\t");
		}
		System.out.println();

		System.out.println("====whie버전");
		int i = 0;
		while (i < 3) {
			System.out.print("class" + (i + 1) + "\t");
			i++;
		}
		System.out.println();

		System.out.println("====do~while버전");
		i=0;
		do {
			System.out.print("class" + (i + 1) + "\t");
			i++;
		} while (i < 3);
	}

}
