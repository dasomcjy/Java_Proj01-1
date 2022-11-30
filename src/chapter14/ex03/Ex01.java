package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3개의 예외를 하나의 try ~ catch 블락에 넣고 ,
				// 각각 예외에 대해서 catch 블락
				// 3개의 예외를 한꺼번에 처리 
		
		// 3개의 예외를 하나의 try ~ catch 블락에 넣고 , 각각 예외에 대해서 catch 블락
		
		try {
		System.out.println( 3/0 );
		
		int [] arr = new int[] {1,2,3} ;
		System.out.println(arr [5]);
		
		int num = Integer.parseInt("20A");
		
		}catch (ArithmeticException e) {
		 System.out.println(" 0으로는 나눌 수 없습니다. ");
		}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(" 배열 방갯수 초과 ");
		}
		catch (NumberFormatException e) {
			System.out.println(" 숫자로 변환이 불가합니다.");
		}finally {
			System.out.println(" 세번째 프로그램 종료 ");
		}
		
		System.out.println("=============================");
		
		try {
		System.out.println( 3/0 );
			
		int [] arr = new int[] {1,2,3} ;
		System.out.println(arr [5]);
			
		int num = Integer.parseInt("20A");
			
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException |NumberFormatException e) {
			 System.out.println(" 세개의 예외가 한꺼번에 발생되었습니다 ");
		}finally {
			 System.out.println(" 세번째 프로그램 종료 ");
		}

    }
	
}
