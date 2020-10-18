
public class Ex010 {

	public static void main(String[] args) {
		
		/* 기존 풀이
		int num =12345,value=0,deduct=12345;
		boolean first = true;
		
		for(int i=4;i>=0;i--)
		{
			if (first) {first=false;}
			else {System.out.print("+");}
		
			value = (int)(deduct/Math.pow(10,i));
			System.out.print(value);
			deduct = deduct-value*(int)Math.pow(10, i);			
		}
		System.out.println("="+num);
		*/
		
		int num =12345, deduct=10000, remain=12345, sum=0;
		boolean first = true;
		
		for(int i=1;i<=5;i++)
		{
			if (first) {first=false;}
			else {System.out.print("+");}
			
			System.out.print(remain/deduct);
			sum+=remain/deduct;
			remain=num-num/deduct*deduct;
			deduct=deduct/10;
		}
		System.out.println("="+sum);
	}

}
