
public class Day011_3 {

	public static void main(String[] args) {
		
		//for
		System.out.println("==============for문 이용==============");
		for(int i=1;i<=3;i++)
		{
			System.out.print("Hi"+i+"\t");
		}
		
		System.out.println();
		//while
		System.out.println("============while문 이용==============");
		int i =1;
		while(i<=3)
		{
			System.out.print("Hi"+i+"\t");
			i++;
		}
		System.out.println();
		
		//do~while
		System.out.println("============do~while문 이용===========");
		i=1;
		do
		{
			System.out.print("Hi"+i+"\t");
			i++;
		}
		while(i<=3);
	}

}
