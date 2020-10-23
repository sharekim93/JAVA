
public class Method005_string {

	public static void main(String[] args) {
		String address = "http://WWW.CodeJohns.co.kr/join/index.html";
		
		System.out.print("1. 문자열 출력 : ");
		System.out.println(address);
		
		System.out.print("2. 글자 수를 리턴 : ");
		System.out.println(address.length());
		
		System.out.print("3. index의 1번째 위치의 글자 : ");
		System.out.println(address.charAt(1));
		
		System.out.print("4. /가 처음 나타나는 위치 : ");
		System.out.println(address.indexOf("/"));
		
		System.out.print("5. 두 번째 /가 나타나는 위치 : ");
		System.out.println(address.indexOf("/", address.indexOf("/")+1));
		
		System.out.print("6. /의 마지막 위치 : ");
		System.out.println(address.indexOf("/", address.lastIndexOf("/")));
		
		System.out.print("7. 폴더이름 join의 문자열 추출 : ");
		System.out.println(address.substring(address.indexOf("j"),address.indexOf("/i")));

		System.out.print("8. 마지막 /번째부터 끝까지 : ");
		System.out.println(address.substring(address.lastIndexOf("/"),address.length()));
		
		System.out.print("9. 대문자로 변환 : ");
		System.out.println(address.toUpperCase());
		
		System.out.print("10. 소문자로 변환 : ");
		System.out.println(address.toLowerCase());

		System.out.print("11. 도메인 : ");
		System.out.println((address.substring(address.indexOf("WWW"),address.indexOf("/j")).toLowerCase()));
	}

}
