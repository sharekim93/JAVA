
public class Ex002 {

	public static void main(String[] args) {
		char ch[] = {'B','a','n','a','n','a'};
		int upper=0,lower=0;
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]<='Z'&&ch[i]>='A') {upper+=1;}
			else if(ch[i]<='z'&&ch[i]>='a'){lower+=1;}
		}
		System.out.println("대문자의 갯수 : "+upper+"\n"
						+"소문자의 갯수 : "+lower);
	}

}
