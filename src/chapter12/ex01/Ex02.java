package chapter12.ex01;

abstract class Calc2 {		// 사칙 연산을 계산하는 계산기 클래스
 
	
	abstract void add (int a, int b);   // 더하기 연산
	abstract void diff (int a, int b);	// 뺄셈
	abstract void mul (int a, int b);	// 곱하기
	abstract void div (int a, int b);	// 나누기
}

abstract class Calc3{
	abstract void add (int a, int b);   
	abstract void diff (int a, int b);	
	abstract void mul (int a, int b);	
	abstract void div (int a, int b);	
}


class Calc_Impl2 extends Calc2 {
	
	@Override
	void add(int a, int b) {
		System.out.println("덧셈하면 " + (a+b));		
	}
	
	@Override
	void diff(int a, int b) {
		System.out.println("뺄셈하면 " + (a-b));
		
	}
	
	@Override
	void mul(int a, int b) {
		System.out.println("곱하면" + (a*b));
		
	}
	
	@Override
	void div(int a, int b) {
		System.out.println("나누면" + (a/b));
		
	}
}


public class Ex02 {

	public static void main(String[] args) {
		// 1. 구현클래스의 메소드 호출후 출력
		int a = 5;
		int b = 4;
		
		Calc2 c1 = new Calc_Impl2();
		
		c1.add(a, b);
		c1.diff(a, b);
		c1.mul(a, b);
		c1.div(a, b);
		
		// 2. 익명 클래스로 메소드 호출후 출력
		
		Calc2 c2 = new Calc2() {

			
			@Override
			void add(int a , int b) {
				System.out.println("덧셈하면 " + (a+b));		
			}
			@Override
			void diff(int a , int b ) {
				System.out.println("뺄셈하면 " + (a-b));
				
			}
			@Override
			void mul(int a, int b) {
				System.out.println("곱하면" + (a*b));
				
			}
			@Override
			void div(int a, int b) {
				System.out.println("나누면" + (a/b));
				
			}
			
		};
		
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
	}

}
