
public class Ex016 {

	public static void main(String[] args) {
		// 로또번호 : 1~45중에서 겹치지 않게 6개 출력
		
		// 1. 변수에 랜덤한 수 입력 > 이전 element와 중복 시 해당 element에 랜덤한 수 재입력
		/*
		int lotto[] = new int[6];
		int num=0;
		for (int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++)
			{
				if(lotto[j]==lotto[i]) {lotto[i]=(int)(Math.random()*45+1);}
			}
			System.out.print(lotto[i]+"\t");
		}
		*/
		
		// 2. 변수에 랜덤한 수 입력 > 중복 발생 시 해당 회차 재실행
		int lotto[] = new int[6];
	
		for (int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++)
			{
				if(lotto[j]==lotto[i]){i--;}
			}
			System.out.print(lotto[i]+"\t");
		}
		
	}

}
