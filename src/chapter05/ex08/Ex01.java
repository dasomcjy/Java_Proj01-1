package chapter05.ex08;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		//		args : 합계 40 77 99 100 200 
		
		// 합계  : <정수를 더한 값을 출력
		
		System.out.println("======For 문을 사용해서 출력 ======");
		for ( int i = 0 ; i < args.length ; i++) {
			System.out.print( args [i] + "  " );
		}
		
		System.out.println();
		
		String y = args[0];
		String a = args[1];
		String b = args[2];
		String c = args[3];
		String d = args[4];
		String e = args[5];
		
		System.out.println(a + b + c + d + e);
		
		
		int f = Integer.parseInt(a); 		// String 타입의 숫자를 정수로 변환
		int g = Integer.parseInt(b); 		
		int h = Integer.parseInt(c);
		int j = Integer.parseInt(d);
		int k = Integer.parseInt(e);
		
	
		System.out.println( y + " : " + ( f + g + h + j + k) );
		
		System.out.println("==========================================");
		
		System.out.println("합계" + 1 + 2 + 3);	// 합계123
		System.out.println(1 + 2 + 3 + "합계");	// 6합계
		
		
	}
		

		}
	


