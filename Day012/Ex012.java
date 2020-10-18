
public class Ex012 {

	public static void main(String[] args) {
		String value ="12o34";
		char ch=' ';
		boolean num = true;
		
		for (int i=0;i<5;i++)
		{
			ch = value.charAt(i);
			if (ch<='0'||ch>='9'){num=false;}
		}
		
		if (num) {System.out.println(value+"는 숫자입니다");}
		else {System.out.println(value+"는 숫자가 아닙니다");}
	}
}
