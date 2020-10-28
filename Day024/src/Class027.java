/*
	문제
	1. 지역변수와 인스턴스 변수를 고르시오
	- 지역변수 : args,i,str1,str2,str3
	- 인스턴스변수 : 없음
	
	2. Runtime Data Area 에서 저장되는 위치를 적으시오
	- 지역변수 : Stack Area
	- 인스턴스변수 : Heap Area
	
	3. 다음을 작성해보고 출력되는 결과와 설명을 붙이시오.
	test1 : 같다. "monday"라는 스트링의 주소를 str1과 str2가 가지고 있음 
	test2 : 같다. 각 String의 content가 같음
	test3 : 다르다. str3는 String instance의 주소를 가리키고 있음
	test4 : 같다. str1과 str3의 content를 비교
*/


public class Class027 {

	public static void main(String[] args) {

		String str1 = "monday";
		String str2 = "monday";
		String str3 = new String("monday");
		
		for(int i=1;i<6;i++) {System.out.println(i);}
		
		System.out.println("test1 : "+ ((str1==str2)? "같다":"다르다"));
		System.out.println("test2: "+ ((str1.equals(str2)? "같다":"다르다")));
		System.out.println("test3 : "+ ((str1==str3)? "같다":"다르다"));
		System.out.println("test4 : "+ ((str1.equals(str3)? "같다":"다르다")));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}

}
