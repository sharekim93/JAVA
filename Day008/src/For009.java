
public class For009 {

	public static void main(String[] args) {
		/* 아래를 출력하시오
		 *  ABCDE   
			FGHIJ
			KLMNO
			PQRST
			UVWXY
			Z 
		 */
		char a = ' ';
		
		for (a='A';a<='Z';a++)
		{
			if ((a-'A'+1)%5==0) {System.out.print(a+"\n");}
			else {System.out.print(a);}
		}
	
	}

}
