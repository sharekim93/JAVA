package polymorphism;

class Mother{
	int ma=10; int mb=20;;
	public Mother() {super();}
	public Mother(int ma) {super();this.ma=ma;}
	public Mother(int ma, int mb) {super();this.ma=ma;this.mb=mb;}
	public void func() {System.out.println("==Mother");}
}

class Daughter extends Mother{
	int mb=30; int mc=40;
	
	public Daughter() {super();}
	public Daughter(int ma, int mb) {super(ma,mb);}
	public Daughter(int ma, int mb, int mc) {super(ma);this.mb=mb;this.mc=mc;}
	
	@Override
	public void func() {System.out.println("□□Daughter");}
	
}

class Polymorphism6 {

	public static void main(String[] args) {
		System.out.println(":::::: 1)TEST");
		Mother mo = new Mother();
		System.out.println("mo.ma : "+mo.ma); //10
		System.out.println("mo.mb : "+mo.mb); //20
		mo.func(); // ==Mother
		
		System.out.println(":::::: 2)TEST");
		Daughter da = new Daughter();
		System.out.println("da.ma : "+da.ma); //10 => Daughter에 ma가 없기 때문에 super()로 조상 클래스의 인스턴스 호출
		System.out.println("da.mb : "+da.mb); //20(X) 30 => Daughter로 인스턴스를 호출했기 때문에 Daughter의 변수로 사용. 
		System.out.println("da.mc : "+da.mc); //40
		da.func(); // □□Daughter => Overrided
		
		//da = (Daughter) mo; => 오류가 나는 이유 : 하위 클래스로 선언된 참조변수에 상위 클래스를 참조할 수 없다.
		//System.out.println(da); //==Mother
		
		System.out.println(":::::: 3)TEST");
		Mother md = new Daughter();
		System.out.println("md.ma : "+md.ma); //10
		System.out.println("md.mb : "+md.mb); //30(X) 20 => Mother로 인스턴스를 호출했기 때문에 Mother의 변수를 사용
		//System.out.println("md.mc : "+md.mc); => 오류가 나는 이유 : 상위 클래스로 하위 클래스를 참조했기 때문.
		
		md.func(); // □□Daughter => Overrided
		
		System.out.println(":::::: 4)TEST");
		System.out.println((float)10);
		//Daughter dm = (Daughter) new Mother(); => 오류가 나는 이유 : 하위 클래스로 선언된 참조변수에 상위 클래스를 참조할 수 없다.
		
		System.out.println(":::::: 5)TEST");
		Mother md2 = da; // da = New Daughter;
		System.out.println("md2.ma : "+md2.ma); //10
		System.out.println("md2.mb : "+md2.mb); //30(X) 20 => Mother로 인스턴스를 호출했기 때문에 Mother의 변수를 사용
		//System.out.println("md2.mc : "+md2.mc); => 오류가 나는 이유 : 상위클래스 Mother로 선언된 md2에서 하위 클래스인 Daughter의 인스턴스변수를 사용할 수 없다.
		md2.func();// □□Daughter => Overrided
	}

}
