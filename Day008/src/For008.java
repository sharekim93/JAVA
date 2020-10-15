
public class For008 {

	public static void main(String[] args) {
		char a = ' ';
		int j=0;
		
		for (a='a';a<'z';a++)
		{
			switch (a) 
			{
			case 'a': case 'e': case 'i': case 'o': case 'u': j+=1; break;
			}	
		}
		System.out.println("모음의 갯수 : "+j);
		}

	}
