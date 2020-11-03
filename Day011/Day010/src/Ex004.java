
public class Ex004 {

	public static void main(String[] args) {
		/*
		 * 1+(-2)+3+(-4)+... 과 같은 식으로 계속더해나갔을때 , 몇까지 더해야 총합이 100이상이 되는지 계산하시오.
			for , while , do while문을 이용해서   처리하시오.
		 */

		int s=1,num=0,sum=0;
		boolean first=true;
		for(int i=1;sum<100;i++)
		{
			num=i*s;
			s=-s;
			sum+=num;
			
			// 또는 sum +=(i%2==1)? i:-i;
			
			if (first) {first=false;}
			else {System.out.print("+");}
			
			if (i%2!=0)	{System.out.print(i);}
			else {System.out.print("("+num+")");}

		}
		System.out.println();
		System.out.println(num+"까지 더해야합니다");
		
		s=1;num=0;sum=0;first=true;int i=1;
		while (sum<100)
		{
			num=i*s;
			s=-s;
			sum+=num;
			
			if (first) {first=false;}
			else {System.out.print("+");}
			
			if (i%2!=0)	{System.out.print(i);}
			else {System.out.print("("+num+")");}
			
			i++;
		}
		System.out.println();
		System.out.println(num+"까지 더해야합니다");
		
		s=1;num=0;sum=0;first=true;i=1;
		do
		{
			num=i*s;
			s=-s;
			sum+=num;
			
			if (first) {first=false;}
			else {System.out.print("+");}
			
			if (i%2!=0)	{System.out.print(i);}
			else {System.out.print("("+num+")");}
			
			i++;
		}
		while(sum<100);
		System.out.println();
		System.out.println(num+"까지 더해야합니다");
	}

}
