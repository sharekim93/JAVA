import java.util.Scanner;

public class BANK5 {

	public static void main(String[] args) {

		int num = 0,money=0,cnt=0,sub=0;
		int[] age = { 0, 0, 0 };
		int[] bal = { 0, 0, 0 };
		int[] check = { 0, 0, 0 };
		boolean match =false;
		String[] id = new String[3];
		String[] pass = new String[3];
		String next = null;
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
				if(num == 9) {break;}
				else {
					String temp_id = null, temp_pass=null;
					System.out.println("*ID :");
					temp_id = scanner.next();
					System.out.println("*PASS :");
					temp_pass = scanner.next();
					
					
					for (int i = 0; i < 3; i++) {
						if (num == 1) {
							if (cnt < 3) {
								for (int j=0;j<id.length;j++){
										if(check[j]==0) {							
										id[j] = temp_id;
										pass[j] = temp_pass;
										System.out.print("*AGE :");
										age[j] = scanner.nextInt();
										System.out.print("*BALANCE :");
										bal[j] = scanner.nextInt();
										System.out.println();
										check[j]=1;break;}	
									}
								cnt++;break;
								}
							else
								System.out.println("더 이상 신규가입이 불가합니다.");break;
							}
						if(id[i]!=null&&temp_id.equals(id[i]) && pass[i]!=null&&temp_pass.equals(pass[i]))
						{match=true;}
						else System.out.println("조회에 실패했습니다.");
						if (match)	{
							if(num==2) {
								System.out.println("======조회결과======\n\n아이디 : "
										+id[i]+"\n나이 : "
										+age[i]+"\n잔액 : "
										+bal[i]+"\n암호 : "
										+pass[i]+"\n조회가 성공했습니다.\n\n아무키나 누르세요\n");
								next= scanner.nextLine();match=false;break;
							}
							if(num==3) {	
								System.out.print("입금할 금액을 입력해주세요");
								money = scanner.nextInt();
								if (money>=0) {bal[i] = bal[i]+money;match=false;break;}
								else System.out.println("잘못 입력하셨습니다.");match=false;break;
							}
							if(num==4) {
								System.out.print("출금액 :");
								money = scanner.nextInt();
								if (bal[i]-money>=0) {bal[i]=bal[i]-money;}
								else if (bal[i]-money<0) {System.out.println("금액이 모자랍니다.");match=false;break;}
								else if (money<0) {System.out.println("잘못 입력하셨습니다.");match=false;break;}
							}
							if(num==5) {
								String delete = null;
								System.out.print("삭제하시겠습니까? (Y/N)");
								delete = scanner.next();
								if(delete.equalsIgnoreCase("Y")){id[i]=null;pass[i]=null;age[i]=0;bal[i] = 0;check[i]=0;cnt--;}match=false;break;
							}
						}
					}
				}
			}
			else System.out.println("잘못 입력하셨습니다.");
		}
	}
}
