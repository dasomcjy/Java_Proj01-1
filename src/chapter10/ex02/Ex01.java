package chapter10.ex02;

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human{
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student {
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2는 음식을 맛있게 먹습니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습 
		// 1. Student 클래스를 생성하면서 Human 타입으로 지정   : h1
		// 2. Student 클래스를 생성하면서 Student 타입으로 지정 : s1
		
		// 3. Student2 객체를 생성하면서 Human타입으로 지정 : h2
		// 4. Student2 객체를 생성하면서 student 타입으로 지정 : s2
		// 5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		
		
		// 1. Student 클래스를 생성하면서 Human 타입으로 지정   : h1		
		Human h1 = new Student ();
		
		h1.eat();
		
		// 2. Student 클래스를 생성하면서 Student 타입으로 지정 : s1
		Student s1 = new Student ();
		
		s1.eat();
		s1.stuID = "호잇";
		System.out.println(s1.stuID);
		
		// 3. Student2 객체를 생성하면서 Human타입으로 지정 : h2
		Human h2 = new Student2 ();
		h2.eat();
		
		// 4. Student2 객체를 생성하면서 student 타입으로 지정 : s2
		Student s2 = new Student2();
		s2.name = "호호호";
		s2.stuEat();
		
		// 5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		Student2 s3 = new Student2();
		s3.stu2Eat();
		
		Student s4 = null;
		if (h2 instanceof Student) {
			s4 = (Student) h2;
		}
		s4.eat();
		s4.stuEat();
		
		Student2 s5 = null;
		if (h2 instanceof Student2) {
			s5 = (Student2) h2;
		}
		
		s5.eat();
		s5.stuEat();
		s5.stu2Eat();
	}

}
