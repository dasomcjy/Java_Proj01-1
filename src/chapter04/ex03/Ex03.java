package chapter04.ex03;

public class Ex03 {

	public static void main(String[] args) {
		// <문제> : 2중 For 문을 사용해서 1단 ~ 9단 출력 print \t
		//  1단 
		//	1 * 1 = 1 	1 * 2 = 2 	1 * 3 = 3 .... 1 * 9 = 9
		//	2단
		//	2 * 1 = 2 	2 * 2 = 4 	2 * 3 = 6 .... 2 * 9 = 18
		//  ...
		//  9단
		
		// print ()  \t 탭으로 구분

		for (int i =1 ; i < 10 ; i++) {			
			System.out.print("\t" + "\n" + i + "단 출력" + "\n");
			for (int j = 1 ; j <10 ; j++ ) {
				System.out.print("\t" + i + " * " + j + " = " + i * j);
			
			 }
			}
		//선생님풀이 >> println();으로 엔터 효과 !
		System.out.println("===============print()");
			System.out.println();
		for (int i = 1 ; i < 10 ; i++) {
			//단을 출력 하는 변수 : i
			System.out.println(i + "단 출력");
			for (int j = 1 ; j < 10 ; j ++) {
				System.out.print( i + " * " + j + " = " + i * j + "\t");
				
			}
			System.out.println();
			System.out.println("\n"); //엔터 두번의 효과!
		}
		//printf() 를 사용해서 출력 부분을 간결하게 처리
		System.out.println("=========printf()==================");
		
		for (int i = 1 ; i < 10 ; i++) {
			//단을 출력 하는 변수 : i
			System.out.println(i + "단 출력");
			for (int j = 1 ; j < 10 ; j ++) {
				System.out.printf("%d * %d = %d \t" , i , j , i*j);
			}
			System.out.println();
			System.out.println("\n");
		}
 }
}