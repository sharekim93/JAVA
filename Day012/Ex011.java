
public class Ex011{

	public static void main(String[] args) {
		
		//변수
		int num1=1,num2=1,num3=0;
		boolean first =true;
		System.out.print(num1+"\t,\t"+num2+"\t,\t");
		
		for(num1=1;num1+num2<=21;)
		{
			if (first) {first=false;}
			else {System.out.print("\t,\t");}
			
			num3=num1+num2;
			System.out.print(num3);
			num1=num2;
			num2=num3;
		}

	}

}
