package chapter07.ex05;

class Student {		//
	//필드 선언
	String stuName ;		//학생이름 : 학생이름없음
	int stuNo;				//학번    : 0
	String stuPhone;		//핸드폰번호 : 000-0000-0000
	String stuAddr;			// 주소 	  : "서울"
	int stuAge;				// 나이    :  0
	double stuWeight;		// 몸무게   : 0.0
	
	Student() {	 //기본생성자에서 초기값을 할당 : this () 메소드를 사용해서 각 필드의 값을 적용
		stuName = "학생이름없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;			
	}
	
	Student(String stuName) {
		this ();
		this.stuName = stuName ;
	}
	
	Student(String stuName , int stuNo) {
		this (stuName);
		this.stuNo = stuNo ;
	}
	
	Student(String stuName , int stuNo , String stuPhone) {
		this (stuName , stuNo);
		this.stuPhone = stuPhone ;
	}
	
	Student(String stuName , int stuNo , String stuPhone , String stuAddr) {
		this (stuName , stuNo, stuPhone);
		this.stuAddr = stuAddr ;
	}
	
	Student(String stuName , int stuNo , String stuPhone , String stuAddr, int stuAge) {
		this (stuName , stuNo, stuPhone , stuAddr);
		this.stuAge = stuAge ;
	}
	
	Student(String stuName , int stuNo , String stuPhone , String stuAddr, int stuAge , double stuWeight) {
		this (stuName , stuNo, stuPhone , stuAddr, stuAge);
		this.stuWeight = stuWeight ;
	}
	
	
	void print() {
		//필드의 내용을 출력
		
		System.out.println("학생 이름은 : " + stuName);
		System.out.println("학번은 : " + stuNo);
		System.out.println("핸드폰 번호는 : " + stuPhone);
		System.out.println("주소는 : " + stuAddr);
		System.out.println("나이는 : " + stuAge);
		System.out.println("몸무게는 : " + stuWeight);
	
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		// 기본 생성자
		System.out.println("============기본값 출력================ ");
		Student stu = new Student();
		stu.print();
		
		//매개변수 1개인 생성자 호출
		System.out.println("============매개변수 1개인 생성자 호출======");
		Student stu1= new Student( "최지윤");
		stu1.print();
		
		//매개변수 2개인 생성자 호출
		System.out.println("============매개변수 2개인 생성자 호출======");
		Student stu2= new Student( "최지윤" , 2013);
		stu2.print();
		
		//매개변수 3개인 생성자 호출
		System.out.println("============매개변수 3개인 생성자 호출======");
		Student stu3= new Student( "최지윤" , 2013 , "010-1234-1234" );
		stu3.print();
		
		//매개변수 4개인 생성자 호출
		System.out.println("============매개변수 4개인 생성자 호출======");
		Student stu4= new Student( "최지윤" , 2013 , "010-1234-1234" , "부천");
		stu4.print();
		
		//매개변수 5개인 생성자 호출
		System.out.println("============매개변수 5개인 생성자 호출======");
		Student stu5= new Student( "최지윤" , 2013 , "010-1234-1234" , "부천", 29 );
		stu5.print();
		
		// 매개변수 6개인 생성자 호출
		System.out.println("============매개변수 6개인 생성자 호출======");
		Student stu6= new Student( "최지윤" , 2013 , "010-1234-1234" , "부천", 29 , 27.0);
		stu6.print();
	}

}
