import java.util.Scanner;

public class Day010_3 {

	public static void main(String[] args) {
		// if 버전으로 문제를 풀으시오
		//변수
		int i=0;
		
		//for
		for (i=1;i<=5;i++) {System.out.print(i+"\t");}
		System.out.println();
		for (i=5;i>=1;i--) {System.out.print(i+"\t");}
		
		System.out.println();
		System.out.println();
		
		
		//while
		i=1;
		while (i<=5) {System.out.print(i+"\t");i++;}
		System.out.println();
		i=5;
		while (i>=1) {System.out.print(i+"\t");i--;}
		
		System.out.println();
		System.out.println();
		
		//do while
		i=1;
		do {System.out.print(i+"\t");i++;} while (i<=5);
		System.out.println();
		i=5;
		do {System.out.print(i+"\t");i--;} while (i>=1);
		}
	}

