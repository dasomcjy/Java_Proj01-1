package chapter07.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 매개 변수로 배열을 Argument로 인풋
			//완료시간 1시 20분까지
		
		// 1 ~ 100 까지 3의 배수의 배열을 생성후 메소드 호출, 정수 : 5 호출	
		int [] a = new int [100];
		for (int i = 0, j=3 ; i<100 ; i++, j+=3) {
			a[i] = j ;

			printArray(a);
		}
		
		// 1 ~ 100 까지 7의 배수 배열을 생성후, 정수 : 2
		int [] b = new int [100];
		for (int i = 0, j = 3 ; i <100 ; i ++, j+=7 ) {
			b[i] = j;
		}
		
	}
	
	public static void printArray (int[] a) {		
		for (int i = 0; i < a.length ; i++) {
			System.out.print(a[i] + " ");
			
	//메소드 : static , 매개변수로 정수 1, 배열 1개를 인풋 받아서 
	// 각 방의 배열의 값을 인풋받은 정수로 곱새허 출력하는 배열
	
	
}
}
}
