package day029_Abstract;

abstract class Calc {
	public abstract double exec(double a, double b);
}

class Plus extends Calc {
	double num1, num2;

	Plus() {}
	Plus(double a, double b) {
		super();
		this.num1 = a;
		this.num2 = b;
		}

	public double exec(double a, double b) {
		System.out.println("더하기 : " + (int)(a + b));
		return (a + b);
	}
}

class Minus extends Calc {
	double num1, num2;

	Minus() {}
	Minus(double a, double b) {
		super();
		this.num1 = a;
		this.num2 = b;
	}

	public double exec(double a, double b) {
		System.out.println("빼기 : " + (int)(a - b));
		return a - b;
	}
}

class Multiply extends Calc {
	double num1, num2;

	Multiply() {}
	Multiply(double a, double b) {
		super();
		this.num1 = a;
		this.num2 = b;
	}

	public double exec(double a, double b) {
		System.out.println("곱하기 : " + (int)(a * b));
		return a * b;
	}
}

class Divide extends Calc {
	double num1, num2;

	Divide() {}
	Divide(double a, double b) {
		super();
		this.num1 = a;
		this.num2 = b;
	}

	public double exec(double a, double b) {
		System.out.println("나누기 : " + String.format("%.2f", (a / b)));
		return a / b;
	}
}

public class Abstract003 {
	public static void main(String[] args) {
		// TEST001
		// Calc mycalc = new Calc() => new를 못하는 이유 : 추상형 클래스로 인스턴스화 불가

		// TEST002
		// ※ 다형성을 이용하여 다음과 같이 출력하시오
		// ※ mycalc는 Plus, Minus.. 등을 담을 수 있다.
		int num1 = 10;
		int num2 = 3;
		Calc[] mycalc = { new Plus(num1, num2), 
				new Minus(num1, num2), 
				new Multiply(num1, num2),
				new Divide(num1, num2) };
		for (int i = 0; i < mycalc.length; i++) {
			mycalc[i].exec(num1, num2);
		}

	}

}
