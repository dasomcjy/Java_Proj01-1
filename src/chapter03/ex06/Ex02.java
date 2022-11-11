package chapter03.ex06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 스캐너로 3,6,9 의 배수이면 "3,6,9의 배수입니다"
			//그렇지 않으면 "3,6,9 의 배수가 아닙니다" 를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println( "정수를 입력하세요 >>>");
		num = sc.nextInt();
		
		System.out.println(((num%3)==0 || (num%6) == 0 || (num%9) ==0 ) ? "3,6,9의 배수입니다" : "3,6,9 의 배수가 아닙니다" );
		
		
	}

}
