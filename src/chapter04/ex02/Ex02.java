package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 스케너로 1월 ~ 12월까지 월을 인풋 받아서 해당월의 일수를 출력해주면 됩니다.
		// 출력 : 1 월은 31일입니다. 
		//       2 월은 28일입니다. 스위치모드로 작성
		// 3 4 5 6 7 8 9 10 11 12   31:(1,3,5,7,8,10,12)   30:(4,6,9,11)
		//        month 월은 day 일입니다.
	
		Scanner sc = new Scanner(System.in);
		
		int month ;
		int day = 30 ;

		System.out.println("1월부터 12월까지 중에 하나를 선택하여 숫자만 입력해주세요>>");
		month = sc.nextInt();
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8: case 10: case 12:
			System.out.println( month + "월은" + (day+1) +"일 입니다.");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println( month + "월은" + day + "일 입니다.");
			break;
		case 2 :
			System.out.println( month + "월은" + (day-2) + "일 입니다.");
			break;
		default : 						
			System.out.println("잘못입력하셨습니다. 1부터 12 증에서 입력해주세요");
			break;
		
		}
	   /*
	    * 선생님 풀이.. 확인해보기
	    *  scanner sc = new scanner (system.in);
		int month ;
		int day = 30;
		system.out.println("월을 입력해 주세요 >>>");
		month = sc.nextInt();
		
		switch (month) {
		case : 1, 3, 5, 7, 8, 10, 12 :
		day += 1;
		break;
		case : 2:
		day -= 2;
		break;
		default :
		//case 4,6,9,11 :
		 
	  }
		
           
           system.out.println(month + "월은" +day + "일 입니다.");
          
           */
	}
}
