
public class Ex004 {

	public static void main(String[] args) {
		//��ҹ��� ���� �ٲ㼭 ����Ͻÿ�
		
		System.out.println("'z'-'Z' = "+('z'-'Z'));
		
		char a=' ';
		char ch[] = {'B','a','n','a','n','a'};
		
		System.out.print("��µ� ��� :");
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z') {ch[i]=(char)(ch[i]-32);}
			else if(ch[i]>='A'&&ch[i]<='Z') {ch[i]=(char)(ch[i]+32);}
			System.out.print(ch[i]);
		}
		System.out.println("!");
	}

}
