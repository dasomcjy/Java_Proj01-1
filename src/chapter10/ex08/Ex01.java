package chapter10.ex08;

class Animal {
	void run () {
		System.out.println("모든 동물은 달립니다.");
	}
}

class Man extends Animal{
	void run () {
		System.out.println("사람은 달립니다.");
	}
}

class Woman extends Animal{
	void run () {
		System.out.println("사람2는 달립니다.");
	}
}

class Lion extends Animal{
	void run () {
		System.out.println("사자는 달립니다.");
	}
}

class Tiger extends Animal {
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
}

class Cat extends Animal {
	void run() {
		System.out.println("고양이는 달립니다.");		
	}
}

class Dog extends Animal {
	void run() {
		System.out.println("개는 달립니다.");
	}
}

class DogChild extends Dog {
	void run() {
		System.out.println("강아지는 달립니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//  Animal : 부모클래스, run() 정의
		//  자식 클래스 : Man , Woman, Lion, Tiger, Cat, Dog, DogChild(Dog 밑에) <==다형성
		//  - 부모의 run 메소드를 재정의
		//  arr 배열에 Animal 저장후 For, Enhanced For 문으로 출력, run() 메소드 출력
		
		
		Animal a1 = new Man();
		Animal a2 = new Woman();
		Animal a3 = new Lion();
		Animal a4 = new Tiger();
		Animal a5 = new Cat();
		Animal a6 = new Dog();
		Animal a7 = new DogChild();
		
		a1.run();
		a2.run();
		a3.run();
		a4.run();
		a5.run();
		a6.run();
		a7.run();

		System.out.println("=======배열로 출력 =======");
		
		Animal[] arr1 = new Animal[7];
		
	
		arr1[0] = a1;
		arr1[1] = a2;
		arr1[2] = a3;
		arr1[3] = a4;
		arr1[4] = a5;
		arr1[5] = a6;
		arr1[6] = a7;
	
	  
		Animal b1 = arr1[0]; 
		Animal b2 = arr1[1];
		Animal b3 = arr1[2];
		Animal b4 = arr1[3];
		Animal b5 = arr1[4];
		Animal b6 = arr1[5];
		Animal b7 = arr1[6];
		
		b1.run();
		b2.run();
		b3.run();
		b4.run();
		b5.run();
		b6.run();
		b7.run();
		
		
		System.out.println(" =====For 문으로 출력======");
		
		for (int i = 0 ; i <arr1.length; i++) {
			Animal a = arr1[i];
			a.run();		
		}	

		
		System.out.println("====Enhanced For 문으로 출력");	
		
		for (Animal k : arr1) {
			k.run();
		}
	}
	
}
