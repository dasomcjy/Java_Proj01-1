package chapter14.ex07;

class BalanceException extends Exception{
	public BalanceException() {
		super();
	}
	public BalanceException(String message) {
		super(message);
	}
}


public class Account {

	private long balance = 1000;		// 예금의 잔고 1000
	public Account () {} // 기본 생성자
	
	public long getBalance () {		//getter : 호출시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	
	// 예금 : 
	public void deposit(int money) throws BalanceException  { 	// 기존의 잔고에서 money를 인풋받아서 더해서 다시 필드에 적용
		balance += money;
		if ( money < balance ) {
			throw new BalanceException("잔고가 부족합니다.");
		}else {
			System.out.println(balance);
		}

	}

	
	// 예외처리 
	// 출금 : 
	public void withdrow(int money) throws BalanceException {
			balance -= money;
			if ( money < balance ) {
				throw new BalanceException("잔고가 부족합니다.");
			}else {
				System.out.println(balance);
			}
		}

		//잔고가 money 보다 작은 경우 잔고부족이라고 강제로 예외를 발생 시켜서 처리 
			//예외 메세지 : "잔고가 부족합니다." 라고 출력을 해주면 됨
			//BalanceException <== 사용자 정의 예외를 생성해서 
		
	

public static void main(String[] args) {
	// TODO Auto-generated method stub

//	deposit a1 = new deposit();
	
	
//	try {
//		a1.long balance(10);
//	} catch (BalanceException e) {
		
//		System.out.println(e.getMessage());
	}
	
	
}
		

	
	
	

