package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// try ~ catch ~ finally 구문을 사용해서 예외처리 
		
		int[] arr = new int[] {1,2,3,4} ;
		
		//실행시 예외 발생 : ArrayIndexOutOfBoundsException
				
		try {
		System.out.println(arr[5]);
		System.out.println(" try 블락에 생성된 구문 ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// try 블락에서 ArrayIndexOutOfBoundsException 발생이 되면 작동
			System.out.println(" catch 블락 작동됨 ");
		}
		finally {
			//무조건 작동되는 블락
	    System.out.println(" finally 블락 : 예외와 상관없이 항상 작동됨 ");
		}
		
		System.out.println(" 프로그램 종료 ");
	}

}
