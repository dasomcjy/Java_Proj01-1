package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제1> swithch 문을 사용하여 프로그램 하세요
		// 스캐너 정수 1을 인풋받으면 "금메달입니다"출력
		//			2를 인풋받으면 "은메달입니다"출력
		//			3을 인풋받으면 "동메달입니다"출력
		//			  그외 값을 인풋 받으면 "메달이 없습니다"츨력
		// <문제2> Switch 문을 사용하여 프로그램하세요
		// 스캐너로 문자열 gold 를 인풋 받으면 "금메달입니다"출력
		// 스캐너로 문자열 silver을 인풋 받으면 "은메달입니다"출력
		// 스캐너로 문자열 bronze 를 인풋 받으면 "동메달입니다"출력
		
		
		
		int medal ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 >>");
		medal = sc.nextInt();
		
		
		switch (medal) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default : 						
			System.out.println("메달이 없습니다.");
			break;
		
		}
			
			String medal3;
			
			System.out.println("gold silver bronze 중 하나를 입력해주세요 >>");
			medal3 = sc.next();
			
			
			switch (medal3) {
			case "gold": case "Gold" : case "GOLD" :
				System.out.println("금메달입니다.");
				break;
			case "silver": case "Silver" : case "SILVER" :
				System.out.println("은메달입니다.");
				break;
			case "bronze" : case "Bronze" : case "BRONZE" :
				System.out.println("동메달입니다.");
				break;
			default : 						
				System.out.println("메달이 없습니다.");
				break;  // 마지막 줄은 break를 안넣어주어도된다.
			}
	
				sc.close();	
		}
 	 
	
}
