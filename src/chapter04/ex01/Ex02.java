package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {
 
	public static void main(String[] args) {
		// <<스캐너에서 번호를 입력 받아서 아래 내용을 작동시키는 프로그램을 작성해주세요>>
		// IF 문을 사용
		
		Scanner sc = new Scanner(System.in);
		
		
		int select ;	//프로그램을 선택
		
		int kor ;
		int eng ;
		int math;
		
		int a ;
		
		String aName;
		String bName;
		
		
		System.out.println("===========================================");
		System.out.println("1. 학점의 합계/평균 | 2.홀수/짝수 | 3.같은 이름식별");
		System.out.println("===========================================");
		System.out.println("위의 번호를 선택 하세요. >>> ");
		select = sc.nextInt();
		
		if ( select == 1 ) {
			System.out.println("국어점수를 입력 하세요 >>>");
			kor = sc.nextInt();								
			System.out.println("영어점수를 입력 하세요 >>>");
			eng = sc.nextInt();
			System.out.println("수학점수를 입력 하세요 >>>");
			math = sc.nextInt();
			
			int sum ; 			//합계
			sum = kor + eng + math;
		
			double avg;			//평균
			avg = sum / 3.0;
			
			System.out.println("점수의 합계는 " + sum + "이고");
			System.out.println("평균은 " + avg + "입니다. ");
			
		}else if (select == 2) {
			System.out.println("숫자를 입력하세요 >>");
			a = sc.nextInt();
			
			System.out.println((a%2 == 0) ? "짝수입니다." : "홀수입니다.");
					
		}else if (select == 3) {
			System.out.println("이름 1 을 입력하세요 >>");
			aName = sc.next();
			System.out.println("이름 2 를 입력하세요 >>");
			bName = sc.next();
			
			System.out.println(aName.equals(bName) ? "두 이름이 같습니다." : "두 이름이 다릅니다.");
		}
		else {
			System.out.println("정확한 숫자가 아닙니다. 1,2,3 중 하나를 적어주세요");
		}
		

	}

}
