import java.util.Scanner;

public class MethodApi004 {
	public static void main(String[] args) {
		System.out.println("002.String");
		//문자열의 길이 length, 문자열 찾기 indexOf, 문자열 일부분 추출 substring
		//패턴에 맞춰 문자열 자르기 split, 대문자로 변환 toUpperCase, 소문자 변환 toLowerCaset
		//바꾸기 replace
		
		String str = "apple, banana, coconut";
		
		System.out.println("1.length - 문자열 길이 확인 : " + str.length());
		System.out.println("2.indexOf('찾고자 하는 문자열') - 문자열 찾기 : " +str.indexOf("apple"));
		System.out.println("3.charAt('찾고자 하는 문자번호') - 지정 문자 출력 : "+ str.charAt(5));
		System.out.println("4.replace('찾는 값','바꿀 값') - 찾아서 바꾸기"+ str.replace("banana", "melon"));
		System.out.println("5.substring('시작, 어디 전까지') - 문자열 일부분 추출 : " + str.substring(0, 5));
		System.out.println("> sub string&indexOf 조합 : str.substring(str.indexOf(\"A\"), str.indexOf(\",\"))");
		System.out.println("5.split('기준값') - 기준값을 기준으로 문자열을 잘라서 배열로 리턴 - ");
		String[] fruits = str.split(",");
		System.out.println(fruits[0]+"\t"+fruits[1]+"\t"+fruits[2]+"\t");
		
		System.out.println("6. 대문자 :" +str.toUpperCase());
		System.out.println("7. 소문자 :" +str.toLowerCase());
		
		
		//Q1) length - 아이디를 입력 받기 / 아이디의 길이가 10자 미만이라면 무한반복으로 다시 입력 받게 만들기
		Scanner scanner = new Scanner(System.in);
		String id=null;
		
		System.out.println("==== String.length()");
		while(true) {
			System.out.print("아이디를 10자 이상 입력하세요 : ");
			id =scanner.next();

			if(id.length()>=10) break;
		}
		System.out.println();
		
		//Q2) indexOf - 이메일 입력 받기 / @가 없다면 admi@email.com의 형식으로 입력하셔야 합니다. 출력
		System.out.println("==== String.indexOf()");
		System.out.println("이메일을 입력하세요  \n ex)admi@email.com");
		id= scanner.next();
		if(id.indexOf("@")==-1) {System.out.println("admi@email.com의 형식으로 입력하셔야 합니다.");}
		
		//Q3) http를 찾아서 https로 바꾸기 - String naver = "http://www.naver.com";
		String naver = "http://www.naver.com";
		
		System.out.println("==== String.replace");
		System.out.println(naver);
		System.out.println("<<<replace>>>");
		naver=naver.replace("http","https");
		System.out.println(naver);
		System.out.println();
		
		String files = "Png,Jpg,Gif,Txt";
		//Q4) ,를 기준으로 문자열 분리 후 myfile이라는 배열에 담기 - 다음과 같이 출력
		/*
		 * 1. Png#
		 * 2. Jpg#
		 * 3. Gif#
		 * 4. Txt#
		 */
		System.out.println("Q4) ,를 기준으로 문자열 분리 후 myfile이라는 배열에 담기 - 다음과 같이 출력");
		String myfile[] = files.split(",");
		for(int i=0; i<myfile.length;i++) {
			System.out.print("#"+(i+1)+". "+myfile[i]+"#\n");
		}
		System.out.println("");
		
		//Q5)  toUpperCase를 이용하여 Jpg,Gif를 대문자로 변환 후 배열에 담기
		System.out.println("Q5)  toUpperCase를 이용하여 Jpg,Gif를 대문자로 변환 후 배열에 담기");
		for(int i=0; i<myfile.length;i++){
			if (myfile[i].equals("Jpg")) {myfile[i]=myfile[i].toUpperCase();}
			else if(myfile[i].equals("Gif")) {myfile[i]=myfile[i].toUpperCase();}	
		}
		System.out.print("결과 체크 :");
		for(int i=0; i<myfile.length;i++) {
			System.out.print(myfile[i]+"\t");	
		}
		System.out.println("\n");
		
		//Q6) toLowerCase를 이용하여 Png를 소문자로 변환 후 배열에 담기
		System.out.println("Q6) toLowerCase를 이용하여 Png를 소문자로 변환 후 배열에 담기");
		for(int i=0; i<myfile.length;i++){
			if (myfile[i].equals("Png")) {myfile[i]=myfile[i].toLowerCase();}
		}
		System.out.print("결과 체크 :");
		for(int i=0; i<myfile.length;i++) {
			System.out.print(myfile[i]+"\t");	
		}
		System.out.println("\n");
		
		String colors = "Red,Green,Blue,Black";
		//Q7) indexOf와 substring을 이용하여 colors 문자열에서 Green이 들어간 컬러를 찾아 문자열 일부분을 추출하시오
		System.out.println("indexOf와 substring을 이용하여 colors 문자열에서 Green이 들어간 컬러를 찾아 문자열 일부분을 추출하시오");
		System.out.println(colors.substring(colors.indexOf("G"),colors.indexOf(",B")));
	}
}
