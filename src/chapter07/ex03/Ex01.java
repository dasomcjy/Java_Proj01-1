package chapter07.ex03;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 가변길이 배열문제
		/*
		   		values[0]	: 값이 정수 1 ~ 9 이 들어올때 "파워레벨 [1] ~ [9]입니다."
		   		values[1]	: 값이 정수 1 ~ 9이 들어올때 "스피드 레벨 [1] ~[9] 입니다."
		   		
		 */

		int[] a = new int [10];
		for (int i = 0, j = 1 ; i < a.length; i++, j+=1) {	
			a[i] = j;
		}
		for (int i = 0 ; i < a.length; i++) {
			System.out.print( "파워레벨" + a[i] + "입니다");
		}
		System.out.println();
		
		int[] b = new int [10];
		for (int i = 0, j = 1 ; i < a.length; i++, j+=1) {	
			b[i] = j;
		}
		for (int i = 0 ; i < b.length; i++) {
			System.out.print( "스피드레벨" + b[i] + "입니다"); 
		}
		
		arrayFlexible (3, 5);
		

	}
	
	
	
	public static void arrayFlexible (int...values) {
		for (int i = 0 ; i < values.length; i++) {
			System.out.print( values[i] + "  ");
		}
		System.out.println();
	
	/*	public static void arrayFlexible (int...values) {
			for (int i = 0; i < a.length; i++) {			
				a[i] = i + 1;
			}
			for (int i = 0 ; i < a.length; i++) {
				System.out.print( "파워레벨" + a[i] + "입니다.");
			}
			
		
			for (int i = 0; i < b.length; i++) {			
					b[i] = i + 1;
			}
			for (int i = 0 ; i < b.length; i++) {
				System.out.print( "스피드레벨" + b[i] + "입니다.");
			}
		}	
	*/
}
}