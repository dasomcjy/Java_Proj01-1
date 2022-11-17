package chapter05.ex06;

import java.util.Arrays;

public class Ex03_01 {

	public static void main(String[] args) {
	
		// 1. 배열의 선언
		int[][] arr1 = new int[5][100]; 	//5 : 행의 갯수 ,  //100 : 열의 갯수
		int[][] arr2 = new int[5][100];
		System.out.println(arr1.length);	//5 , arr1.length : 행의 갯수
		System.out.println(arr1[0].length); //100, arr1[0].length : 0행의 열의 갯수
		
		int a = 0 ;  //바깥쪽에서 값을 정의하면 101~ 201~ 이렇게 그 다음 부터 순차적으로 출력
						// 바깥쪽어 인수 선언을 하면 for 안에서 반복되는 것이 아니므로 그 다음 값이 순환 한 이후 값으로 설정되는 것!
						// 궁금해서 arr2 만들어서 이어서 출력해보았는데 그 이후로 진행된다! 신기~
		
		// 2. 2차원 배열의 값넣기 : 이중 for ( for - for )을 사용해서 값을 넣기
		// 행을 정의 : i <== 행의 방번호(index), arr1.length <== 행의 갯수
		for (int i = 0 ; i < arr1.length ; i++) {
			//열을 정의 ; j <== 열의 방번호 , arr1[i].length <== i행의 열의 갯수
			for ( int j = 0 ; j < arr1[i].length ; j++ , a++) {
				arr1[i][j] = a + 1;
			}
		}
		
		for (int i = 0 ; i < arr2.length ; i++) {
			//열을 정의 ; j <== 열의 방번호 , arr1[i].length <== i행의 열의 갯수
			for ( int j = 0 ; j < arr2[i].length ; j++ , a++) {
				arr2[i][j] = a + 1;
			}
		}
		
		
		//3. 배열의 값을 출력 하기 ( for - for )
		for (int i = 0 ; i < arr1.length; i++) { // 행을 루프
			for (int j = 0 ; j < arr1[i].length ; j++) {
				System.out.print( arr1[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0 ; i < arr2.length; i++) { // 행을 루프
			for (int j = 0 ; j < arr2[i].length ; j++) {
				System.out.print( arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==============Enhanced for 문으로 출력 =================");
		
		//4. Enhanced for 문을 사용해서 값 출력
		for ( int[] k : arr1) { 	//arr1 의 루프를 돌면서 행을 꺼내와서 k변수에 할당
			for ( int b : k) {		//일차원 배열의 각방의 값을 끄집어 와서 b변수에 담는다.
				System.out.print( b + " " );				 
			}
			System.out.println();
		}
		
		System.out.println("=====Arryas.toString() 로 출력");
		//5. Arrays.toString() < == 1차원 배열의 값을 출력
			// arr1 : 2차원 배열
		for ( int[] k : arr1) {
			System.out.println(Arrays.toString(k)); 
			
		}
		
		
		}
	}
