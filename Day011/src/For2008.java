
public class For2008 {

	public static void main(String[] args) {
		
		//for
		System.out.println("====for문 이용====");
		int sum=1;
		boolean first =true;
		for(int i=4;i>=1;i--)
		{	
			
			if(first) {first=false;}
			else {System.out.print("*");}
			
			System.out.print(i);
			sum=sum*i;
		}
		System.out.println("="+sum);
		
		
		//while
		System.out.println("====while문 이용====");
		int i=4;sum=1;first=true;
		while(i>=1)
		{	
			if(first) {first=false;}
			else {System.out.print("*");}
			
			System.out.print(i);
			sum=sum*i;
			i--;
		}
		System.out.println("="+sum);
		
		//do~while
		System.out.println("====do~while문 이용====");
		i=4;sum=1;first=true;
		do
		{	
			if(first) {first=false;}
			else {System.out.print("*");}
			
			System.out.print(i);
			sum=sum*i;
			i--;
		}
		while(i>=1);
		System.out.println("="+sum);
	}

}
