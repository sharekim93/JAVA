
public class Ex011 {

	public static void main(String[] args) {
		// 2020�� 10�� 13��
		// ���� 1��~���ñ��� �� �ϼ�:737711�� ����ϼ���
		int year = 2020, month = 10, date = 13;
		int months[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String yoil[] = { "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" }; // ����
		int days = 0; // �� �ϼ�

		// ó��
		for (int i = 1; i <= year; i++) {
			if (i == year) {
				for (int j = 0; j < month - 1; j++) {
					days += months[j];
				}
				days += date;
				if (month>2&&i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
					days++;
				}
			} else {
				for (int k = 0; k < months.length; k++) {
					days += months[k];
				}
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
					days++;
				}
			}

		}

		// �� �ϼ� ���
		System.out.println("* ���� 1��~���ñ��� �� �ϼ�:" + days);
		System.out.print("* " + year + "�� " + month + "�� " + date + "�� ");

		// ���� ���
		for (int k = 0; k < 7; k++) {
			if (days % 7 == k) {
				System.out.println(yoil[k]);
			}
		}

		System.out.println("======================= " + month + "�� =======================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		int temp = 0;
		int count = 0;
		for (int i = 0; i < (days - date + 1) % 7; i++) {
			System.out.print("*" + "\t");
		}
		for (int j = 1; j <= 7 - ((days - date + 1) % 7); j++) {
			System.out.print(j + "\t");
			temp = j;
		}
		System.out.println();
		{
			for (int i = temp + 1; i <= months[month - 1]; i++) {
				System.out.print(i + "\t");
				count++;
				if (count % 7 == 0) {
					System.out.println();
				}
			}
		}
	}
}
