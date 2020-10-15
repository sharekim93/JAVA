import java.util.Scanner;

public class For013 {

	public static void main(String[] args) {
		// 1. 예상되는 결과는?
		for(int i=1; i<11;i++)
		{
			if(i==5) {break;} // 5 이전에서 stop
			System.out.print(i+"\t");
		}
		
		//2. 예상되는 결과는?
		System.out.println();
		for(int i=1; i<11; i++)
		{
			if(i==5) {continue;} // 5번만 skip
			System.out.print(i+"\t");
		}	
		// 3. 1을 입력할 때까지 무한반복
		Scanner scanner = new Scanner(System.in);
		int num=0;
		for(;;) 
		{
			System.out.print("1을 입력해주세요 > ");
			num = scanner.nextInt();
					
			if (num ==1) {break;}
		}
		
	}

}
