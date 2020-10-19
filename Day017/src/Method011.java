
public class Method011 {
	
	public static char capitalize(char a) {
		if(a>64&&a<97) {return (char)(a+32);}
		else if(a>96&&a<123) {return (char)(a-32);}
		else return 0;
	}
	public static void main(String[] args) {
		char ch='a';
		char ch2='A';
		
		System.out.println(capitalize(ch));
		System.out.println(capitalize(ch2));
		
	}

}
