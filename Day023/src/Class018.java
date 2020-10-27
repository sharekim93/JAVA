
class MyMath3 {
	
	int add(int a, int b) {return (a + b);}
	long add(long a, int b) {return (a + b);}
	long add(int a, long b) {return (a + b);}
	long add(long a, long b) {return (a + b);}
	int add(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {sum+=a[i];}
		return sum;
	}
	MyMath3(){};
}

public class Class018 {

	public static void main(String[] args) {
		MyMath3 mm =new MyMath3();
		System.out.println("mm.add(3,3) 결과 : "+mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과 : "+mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과 : "+mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과 : "+mm.add(3L,3L));
		// 인스턴스변수 : 없음
		// new를 통해 인스턴스화
		// MyMath3() 로 초기화
		int[] a= {100,200,300};
		System.out.println("mm.add(a) 결과 : "+mm.add(a));

	}

}
