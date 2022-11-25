package chapter11.ex04;

abstract class Car {		//트럭 , 자가용, 굴삭기
	abstract void run() ;
	abstract void eat() ;
}

class Car1 extends Car{
	@Override
	void run() {
		System.out.println("트럭은 달린다.");	
	}
	@Override
	void eat() {
		System.out.println("트럭은 기름을 먹는다.");
		
	}
}

class Car2 extends Car{
	@Override
	void run() {
	System.out.println("자가용은 달린다.");		
	}
	@Override
	void eat() {
    System.out.println("자가용은 기름을 마신다.");		
	}
}

class Car3 extends Car{
	@Override
	void run() {
	System.out.println("굴삭기는 달린다.");		
	}
	@Override
	void eat() {
	System.out.println("굴삭기는 기름을 먹는다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Car c1 = new Car1();
		c1.eat();
		c1.run();

		Car2 c2 = new Car2();
		c2.eat();
		c2.run();
		
		Car c3 = new Car3();
		c3.eat();
		c3.run();
	}

}
