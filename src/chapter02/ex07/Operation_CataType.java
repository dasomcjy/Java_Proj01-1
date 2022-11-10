package chapter02.ex07;

import javax.annotation.processing.SupportedSourceVersion;

public class Operation_CataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		
		int value1 = 3+5 ;  //8
		int value2 = 8/5 ;  //1
		
		System.out.println(value1);
		System.out.println(value2);
		
		
		float data1 = 3.0f + 5.0f ;
		System.out.println(data1);   //8.0
		
		double data2 = 8.0/5.0;
		System.out.println(data2);   //1.6
		
		double data3 = 8/5 ;		// int/int = int (1)인데 double로 업캐스팅이 되어서 1.0으로 표시됨
		System.out.println(data3);   //1.0
		
		double data4 = 8/5.0 ;    //정수 8이 double 형으로 자동 팅이 일어나서 연산 (하나는 더블로 놔두어야함!)
		System.out.println(data4);     //1.6
		
		//주의 : 평균을 계산 할 때 double
		
		
		System.out.println("============================");
	
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		//int data5 =  5 + 3.5;     //오류 발생
				//int data5 = (int) 5 + (int) 3.5; <<일케 해야 오류발생 x
		
		double data6 = 5 + 3.5 ;   // 5.0 + 3.5 
		
		int data7 = 5 + (int) 3.5;  // 8
		
		int data8 = (int) (5 + 3.5); // 8
		
		double data9 = 5/2.0 ; // 정수 5가 더블로 업캐스팅 되어서 연산
		
		System.out.println(data9);     //2.5
		
		double data10 = 5/2;
		
		System.out.println(data10);     //2.0
		
		System.out.println("===============================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11 + data12);  //50 ==> double
		//업캐스팅 : data11 (int) ==> data11(double)
		System.out.println(data11 / data12);  //
		//다운캐스팅 : data12 (double) ==> data12(int)
	    System.out.println(data11 / (int)data12);
		
		
		// <문제>
	    // 국어 : 90, 수학 : 88, 영어 : 77, 음악 : 90, 과학 : 99
	    // 각 과목의 점수를 int의 변수를 만들어서 저장후 : 합계(sum), 평균(avg) 값을 출력
	    
	    int 국어 = 90;
	    int 수학 = 88;
	    int 영어 = 77;
	    int 음악 = 90;
	    int 과학 = 99;
	    
	    System.out.println( 국어 + 수학 + 영어 + 음악 + 과학);
	    System.out.println( 444 / 5.0);
	    System.out.println((double)(국어 + 수학 + 영어 + 음악 + 과학) / (double)5);
	    System.out.println((double)(국어 + 수학 + 영어 + 음악 + 과학) / 5);
	    System.out.println((국어 + 수학 + 영어 + 음악 + 과학) / 5.0); //만약 여기서 그냥 5를 넣으면 안댐!
	    
	    int kor = 90;
	    int math = 88;
	    int eng = 77;
	    int music = 90;
	    int science = 99;
	    
	    int sum = kor + math + eng + music + science;
        double avg = sum / 5.0;  //여기서 그냥 5를 넣으면 안됨
        
        System.out.println("합계는 : " + sum);
        System.out.println("평균은 : " + avg);

        
	    
	    
	    
	  
	
		

	}

}
