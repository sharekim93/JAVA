
public class Repeat003 {

	public static void main(String[] args) {
		/*
		 *  for, while, do while문을 이용해서 다음과 같이 처리하시오.
		 *  1~10까지의 3의 배수 갯수를 출력하시오.
		 *  1~10까지의 3의 배수 : 3
		 */

		int i=0,j=0;
		System.out.print("for문 > ");
		for (i=1;i<=10;i++)
		{
			if (i%3==0) {j+=1;} 
		}
		System.out.println("1~10까지의 3의 배수 : "+j);
		
		i=1;j=0;
		System.out.print("while문 > ");
		while (i<=10)
		{
			if(i%3==0) {j+=1;};i++;
		}
		System.out.println("1~10까지의 3의 배수 : "+j);
		
		i=1;j=0;
		System.out.print("do~while문 > ");
		do 
		{
			if(i%3==0) {j+=1;};i++;
		}
		while (i<=10);
		System.out.println("1~10까지의 3의 배수 : "+j);
	}

}
