
public class Ex016 {

	public static void main(String[] args) {
		// �ζǹ�ȣ : 1~45�߿��� ��ġ�� �ʰ� 6�� ���
		
		// 1. ������ ������ �� �Է� > ���� element�� �ߺ� �� �ش� element�� ������ �� ���Է�
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
		
		// 2. ������ ������ �� �Է� > �ߺ� �߻� �� �ش� ȸ�� �����
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
