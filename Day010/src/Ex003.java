
public class Ex003 {

	public static void main(String[] args) {
		/*
		 * 1+(1+2)+(1+2+3)+.....(1+2+3+....+10)=220의 결과를 계산하시오. 
			for , while , do while문을 이용해서   처리하시오.
		 */
		
		//for
		int i=0,j=0,show=0;
		String sum="";
		boolean first=true,sec=true;
		
		for(i=1;i<=10;i++)
		{
			if (first) {first=false;}
			else {System.out.print("+");}
			
			if (sec) {sec=false;System.out.print(i);}
			else {System.out.print("(" +sum+i+")");}
			sum+=""+i+"+";
			j+=+i;
			show+=j;
		}
		System.out.println("="+show);
		
	
		//while
		i=1;j=0;show=0;sum="";first=true;sec=true;
		
		while(i<=10)
		{
			if (first) {first=false;}
			else {System.out.print("+");}
			
			if (sec) {sec=false;System.out.print(i);}
			else {System.out.print("(" +sum+i+")");}
			sum+=""+i+"+";
			j+=+i;
			show+=j;
			i++;
		}
		System.out.println("="+show);
		
		//do~while
		i=1;j=0;show=0;sum="";first=true;sec=true;
		
		do
		{
			if (first) {first=false;}
			else {System.out.print("+");}
			
			if (sec) {sec=false;System.out.print(i);}
			else {System.out.print("(" +sum+i+")");}
			sum+=""+i+"+";
			j+=+i;
			show+=j;
			i++;
		}
		while (i<=10);
		System.out.println("="+show);
	}

}
