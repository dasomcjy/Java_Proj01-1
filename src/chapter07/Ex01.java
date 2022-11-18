package chapter07;

class Calc{
	
	//사칙 연산을 처리하는 메소드
	
	//두 정수의 값을 받아서 더해서 값을 던져줌
	int add (int a, int b) {
		return a + b;
	}
	 
	// 빼기 (diff)
	
	int diff (int a, int b) {
		return a - b;
	}
	
	// 곱하기 (mul)
	
	int mul (int a, int b) {
		return a * b;
	}
	
	// 나누기	 (div) : double
	
	double div ( double a, double b) {
		return a / b;
	}
	
	// 면적 (Rec) (가로 : x 세로 : y)
	
	double rec ( double a, double b) {
		return a * b;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calc a = new Calc();
     
     int p = a.add(4, 3);
     System.out.println(p);
     
     int o = a.diff(7, 3);
     System.out.println(o);
     
     int i = a.mul(5, 3);
     System.out.println(i);
     
     double u = a.div(10, 2);
     System.out.println(u);

     double y = a.rec(10,10);
     System.out.println(y);
     
     
     Calc calc = new Calc();
     
     System.out.println(calc.add(10, 20));
     System.out.println(calc.diff(50, 22));
     System.out.println(calc.mul(40, 50));
     System.out.println(calc.div(100, 55));
     System.out.println(calc.rec(20, 68.8));
     
	}

}
