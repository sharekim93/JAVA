
public class For010 {

	public static void main(String[] args) {
		// 1~30중에서 3의 배수이면서 2의 배수인 숫자와 갯수를 구하시오
		
		//변수
		int a = 0, b=0;
		
		//처리&출력
		for (a=1;a<=30;a++)
		{
			if ((a%3==0)&&(a%2==0))
			{
				b++;
				System.out.println("3의 배수이면서 2의 배수인 숫자 : " + a);
			}
		}
		System.out.println("갯수 : " +b+"개");
	}

}
