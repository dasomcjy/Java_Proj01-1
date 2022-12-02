package chapter16.ex07;


abstract class Fluit {
	abstract void print();		// 추상 메소드, 객체의 필드 정보를 출력

}

class Apple extends Fluit{
	private String name;
	private int price;
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	void print() {
		System.out.println("상품이름은 :" + name + "이고, 가격은 :" + price + "입니다.");
		
	}
	//getter , setter를 통해서 인풋
	
	//print(메소드 오버라이딩해서 필드의 정보를 출력)
	
	
}
class Banana extends Fluit {
	
	private String name;
	private int price;
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void print() {
		System.out.println("상품이름은 :" + name + "이고, 가격은 :" + price + "입니다.");
		
	}
}

//Fluit을 상속하지 않았기 때문에 제너릭 타입으로 저장이 불가
class Pencil {
	private String name;
	private int price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void print() {
		System.out.println("상품이름은 :" + name + "이고 , 가격은 :" + price + "입니다.");
	
	}
	
}

// 제너릭 클래스 : Fluit을 상속하는 클래스만 저장할 수 있는 제너릭 클래스
class GenericClass <T extends Fluit> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class Ex01 {

	public static void main(String[] args) {

		Apple a1 = new Apple();
		a1.setName("애플");
		a1.setPrice(1000);
		a1.print();
		
		
		GenericClass<Apple> g1 = new GenericClass<Apple>();
		g1.setT(a1);
		g1.getT().print();
	
		System.out.println("========================");
		
		Banana b1 = new Banana();
		b1.setName("바나나");
		b1.setPrice(500);
		b1.print();
		
		GenericClass<Banana> g2 = new GenericClass<Banana>();
		
		g2.setT(b1);
		g2.getT().print();
		
		System.out.println("===========================");
		
		Pencil p1 = new Pencil();
		p1.setName("연필");
		p1.setPrice(3000);
		p1.print();
}
}
