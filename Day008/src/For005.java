
public class For005 {

	public static void main(String[] args) {
		// 1~10까지 3의 배수 갯수를 출력하시오
		
		//if로 풀기
		//변수
		int i=0,j=0;
		
		for (i=1;i<=10;i++) {if (i%3==0) {j+=1;}}
		System.out.println("if 이용) 3의 배수의 개수 : " +j);
		
		//switch로 풀기
		//변수
		i=0; j=0;
		for (i=1;i<=10;i++) {
			switch (i%3) 
			{
			case 0 :j+=1;
			}
		}
		System.out.println("swtich 이용) 3의 배수의 개수 : " +j);
	}

}
