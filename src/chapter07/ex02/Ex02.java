package chapter07.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 
		
		// 두 배열의 각 방의 내용을 더해서 출력하는 메소드 생성
		
		// 배열 a : 4의 배수를 1 ~ 300까지 
		// 배열 b : 5의 배수를 1 ~ 300까지
		
		// 두 배열의 각 방의 값을 더해서 출력
		
		int[] a = new int [300/4];
		for (int i = 0, j = 4 ; i < a.length; i++, j+=4) {	
			a[i] = j;
		}
		
		// 4의 배수 출력
		System.out.println("===== 4의 배수 출력=====");
		System.out.println(a.length);
		for (int i = 0 ; i < a.length; i++) {
			System.out.print( a[i] + " ");			
		}
		System.out.println();
	
	
		
		int[] b = new int [300/5];
		for (int i = 0, j = 5 ; i < b.length; i++, j+=5) {	// i : 방번호, j : 3의 배수 저장
			b[i] = j;
		}
		
		// 5의 배수 출력
		System.out.println("===== 5의 배수 출력=====");
		System.out.println(b.length);
		for (int i = 0 ; i < b.length; i++) {
			System.out.print( b[i] + " ");
		
		}
		System.out.println();
		System.out.println("=== 두개의 배열을 인풋 받아서 각 방의 값을 더해서 출력====");
		arraySum (a , b);

		//두개의 배열을 인풋 받아서 각 방의 값을 더해서 출력
	// addArray(int[] a, int [] b) {
		
	//} //남는건 0으로 처리!
	}
		
	/*
		public static void addArray (int[] a, int[] b) {
    	for ( int i = 0 ; i < a.length ; i++) {  	
    		if( b.length < a.length) {
    			a[i] = 0;
    		}
   			System.out.print(a[i] + b[i]+ "  ");
			
		}
			System.out.println();
		*/
	public static void arraySum (int[] a, int [] b) {
		int[] c = new int [75];				//c: 두 배열을 인풋받고 같은 방번호일때 값을 더해서 넣는
		for (int i = 0 ; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if ( i > 59 ) {
					c[i] = a[i] + 0;
				}
				if(i == j) {
					c[i] = a[i] + b[j];
 				}
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
	

}
		


