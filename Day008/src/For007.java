
public class For007 {

	public static void main(String[] args) {
		/*
		 * 서기 1년~ 서기 2020년 중에서 윤년의 갯수를 출력하시오
		 */
		
		int i=0,j=0;
		
		for (i=1;i<=2020;i++)
		{
			if ((i%4==0)&&(i%100!=0)){j+=1;}
			else if(i%400==0) {j+=1;}
		}
		System.out.println("윤년의 갯수 = " +j);
		
		// 선생님 풀이
		
		i=0;j=0;
		
		for (i=1;i<=2020;i++)
		{
			if(i%4==0&&i%100!=0||i%400==0)
			{j++;}
		}
		System.out.println("윤년의 갯수 = " +j);
	}

}
