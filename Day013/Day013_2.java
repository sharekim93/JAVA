import java.util.Scanner;

public class Day013_2 {

	public static void main(String[] args) {
		//����
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		//�Է�
		System.out.println("10,20,30 �߿� �Է��ϼ���");
		a=scanner.nextInt();
		
		//ó��
		switch (a)
		{
		case 10: System.out.println("ten");break;
		case 20: System.out.println("twenty");break;
		case 30: System.out.println("thirty");break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		scanner.close();
	}

}
