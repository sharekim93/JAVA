
public class Ex010 {

	public static void main(String[] args) {
		//2020�� 10�� 13��
		//���� 1��~���ñ��� �� �ϼ�:737711�� ����ϼ���
		int year=2020, month=10, date=13;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String yoil[] = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"}; //����
		int days=0; //�� �ϼ�
		
		//ó��
		for(int i=1;i<=year;i++)
		{	
			if (i==year)
			{
				for (int j=0;j<month-1;j++)
				{
					days+=months[j];
				}
				days+=date;
			}
			else {
				for(int k=0;k<months.length;k++)
				{
					days+=months[k];
				}
			}
			if(i%4==0&&i%100!=0||i%400==0) {days++;}
		}
		
		// �� �ϼ� ���
		System.out.println("* ���� 1��~���ñ��� �� �ϼ�:"+days);
		System.out.print("* "+year+"�� "+month+"�� "+date+"�� ");
		
		// ���� ���
		for(int k=0;k<7;k++)
		{
			if(days%7==k) {System.out.println(yoil[k]);}
		}
	}
}
