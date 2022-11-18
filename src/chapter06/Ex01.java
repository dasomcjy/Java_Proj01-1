package chapter06;

class Man {
	//필드
	String name = "홍길동" ; 
	int age = 30 ;
	String phone = "010-1111-1234" ;
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	
	//기본 생성자는 생략됨 : A () {}
	
	//메소드 : 
	void add1 () {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한 값을 출력
		int[] arr1 = new int [1000];
		int i ;
		int sum = 0;
	//	for ( i = 2;  i =< 100 ; j+=2) {
		
		}
		//for ( i = 0, j=2 ; i<50 ; i++, j+=2) {
		//System.out.print(arr1[i] + " ");
		

	
		
		
		
	
	
	void add2 () {
		// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값출력
	
		
	}
	
	void add3 () {
		// 1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력
		
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성 및 객체의 필드의 값이나 메소드 호출
		
		Man a = new Man();
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.phone);
		System.out.println(a.addr);
		System.out.println(a.weight);
	
	}

}
