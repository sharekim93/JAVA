import java.util.Scanner;

public class Day013_1 {

	public static void main(String[] args) {
		//����
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		//�Է�
		System.out.println("10,20,30 �߿� �Է��ϼ���");
		a=scanner.nextInt();
		
		//ó��
		if (a==10) {System.out.println("ten");}
		else if(a==20) {System.out.println("twenty");}
		else if(a==30) {System.out.println("thirty");}
		else {System.out.println("�߸� �Է��ϼ̽��ϴ�");}

		scanner.close();
	}

}
