
public class For2015_challenge {

	public static void main(String[] args) {
		System.out.println("====for문으로 풀기====");
		for(int i=1;i<4;i++)
		{
			int j=2;
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.print((j+2)+"*"+i+"="+(j+2)*i+"\t");
			System.out.println();
			j=2;
		}
		System.out.println();
		
		for(int i=1;i<4;i++)
		{
			int j=5;
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.print((j+2)+"*"+i+"="+(j+2)*i+"\t");
			System.out.println();
			j=5;
		}	
		System.out.println();
		for(int i=1;i<4;i++)
		{
			int j=8;
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.println();
		}	
		System.out.println();
		System.out.println("====while문으로 풀기====");
		int i=1,j=2;
		while(i<4)
		{
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.print((j+2)+"*"+i+"="+(j+2)*i+"\t");
			System.out.println();
			i++;
			j=2;
		}
		System.out.println();
		
		i=1;j=5;
		while(i<4)
		{
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.print((j+2)+"*"+i+"="+(j+2)*i+"\t");
			System.out.println();
			i++;
			j=5;
		}
		System.out.println();
		
		i=1;j=8;
		while(i<4)
		{
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.println();
			i++;
			j=8;
		}
		System.out.println();
			

		System.out.println("====do~while문으로 풀기====");
		i=1;j=2;
		do
		{
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.print((j+2)+"*"+i+"="+(j+2)*i+"\t");
			System.out.println();
			i++;
			j=2;
	
		}
		while(i<4);
		System.out.println();
		
		i=1;j=5;
		do
		{
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.print((j+2)+"*"+i+"="+(j+2)*i+"\t");
			System.out.println();
			i++;
			j=5;
		}
		while(i<4);
		System.out.println();
		
		i=1;j=8;
		do
		{
			System.out.print(j+"*"+i+"="+j*i+"\t");
			System.out.print((j+1)+"*"+i+"="+(j+1)*i+"\t");
			System.out.println();
			i++;
			j=8;
		}while(i<4);
	}

}
