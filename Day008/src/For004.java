
public class For004 {

	public static void main(String[] args) {
		/* for문을 이용하여 1~10까지의 합을 구하시오.
		 * 1~10까지의 합 : 55
		 */
		
		//if로 풀기
		//변수
		int i=0,j=0;
		
		//처리&출력
		for (i=1;i<=10;i++)
		{if (i<10) {j+=i;System.out.print(i+" + ");}
			else {j+=i;System.out.print(i+ " = ");};
		}
		System.out.println(j);
		
		//switch로 풀기
		//변수
		i=0; j=0;
		//처리&출력
		for (i=1;i<=10;i++)
		{switch (i) {
			default:{j+=i;System.out.print(i+" + ");}break;
			case 10: {j+=i;System.out.print(i+ " = ");};
		}}
		System.out.println(j);		
		

	}

}
