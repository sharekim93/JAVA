import java.util.Scanner;

public class BANK6 {

	public static void main(String[] args) {

		int num = 0,money=0,cnt=0,index=0;
		boolean match =false, input_id=true;
		
		String [][]users = new String [3][4];
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
					for(int i=0;i<users.length;i++) {
						if(users[i][0]==null) {index=i;}
					}
					if(cnt<3) {
						System.out.print("*ID :");
						id_check=scanner.next();
						for(int i=0;i<users.length;i++) {
							if(id_check.equals(users[i][0])) {System.out.println("이미 존재하는 아이디입니다.");input_id=false;break;}
						}
						if(input_id) {
						users[index][0]=id_check;
						System.out.print("*PASS :");
						users[index][1] = scanner.next();
						System.out.print("*AGE :");
						users[index][2] = scanner.next();
						System.out.print("*BALANCE :");
						users[index][3] = scanner.next();
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
						if(users[i][0]!=null&&temp_id.equals(users[i][0]) && users[i][1]!=null&&temp_pass.equals(users[i][1]))
						{match=true;index=i;}
					}
						if (match)	{
							if(num==2) {
								System.out.println("======조회결과======\n\n아이디 : "
										+users[index][0]+"\n나이 : "
										+users[index][2]+"\n잔액 : "
										+users[index][3]+"\n암호 : "
										+users[index][1]+"\n조회가 성공했습니다.\n\n아무키나 누르세요\n");
								next= scanner.nextLine();
							}
							if(num==3) {	
								System.out.print("입금할 금액을 입력해주세요");
								money = scanner.nextInt();
								if (money>=0) {users[index][3] =""+(Integer.parseInt(users[index][3])+money);}
								else System.out.println("잘못 입력하셨습니다.");
							}
							if(num==4) {
								System.out.print("출금액 :");
								money = scanner.nextInt();
								if (Integer.parseInt(users[index][3])-money>=0) {users[index][3]=""+(Integer.parseInt(users[index][3])-money);}
								else if (Integer.parseInt(users[index][3])-money<0) {System.out.println("금액이 모자랍니다.");}
								else if (money<0) {System.out.println("잘못 입력하셨습니다.");}
							}
							if(num==5) {
								String delete = null;
								System.out.print("삭제하시겠습니까? (Y/N)");
								delete = scanner.next();
								if(delete.equalsIgnoreCase("Y")){users[index][0]=null;users[index][1]=null;users[index][2]=null;users[index][3] = null;cnt--;}
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
