package chapter05.ex09;

public class Ex01_01 {

	public static void main(String[] args) {
		/* <완료시간 6:00e>
		 국어 영어 수학 과학       국어 영어 수학 과학 	   국어 영어 수학 과학     국어 영어 수학 과학
홍길동	 70   88  77  99  이순신 80  68  87  79 김똘똘 60 86  87  30 홍길순 77  56  80  99
		 
		 메인 메소드 args로 아래와 같은 값이 인풋되었을 경우 <출력>과 같이 출력해 보세요
		 args :홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		        0    1  2  3  4   5   6  7  8   9  10   11 12 13 14 15   16 17 18 19
		      
		 <for 문을 사용해서 출력하세요>
		 <<변수 이름이랑 주석을 잘 다는 것이 필요하다...>>
		 <출력>
		 
		 국어    영어    수학    과학     <합계>  <평균>
		 ================================================
	홍길동 70   88  77  99	 
	이순신 80  68  87  79	 
	김똘똘 70 86  87  30
	홍길순 77  56  80  99
	======================================================
	<합계>
	<평균>
		 */
		
		
			System.out.println("===STEP 1 : args 배열로 들어오는 모든 내용 출력 ====");
			for (int i = 0 ; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}
			System.out.println();
			System.out.println();
			
			//step 2
			System.out.println("====STEP 2 : 기본 출력 =================");
			System.out.println();
			
			System.out.println("       국어     영어     수학     과학    <합계>     <평균>    ");
			System.out.println("========================================================");
			for (int i = 0 ; i < args.length; i++) {
				
				if(i % 5 == 0) {//5로 나누었을 때 0일때 개행, 0일때는 제외
					if(i != 0) {
						System.out.println();
					}
				}
			System.out.print(args[i] + "\t");	
			//System.out.println(sum1 + "t\");
			}
			System.out.println();
			System.out.println("========================================================");
			System.out.println("<합계> : ");
			System.out.println("<평균> : ");
			
			System.out.println();
			System.out.println();
			
			//step 3
			System.out.println("======STEP 3 : 합계 / 평균 계산후 출력 =====================");
			System.out.println();
			
			int sum1 = 0 ;
			double avg1 = 1.0;
			
			//아랫 라인의 합계 및 평균 변수 선언
			int korSum = 0 ;
			int engSum = 0 ;
			int mathSum = 0 ;
			int sienceSum = 0 ;
			
			double korAvg = 1.0;
			double engAvg = 1.0 ;
			double mathgAvg = 1.0 ;
			double sienceAvg = 1.0 ;
			
			//allSum, allAvg
			int allSum = 0;
			double allAvg ;
			
			System.out.println("       국어     영어     수학     과학    <합계>     <평균>    ");
			System.out.println("========================================================");
			for (int i = 0 ; i < args.length; i++) {
				
				if(i % 5 == 0) {//5로 나누었을 때 0일때 개행, 0일때는 제외
					if(i != 0) {
						System.out.println();
					}
				}
				
				//sum1, avg1
				if (i % 5 == 0) {//5로 나누었을 때 0일때 개행, 0일때는 제외
					if(i != 0) {
						System.out.println();
					}
				}
				
				//sum1, avg1
				if (i % 5 == 0) {
					sum1 += Integer.parseInt(args[i]);
				}
				//avg1 : 합이 모두 구해지면 평균 계산
				if(i == 4 || i == 9 || i == 14 || i == 19) {
					avg1 = sum1/4.0;
				}
				
				//출력
				
				
				
			System.out.print(args[i] + "\t");	
			//System.out.println(sum1 + "t\");
			}
			System.out.println();
			System.out.println("========================================================");
			
					
			
	}

}
