
public class Array2_020 {

	public static void main(String[] args) {
		String[][] avengers=new String[2][3];
		String[] heros= {"아이언맨","헐크","호크아이","토르","블랙팬서","블랙위도우"};
		int num=0;
		for(int i=0;i<avengers.length;i++)
		{
			for(int j=0;j<avengers[i].length;j++)
			{
				avengers[i][j]=heros[num];
				num++;
			}
		}
		System.out.println(":::: 출력된 화면");
		for(int i=0;i<avengers.length;i++)
		{
			for(int j=0;j<avengers[i].length;j++)
			{
				System.out.print(avengers[i][j]+" ");
			}
			System.out.println();
		}

	}

}
