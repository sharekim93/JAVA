import java.util.Scanner;

public class Day014_2 {

	public static void main(String[] args) {
		char a=' ';
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
		System.out.println("j,s,e �߿� �Է��ϼ���");
		a=scanner.next().charAt(0);
		
		switch (a)
		{
		case 'j' : System.out.println("JAVA");break;
		case 's' : System.out.println("Spring");break;
		case 'e' : System.out.println("e-gov");break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		scanner.close();
		}
		
	}

}
