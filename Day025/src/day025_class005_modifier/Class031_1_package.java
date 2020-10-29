package day025_class005_modifier;

public class Class031_1_package {

	public static void main(String[] args) {
		// 1.같은 패키지 안에서의 사용
		// Rabbit [ a|b|c|d /seA \getA]
		Rabbit r1 = new Rabbit();
		r1.d_public		 = 1000;
		r1.b_protected 	 = 100;
		r1.c_package 	 = 10;
		// protected : 패키지 + 자식
		// package : 패키지
		// private : 클래스 내에서만 (멤버함수가 멤버변수 접근해서 사용)
		
		System.out.println(r1);
		System.out.println("public : 아무데서나 -" +r1.d_public);
		System.out.println("protected : 패키지(폴더)+자식 -" +r1.b_protected);
		System.out.println("package : 패키지(폴더) -" +r1.c_package);
		System.out.println("private : 클래스 내에서만 -" +r1.getA_private());
	}

}
