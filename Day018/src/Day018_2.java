
public class Day018_2 {

	public static void main(String[] args) {
		int array[][]=new int[2][3];
		int a=100, b=1;
		for (int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++) {
				array[i][j]=a+b;
				b++;
			}
			a+=100;
			b=1;
		}
		for (int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
