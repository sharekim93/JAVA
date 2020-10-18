
public class Day012_3 {

	public static void main(String[] args) {

		for (int a = 1; a < 4; a++) {
			System.out.print("JAVA" + a + "\t");
		}
		
		System.out.println();
		
		int a = 1;
		while (a < 4) {
			System.out.print("JAVA" + a + "\t");
			a++;
		}

		System.out.println();
		
		a = 1;
		do {
			System.out.print("JAVA" + a + "\t");
			a++;
		} while (a < 4);
		
		System.out.println();
	}

}
