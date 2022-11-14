package chapter04.ex03;

public class Ex01 {

	public static void main(String[] args) {
		//<문제> : i * j = 1 단출력
				//        1 * 1 = 1
				//        1 * 2 = 2
				//			....
				//		  1 * 9 = 9
				
				
				System.out.println("1단출력");
				for (int i = 1 , j =1 ; j < 10 ; j++ ){
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println("2단 출력" );
				for ( int i =2 , j=1 ; j < 10 ; j ++ ) {
					System.out.println(i + " * " + j + " = " + i * j);
				}

				System.out.println("3단출력");
				for (int i = 3 , j=1 ; j <10 ; j++) {
					System.out.println(i + "*" + j + " = " + i * j);
				}
				
	}

}
