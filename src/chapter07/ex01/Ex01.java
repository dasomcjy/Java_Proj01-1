package chapter07.ex01;


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	//정수값 3개를 인풋 받아 더한 값을 정수로 리턴하는 메소드 (static)
	int abc = sum (4, 5, 6);
	System.out.println(abc);
	
	//실수 3개를 인풋 받아 더한 값을 실수로 리턴하는 메소드(static)
	
	double def = sum (5.5 , 6.6, 7.7);
	System.out.println(def);
	
	//문자열을 연결해서 출력하는 메소드 (인스턴스 메소드 : static을 사용하지 않는 메소드)
		//"제품이름" , "제품 수량", "제품가격"
		// 객체를 생성해서 
	
	
	
}

	class Pro { 
		String prName;  //제품이름
		String prCount; //제품수량
		String prPrice; //제품가격
		
		Pro( String prName, String prCount , String prPrice ){
			this.prName = prName; 
			this.prCount = prCount;
			this.prPrice = prPrice;
		}
		void print() {
				System.out.println("제품이름 : " + prName);
				System.out.println("제품수량 " + prCount);
				System.out.println("제품가격 : " + prPrice);
						
		}
	}
public static int sum (int a, int b , int c) {
		
	return a + b + c;
	
}

public static double sum (double d, double e , double f) {
	
	return d + e + f;
	
}

   Pro p = new Pro("즉석밥" , "200" , "2000");
   
}