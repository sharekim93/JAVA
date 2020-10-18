
public class Ex003 {

	public static void main(String[] args) {
		/* 기존 풀이
		char ch[] = new char[52];
		char a = 'A';
		
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			ch[i] = a;
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				count++;
			}
			a++;
			if (i == 25) {
				a = 'a';
			}
		}
		System.out.println("모음의 개수 : " + count);
		*/
		
		char ch[] = new char[52];
		char data ='A';
		
		for(int i=0;i<ch.length;i++)
		{ch[i] = data++;}
		
		for(int j=0; j<ch.length;j++)
		{System.out.println(ch[j]);}
	}

}
