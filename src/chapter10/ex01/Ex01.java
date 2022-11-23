package chapter10.ex01;


class Animal {				//Animal 클래스를 상속해서 Tiger, Eagle, Lion 클래스를 생성
								//자식 클래스에서는 필드1, 메소드1 정의
							//LionChild클래스는 Lion 클래스를 상속해서 필드1, 메소드 1.
	
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}	
}

class Tiger extends Animal{
	
	int tiger1;	
	void eat1() {
		System.out.println("호랑이는 먹습니다.");
	}
}

class Eagle extends Animal{
	
	int Eagle1;
	void eat2() {
		System.out.println("독수리는 먹습니다.");
	}
}

class Lion extends Animal{
	
	int Lion1;
	void eat3() {
		System.out.println("사자는 먹습니다.");
	}
}

class LionChild extends Lion{
	
	int Lionchild1;
	void eat4() {
		System.out.println("아기사자는 먹습니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {

		System.out.println("=====자식(Tiger), 부모(Animal) 필드와 메소드 출력========");
		
		Tiger a1 = new Tiger(); 
		
		a1.name = "Tiger";
		a1.age = 2;
		a1.color = "Red";
		
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.color);
		
		a1.eat();
		a1.eat1();
		
		System.out.println("=====자식(Eagle), 부모(Animal) 필드와 메소드 출력========");
		
		Eagle e1 = new Eagle();
		
		e1.name = "Eagle";
		e1.Eagle1 = 3;
		
		System.out.println(e1.name);
		System.out.println(e1.Eagle1);
		
		e1.eat();
		e1.eat2();
		
		System.out.println("=====자식(Lion), 부모(Animal) 필드와 메소드 출력========");
		
		Lion l1 = new Lion();
		
		l1.name = "Lion";
		l1.color = "black";		
		
		System.out.println(l1.name);
		System.out.println(l1.color);
		
		l1.eat();
		l1.eat3();
		
		System.out.println("===LionChild --> Lion --> Animal 필드와 메소드 출력===");
		
		LionChild c1 = new LionChild();
		
		c1.name = "Lion";
		c1.age = 5;
		c1.color = "pink";
		c1.Lion1 = 2;
		c1.Lionchild1 = 1;
					
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.color);
		System.out.println(c1.Lion1);
		System.out.println(c1.Lionchild1);
		
		c1.eat();
		c1.eat3();
		c1.eat4();

	
	}
}
