import java.util.Scanner;

public class Day014_1 {

	public static void main(String[] args) {
		char a=' ';
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
		System.out.println("j,s,e �߿� �Է��ϼ���");
		a=scanner.next().charAt(0);
		
		if (a=='j') {System.out.println("JAVA");break;}
		else if(a=='s') {System.out.println("Spring");break;}
		else if(a=='e') {System.out.println("e-gov");break;}
		else {System.out.println("�߸� �Է��ϼ̽��ϴ�.");}
		}
		
		scanner.close();
	}

}
