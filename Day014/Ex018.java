
public class Ex018 {

	public static void main(String[] args) {
		
		//����
		String name[] = {"���̾��","��ũ","ĸƾ","�丣","ȣũ����"};
		String hap[] = new String[5];
		String jang[] = {"","","","",""};
		String star[] = {"","","","",""};

		int kor[] = {100,100,100,70,35};
		int eng[] = {100,100,100,80,35};
		int mat[] = {100,100,100,60,35};
		int avg[] = new int[5];
		int rank[] = {1,1,1,1,1};

		int dupl=0;
		//ó��
		for(int i=0;i<name.length;i++)
		{
			//���
			avg[i]=(kor[i]+eng[i]+mat[i])/3;

			//���
			//����� �ٸ� element���� ���� ��� +1(�ߺ� ����)
			for(int j=0;j<avg.length;j++)
			{
				if(avg[i]<avg[j]) {rank[i]=rank[i]+1;}
			}
			
			//�հ�
			if(avg[i]>=60) {hap[i]="�հ�";}
			else {hap[i]="���հ�";}
			
			//����
			if(avg[i]>=95) {jang[i]="���л�";}
			
			//��ŷ
			for(int j=0;j<avg[i]/10;j++){star[i]+="*";}
		}

		//���
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("�̸�\t����\t����\t����\t���\t���\t�հ�\t���л�\t��ŷ");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0;i<name.length;i++) {
		System.out.println(name[i]+"\t"+
							kor[i]+"\t"+
							eng[i]+"\t"+
							mat[i]+"\t"+
							avg[i]+"\t"+
							rank[i]+"\t"+
							hap[i]+"\t"+
							jang[i]+"\t"+
							star[i]+"\t");
		}
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

}
