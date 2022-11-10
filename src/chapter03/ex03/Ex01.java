package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// < 실습 문제>  <완료시간 : 6ㅣ10분, p.jangwoo@gmail.com Ex01.java>
		// 정수 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 출력 다르면 false 출력
		// 이름 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 출력 다르면 false를 출력
		        // 등가연산자 사용. 
		
		
		// 기본자료형 : ==
		
		
		int a ;
		int b ;
		
		// 참조자료형 : aName.equals(bName)
		
		String aName;
		String bName;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1을 입력하세요 >>>");
		a = sc.nextInt();
		System.out.println("숫자2를 입력하세요 >>>");
		b = sc.nextInt();
		System.out.println("이름 1을 입력하세요 >>>");
		aName = sc.next();
		System.out.println("이름 2를 입력하세요 >>>");
		bName = sc.next();
		
		System.out.println("숫자 두 개의 값은 같다 " + (a == b));
		System.out.println("두 개의 이름은 같다 " + (aName.equals(bName)));
		
		
		/*
		System.out.println("정수 2개, 이름 2개를 공백으로 구분해서 넣어주세요 >>>");
		a = sc.nextInt() ;
		b = sc. nextInt();
		aName = sc.next();
		bName = sc.next();

		//기본 자료형 값비교 : ==    (Stack 영역의 값비교)
		// 두 정수의 값을 비교해서 맞으면 true, 아니면 false
		System.out.println(" 두 값이 같으면 true, 다르면 false : " + (a ==b));

		//참조 자료형의 값비교 : aName.equals(bName) (Heap 영역의 값비교)
		System.out.println("두 이름이 같으면 true, 다르면 false : " + aName.equals(bName));
		
		*/
	
	}

}
