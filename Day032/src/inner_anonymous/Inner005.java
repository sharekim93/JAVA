package inner_anonymous;

class Outer005{
	String user;
	class Inner1{
		final static String company = "컴패니";
		String companyNum = "2020-05-";
		
		Inner1(){this.companyNum=companyNum+(int)(Math.random()*100000);}
	}
	class Inner2{
		public String getSerialNum() {
			return serialNum;
		}
		public void setSerialNum(String serialNum) {
			this.serialNum = serialNum;
		}
		private String serialNum="P-";
		Inner2(){this.serialNum=serialNum+(int)(Math.random()*100000);}
		
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}

public class Inner005 {
	public static void main(String[] args) {
		Outer005 user1 = new Outer005();	user1.setUser("홍길동");
		Outer005.Inner1 inner1 = new Outer005().new Inner1();
		Outer005.Inner2 inner2 = new Outer005().new Inner2();
		System.out.println(" - 사용자명 : "+user1.getUser());
		System.out.println(" - 회 사 명 : " +Outer005.Inner1.company);
		System.out.println(" - 사업자등록번호 : "+inner1.companyNum);
		System.out.println(" - 제품시리얼번호 : "+inner2.getSerialNum());
	}
	
}
