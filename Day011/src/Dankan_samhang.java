
public class Dankan_samhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=3;j++)
			{	if (i>=7&&j==3) {break;}
				else {
				int dan = (i-1)/3<1? 1+j:(i-1)/3<2? 4+j:7+j;
				int kan = (i%3==0)? 3:i%3;
				System.out.print(dan+"*"+kan+"="+dan*kan+"\t");}
			}
			System.out.println();
		}
	}

}
