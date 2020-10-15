
public class For006 {

	public static void main(String[] args) {
		// 1~10까지 3의 배수의 합을 출력하시오
		
		//if로 풀기
		//변수
		int i=0,j=0;
		//처리&출력
		System.out.print("1~10까지 3의 배수의 합 : ");
		for (i=1;i<=10;i++)
		{
			if (i%3==0&&i!=9) {j+=i;System.out.print(i+" + ");}
			else if (i==9) {j+=i;System.out.print(i+" = ");}
			}
		System.out.println(j);
		
		
		//9를 안 쓰고 풀기
		//변수
		i=0;j=0;
		//처리&출력
		System.out.print("1~10까지 3의 배수의 합 : ");
		for (i=1;i<=10;i++)
		{
			if (i%3==0&&i!=j) {j+=i;System.out.print(i+" + ");}
			else if (i==j) {j+=i;System.out.print(i+" = ");}
		}
		System.out.println(j);
		
		
		//boolean 이용
		i=0;j=0;
		boolean first = true;
		//처리&출력
		System.out.print("1~10까지 3의 배수의 합 : ");
		for (i=1;i<=10;i++)
		{
			if (i%3==0)
			{
				if (first){first = false;}
				else {System.out.print(" + ");}
				j+=i;
				System.out.println(i);
			}

		}
		System.out.print(" = " + j);
		
		// switch
		//입력
		i=0;j=0;
		//처리&출력
		System.out.print("1~10까지 3의 배수의 합 : ");
		for (i=1;i<=10;i++)
			if (i%3==0)
				System.out.print(i);
				j+=i;
			{
				switch (j) {
				case 9 : System.out.print(" = ");
				default : System.out.print(" + ");
				}
			}
		
		}
	
	}

