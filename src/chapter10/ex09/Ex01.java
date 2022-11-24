package chapter10.ex09;

class Car {
	private String carName; 
	private String carColor;
	private int  maxSpeed;
	private String carModel;
	
	Car(){}
	public Car( String carName , String carColor , int maxSpeed , String carModel ) {
		
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}
	
	//getter , setter
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본생성자, 인풋을 받는 생성자, 
		// 2. getter, Setter 생성
		// 3. toString () 재정의 : 전체 메모리 내용 출력 .
		
		// 4. 생성자를 통해서 값을 할당후 메모리의 전체 내용 출력.
		// 5. setter를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력.
				//getter를 사용해서 각 필드의 내용을 출력
		
		
		Car c1 = new Car("차" , "빨강" , 200 , "모델");
		System.out.println(c1);
		System.out.println(c1.toString());
		
		System.out.println("===========setter=============");
		
		Car c2 = new Car();
		c2.setCarName("차");
		c2.setCarColor("노랑");
		c2.setMaxSpeed(300);
		c2.setCarModel("노랑모델");
		System.out.println(c2);
		System.out.println(c2.toString());
	   
		System.out.println("=============getter==============");
		
		System.out.println(c2.getCarName());
		System.out.println(c2.getCarColor());
		System.out.println(c2.getMaxSpeed());
		System.out.println(c2.getCarModel());

		
	}

}
