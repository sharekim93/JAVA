import java.util.Scanner;

public class BANK6 {

	public static void main(String[] args) {
		
		int num = 0,cnt=0, money=0;
		String next = null;
		String [][]users = new String [3][4];
		// USER3명 :  users, users, balance
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
				// 추가기능 점검 필요
				if (num == 1) {
					cnt=0;
					for(int a=0;a<users.length;a++)
					{
						if(users[a][0] !=null ) {cnt++;}
						else break;
					}
					System.out.println("cnt : " +cnt);
					if (cnt < 3) {
						System.out.print("*ID :");
						users[cnt][0] = scanner.next();
						System.out.print("*PASS :");
						users[cnt][1] = scanner.next();
						System.out.print("*AGE :");
						users[cnt][2] = scanner.next();
						System.out.print("*BALANCE :");
						users[cnt][3] = scanner.next();
						cnt++;
					}
					else
						System.out.println("더 이상 신규가입이 불가합니다.");
				}
				else if(num == 9) {break;}
				else {
					String temp_id = null, temp_pass=null;
					System.out.println("*users :");
					temp_id = scanner.next();
					System.out.println("*users :");
					temp_pass = scanner.next();
					for (int i = 0; i < 3; i++) {
						if (users[i][0]!=null&&users[i][0].equals(temp_id) && users[i][1]!=null&&users[i][1].equals(temp_pass))	{
							if(num==2) {
								System.out.println("======조회결과======\n\n아이디 : "
										+users[i][0]+"\n나이 : "
										+users[i][2]+"\n잔액 : "
										+users[i][3]+"\n암호 : "
										+users[i][1]+"\n조회가 성공했습니다.\n\n아무키나 누르세요\n");
								next= scanner.nextLine();break;
							}
							if(num==3) {	
								System.out.print("입금할 금액을 입력해주세요:");
								money = scanner.nextInt();
								if (money>=0) {users[i][3] =""+(Integer.parseInt(users[i][3])+money);break;}
								else System.out.println("잘못 입력하셨습니다.");break;
							}
							if(num==4) {
								System.out.print("출금액 :");
								money = scanner.nextInt();
								if (Integer.parseInt(users[i][3])-money>=0) {users[i][3]=""+(Integer.parseInt(users[i][3])-money);}
								else if (Integer.parseInt(users[i][3])-money<0) {System.out.println("금액이 모자랍니다.");break;}
								else if (money<0) {System.out.println("잘못 입력하셨습니다.");break;}
							}
							// 삭제 기능 점검 필요
							if(num==5) {
								String delete = null;
								System.out.print("삭제하시겠습니까? (Y/N)");
								delete = scanner.next();
								if(delete.equalsIgnoreCase("Y")){users[i][0]=null;users[i][1]=null;users[i][2] =null;users[i][3]=null;}break;
							}
						}
						else System.out.println("조회에 실패했습니다.");break;
					}
				}
			}
		}
	}
};