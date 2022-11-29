package chapter13.ex08;

interface Animal{
	void cry();
	void fly();
}

// 인터페이스를 사용해서 4가지 형태로 출력 
// 1. Animal을 구현한 Inner 클래스를 생성후 메소드 출력
// 2. Animal을 익명 클래스로 생성해서 출력
// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성
// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 출력

class A {
	
	Animal a = new Tiger();
	
	void abc() {
		a.cry();
		a.fly();		
	}
	
	class Tiger implements Animal {
		@Override
		public void cry() {
			System.out.println("호랑이 어흥");
			
		}
		@Override
		public void fly() {
			System.out.println("호랑이 걸어가요");
			
		}
	}
}

class B {
	Animal b = new Animal() {
		public void cry() {
			System.out.println("사자 어흥");
		}
		public void fly() {
			System.out.println("사자걸어감");
		}
	};
	
	void abc() {
		b.cry();
		b.fly();
	}
}

class C {
	void cd (Animal a) {
		a.cry();
		a.fly();
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		A a = new A();
		a.abc();
		
		System.out.println("=======================");
		
		B b = new B();
		b.abc();
		
		System.out.println("=======================");
		
		C c = new C();
		
		Animal d = new Animal () {
			@Override
			public void cry() {
				System.out.println("고양이야옹");
				
			}
			@Override
			public void fly() {
				System.out.println("고양이 걸어가요");
				
			}
		};
		
		c.cd(d);
		
		System.out.println("===========================");
		
		c.cd(new Animal () {
			@Override
			public void cry() {
				System.out.println("강아지멍멍");
				
			}
			@Override
			public void fly() {
				System.out.println("강아지 걸어가요");
				
			}
		});
}
}