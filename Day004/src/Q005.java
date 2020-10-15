
public class Q005 {

	public static void main(String[] args) {
		/* 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 괄호에 오류라고 적으시오.
		 * System.out.println("1"  +   "2") → (  )
		 * System.out.println(true +   "" ) → (  )
		 * System.out.println('A'  +   'B') → (  )
		 * System.out.println('1'  +    2 ) → (  )
		 * System.out.println('1'  +   '2') → (  )
		 * System.out.println('J'  + "ava") → (  )
		 * System.out.println(true  + null) → (  )
		 */
		
		System.out.println("다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 괄호에 오류라고 적으시오.");
		System.out.println("System.out.println(\"1\"  +   \"2\") → (  )");
		System.out.println("System.out.println(true +   \"\" ) → (  )");
		System.out.println("System.out.println('A'  +   'B') → (  )");
		System.out.println("System.out.println('1'  +    2 ) → (  )");
		System.out.println("System.out.println('1'  +   '2') → (  )");
		System.out.println("System.out.println('J'  + \"ava\") → (  )");
		System.out.println("System.out.println(true  + null) → (  )\n");
		
		System.out.println("Answer : \nSystem.out.println(\"1\"  +   \"2\") → ( 12 )");
		System.out.println("System.out.println(true +   \"\" ) → ( true )");
		System.out.println("System.out.println('A'  +   'B') → ( 131 )");
		System.out.println("System.out.println('1'  +    2 ) → ( 51 )");
		System.out.println("System.out.println('1'  +   '2') → ( 99 )");
		System.out.println("System.out.println('J'  + \"ava\") → ( Java )");
		System.out.println("System.out.println(true  + null) → ( 오류 )");
	}

}
