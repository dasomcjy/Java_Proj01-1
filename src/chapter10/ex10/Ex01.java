package chapter10.ex10;

class C {
	String stuID ;
	String name;
	int age;
	
	//c1.equals(c2)  //stuID 필드를 재정의 해서 , stuID가 같으면 true, 아니면 false
	
	
	// 생성자, 기본생성자1, 생성자2 
	
	//toString 메소드 재정의 : 필드의 값을 출력, 객체
		
	

	C () {};
	
	C(String stuID) {
		this.stuID = stuID ;		
	}
	
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {    // Object 타입으로 업캐스팅해서 들어옴.
		if( this.stuID == ((C)obj).stuID ) {
			return true;			
		}else {
			return false;
}
	}
}	
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	C c1 = new C("안녕안녕");
	C c2 = new C("안녕안녕");
	
	System.out.println(c1 == c2);
	System.out.println(c1.equals(c2));
	
	C c3 = new C ();
	
	c3.stuID = "학생";
	c3.name = "최지윤";
	c3.age = 17;
			
			
	System.out.println(c3);
	
	}

}
