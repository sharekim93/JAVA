
public class Day020_2 {

	public static void main(String[] args) {
		char a[][] = {
				{'a','b','c'},
				{'A','B','C'}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
