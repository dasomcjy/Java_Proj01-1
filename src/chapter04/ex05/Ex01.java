package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> do while 문으로 무한 루프를 돌립니다.
		// 스캐너에서 1을 넣으면 " 1. 평균 출력" 으로 출력
		// 스캐너에서 2을 넣으면 " 2. 합계 출력" 으로 출력
		// 스캐너에서 3을 넣으면 " 3. 이름 출력" 으로 출력
		// 4번을 누르면 do while 문을 빠져나옴 " 프로그램 종료 "
		// 1~4 이외의 번호를 넣으면 "잘못된 입력 입니다.1~4번까지만 넣어주세요"
		

		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do {
		
			System.out.println("========================================================");
			System.out.println("1. 평균출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("========================================================");
			System.out.println(" 위 번호를 선택하세요>>>");
			a = sc.nextInt();
			
			if ( a ==1 ) {
				System.out.println(" 1. 평균 출력");
			}else if ( a ==2 ) {
				System.out.println(" 2. 합계 출력");
			}else if ( a ==3 ) {
				System.out.println(" 3. 이름 출력");
			}else if ( a == 4) {
				System.out.println(" 4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력 입니다.1~4번까지만 넣어주세요");
			}
		
		} while (true) ;
		 System.out.println("do while 문을 빠져나왔습니다");
		
		/*
		int num;	

		do {	
			
			System.out.println(" 위 번호를 선택하세요 >>> ");
			num = sc.nextInt();
		
		if( num == 1) {
			System.out.println( "1. 평균 출력");
		}else if ( num == 2) {
			System.out.println( "2. 합계 출력");
		}else if ( num == 3) {
			System.out.println( "3. 이름 출력");	
		}}while(num < 4 ); 
			System.out.println("4. 프로그램 종료");
			
   }
   이거는 잘못된 입력입니다 ~ 를 해결 못함 ㅇㅅㅠ while 문을 빠져나오는 것은 break 이고
   while (true)를 사용한다면 조건이 계속 true라면 계속 무한 루프로 실행이 됨!!
   
         */
	
		
		}
	}



