
public class Ex017 {

	public static void main(String[] args) {
		
		// ����ó�� ���α׷� �����
		// ���л� avg>=95, �հ� >=60
		
		//�Է�(�迭)
		//suggested
		String[] name = {"���̾��","��ũ","ĸƾ","�丣","ȣũ����"};
		int[] kor= {100,20,90,70,35};
		int[] eng= {100,50,95,80,100};
		int[] mat= {100,30,90,60,100};
		int[] avg= new int[5];
		int size=name.length;
		
		//added
		String[] hap= new String[5];
		String[] jang= new String[5];
		
		//ó��
		for (int i=0;i<size;i++)
		{
			//���
			avg[i]=(kor[i]+eng[i]+mat[i])/3;
			
			//�հ�		
			if(avg[i]>=60) {hap[i]="�հ�";}
			else {hap[i]="���հ�";}

			//����
			if(avg[i]>=95) {jang[i]="���л�";}
			else {jang[i]="----";}		
		}
		
		//���
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("�̸�\t����\t����\t����\t���\t�հݿ���\t���л�");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0;i<size;i++)
		{
			System.out.println(name[i]+"\t"+
								kor[i]+"\t"+
								eng[i]+"\t"+
								mat[i]+"\t"+
								avg[i]+"\t"+
								hap[i]+"\t"+
								jang[i]);
		}
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		

	}

}
