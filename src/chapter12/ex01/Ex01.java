package chapter12.ex01;

abstract class Calc {	// 사칠 연산을 계산하는 계산기 클래스
	abstract int add (int a , int b);		//더하기 연산
	abstract int diff (int a , int b);		//뺄셈
	abstract int mul (int a , int b);		//곱하기
	abstract double div (int a , int b); 	// 나누기 	
	
}

abstract class Calc0{
		abstract int add (int a , int b);		//더하기 연산
		abstract int diff (int a , int b);		//뺄셈
		abstract int mul (int a , int b);		//곱하기
		abstract double div (int a , int b); 	// 나누기 	
		
	}


class Calc_Impl extends Calc {		// Calc를 구현한 클래스
	@Override
	int add(int a, int b) {
		System.out.println(" 덧셈하면 " + (a+b));
		return 0;
	}
	
	@Override
		int diff(int a, int b) {
			System.out.println("뺄셈하면 " + (a-b));
			return 0;
		}
	@Override
		int mul(int a, int b) {
			System.out.println("곱하면" + (a*b));
			return 0;
		}
	
	@Override
		double div(int a, int b) {
			System.out.println("나누면" + (a/b));
			return 0;
		}
}



public class Ex01 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		// 1. 구현한 클래스의 메소드 호출후 출력
		
		Calc c1 = new Calc_Impl();
		
		c1.add(a, b);
		c1.diff(a, b);
		c1.div(a, b);
		c1.mul(a, b);
		
		
		// 2. 익명 클래스로 메소드 호출후 출력

		Calc0 c2 = new Calc0() {
			@Override
			int add(int a, int b) {
				System.out.println(" 덧셈하면 " + (a+b));
				return 0;
			}
			
			@Override
			int diff(int a, int b) {
				System.out.println("뺄셈하면 " + (a-b));
					return 0;
					
			}
			@Override
			int mul(int a, int b) {
			System.out.println("곱하면" + (a*b));
			return 0;
	
			}
			@Override
			double div(int a, int b) {
			System.out.println("나누면" + (a/b));
			return 0;
	
		}		
		};
				
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
	}

}
