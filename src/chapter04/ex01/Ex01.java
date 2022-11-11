package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// IF 문을 사용해서
		// 스캐너를 사용해서 가지고 있는 돈을 입금받습니다.
		// 0 ~ 3000        : 걸어서 다닙니다.
		// 3000 ~ 30000    : 지하철을 타고 다닙니다.
		// 30000 ~ 100000  : 택시를 타고 다닙니다.
		// 100000 ~        :  비행기를 타고 다닙니다.
		
		
		int money;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("지금 가지고 있는 돈을 입력하세요 >>>");
		money = sc.nextInt();
		
		if (money >= 0 && money<3000) {
			System.out.println("걸어서다닙니다.");
		}else if (money >=3000 && money < 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		}else if (money >=30000 && money < 100000) {
			System.out.println("택시를 타고 다닙니다.");
		}else {
			System.out.println("비행기를 타고 다닙니다.");
			
			
			//if (money >=100000){
			//system.out.println("비행기를 타고 다닙니다");
		    //else {
			//System.out.println("정확한 돈의 액수가 아닙니다 0이상의 정수로 넣어주세요");
			// 과제 제출은 이렇게 보냈는데.. 생각해보니 그 밖의 금액은 다 위의 코드처럼 비행기를 타고 다닙니다..이지 않을까??
            // 출력도 그렇게 나옴. 
		}
	  }
	}

