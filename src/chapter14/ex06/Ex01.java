package chapter14.ex06;

// 1. 예외 발생할때 각 메소드 내부에서 예외를 직접 처리함.

class C {
	void abc(){
		bcd();			
	}
	void bcd() {	//메소드 블락에서 직접 예외 처리
		try {
		System.out.println( 3/0 );
		int [] arr = new int [] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
		}catch (ArithmeticException e) {
			System.out.println("숫자 0으로는 나눌수 없습니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 방의 갯수 부족합니다.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

// 2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws

class D {
	
	void abc() {
		try {
			bcd();
		}catch (ArithmeticException e) {
			System.out.println("숫자 0으로는 나눌수 없습니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 방의 갯수 부족합니다.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void bcd() throws InterruptedException {
		

		System.out.println( 3/0 );
		int [] arr = new int [] {1,2,3};
		System.out.println(arr[5]);
		Thread.sleep(1000);
		
	}
}
	

public class Ex01 {

	public static void main(String[] args) {
		
		C c = new C ();
		D d = new D ();
		
		c.abc();
		d.abc();
	}
}
