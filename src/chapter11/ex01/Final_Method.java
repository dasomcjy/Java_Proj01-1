package chapter11.ex01;

class Aa {
	
	//생략된 생성자 출력 
	Aa() {
		
	}
	
	void print () {
		System.out.println("Aa 클래스의 print() 메소드 입니다.");
	}
	
	// 자식 클래스 재정의(오버라이딩 불가)할 수 없더록 설정한 메소드 : 아주 중요한 메소드
	final void run () {
		System.out.println("Aa 클래스의 run() 메소드 입니다. ");
	}	
}

class Bb extends Aa {
	
	@Override
	void print() {
		System.out.println("Bb 클래스에서 오버라이딩됨");		
	}
	
	//생략된 생성자 출력
	Bb () {
		super();
	}
	
	
	//@Override
	//void run () {}

	//자식에서 수정을 할 수 없는 메소드
}

public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aa a1 = new Bb();
		a1.print();
		

	}

}
