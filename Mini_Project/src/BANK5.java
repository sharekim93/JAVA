import java.util.Scanner;

/*
 ※ BANK 5번 수정한 내용
  # 문제
  1.각 user의 index 없이 user를 추가한 횟수만 count하여 user 삭제에 오류(임의의 user가 삭제 됨)
  2.旣 입력한 id check 기능의 부재
  
  # 수정내용
  1. int형 변수 index를 선언하여 id 배열에서 null 값인 element number를 index로 대입
  2. id 입력 이후 for문,if문 이용 id 중복 확인 코드 추가
 */

public class BANK5 {

	public static void main(String[] args) {

		int num = 0,money=0,cnt=0,index=0;
		int[] age = { 0, 0, 0 };
		int[] bal = { 0, 0, 0 };
		boolean match =false, input_id=true;
		String[] id = new String[3];
		String[] pass = new String[3];
		String next=null,id_check=null;
		Scanner scanner = new Scanner(System.in);
		
		for (;;) {
			System.out.println("======BANK======\r"
					+ "1.추가\r"
					+ "2.조회\r"
					+ "3.입금\r"
					+ "4.출금\r"
					+ "5.삭제\r"
					+ "9.종료\r"
					+ "입력>>> ");
			num = scanner.nextInt();
			
			if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 9) {
				if (num == 1) {
					for(int i=0;i<id.length;i++) {
						if(id[i]==null) {index=i;}
					}
					if(cnt<3) {
						System.out.print("*ID :");
						id_check=scanner.next();
						for(int i=0;i<id.length;i++) {
							if(id_check.equals(id[i])) {System.out.println("이미 존재하는 아이디입니다.");input_id=false;break;}
						}
						if(input_id) {
						id[index]=id_check;
						System.out.print("*PASS :");
						pass[index] = scanner.next();
						System.out.print("*AGE :");
						age[index] = scanner.nextInt();
						System.out.print("*BALANCE :");
						bal[index] = scanner.nextInt();
						System.out.println();
						cnt++;}
					}
					else System.out.println("더 이상 신규가입이 불가합니다.");
				}
				else if(num == 9) {break;}
				else {
					String temp_id = null, temp_pass=null;
					System.out.println("*ID :");
					temp_id = scanner.next();
					System.out.println("*PASS :");
					temp_pass = scanner.next();

					
					for (int i = 0; i < 3; i++) {
						if(id[i]!=null&&temp_id.equals(id[i]) && pass[i]!=null&&temp_pass.equals(pass[i]))
						{match=true;index=i;}
					}
						if (match)	{
							if(num==2) {
								System.out.println("======조회결과======\n\n아이디 : "
										+id[index]+"\n나이 : "
										+age[index]+"\n잔액 : "
										+bal[index]+"\n암호 : "
										+pass[index]+"\n조회가 성공했습니다.\n\n아무키나 누르세요\n");
								next= scanner.nextLine();
							}
							if(num==3) {	
								System.out.print("입금할 금액을 입력해주세요");
								money = scanner.nextInt();
								if (money>=0) {bal[index] = bal[index]+money;}
								else System.out.println("잘못 입력하셨습니다.");
							}
							if(num==4) {
								System.out.print("출금액 :");
								money = scanner.nextInt();
								if (bal[index]-money>=0) {bal[index]=bal[index]-money;}
								else if (bal[index]-money<0) {System.out.println("금액이 모자랍니다.");}
								else if (money<0) {System.out.println("잘못 입력하셨습니다.");}
							}
							if(num==5) {
								String delete = null;
								System.out.print("삭제하시겠습니까? (Y/N)");
								delete = scanner.next();
								if(delete.equalsIgnoreCase("Y")){id[index]=null;pass[index]=null;age[index]=0;bal[index] = 0;;cnt--;}
							}
							match=false;
					}
					else {System.out.println("조회에 실패했습니다.");}
				}
			
			}
			else System.out.println("잘못 입력하셨습니다.");
		}
	}

}
