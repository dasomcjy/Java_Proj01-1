package chapter05.ex08;

public class Ex01_01 {

	public static void main(String[] args) {
		// <문제>
				//		args : 합계 40 77 99 100 200 
				
				// 합계  : <정수를 더한 값을 출력

		String s = args[0];
		int sum = 0 ;
		for ( int i = 1 ; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
					}
		System.out.print(s + " : ");
		System.out.println(sum);
	}

}
