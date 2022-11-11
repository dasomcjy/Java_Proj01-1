package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//<문제> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수값이 홀수이면 "홀수"라고 출력하고 
			//인풋 받은 정수값이 짝수이면 "짝수"라고 출력
			//<삼항 연산자를 사용>
		
		Scanner sc = new Scanner(System.in);
		
		int num1 ;
		
		System.out.println( "정수를 입력하세요 >>>");
		num1 = sc.nextInt();
		
		    
		    System.out.println((num1 % 2 == 0) ? "짝수" : "홀수");
		
		    
		    
	}

}
