package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 배열 변수 : arr1 , 배열의 방의 갯수 : 500 개
		// 배열방에 3의 배수 와 5의 배수를 저장 
		// 출력 : 1. for , 2 . Enhanced For, 3. Arrays.toString()를 사용해서 출력
		
		/*int[] arr1 = new int [500];
	
		for (int i = 0 ; i < 500 ; i++)
			arr1[i] = (i+1)*3;{
			
			}

		for (int i = 0 , j = 1 ; i < 500 ; i++ , j ++) {
				if((i%3 == 0) || (j%5 == 0)) {
					arr1[i] = j ; 
				}	
		
			}
						
		System.out.println("===for====");
		for (i = 0 ; i < 500 ; i++) {
			System.out.println(arr1[i] + " ");
		}
			
		System.out.println("====Enhanced For ====");
		for (int A : arr1) {
			System.out.println( A + " ");
		}
		
		System.out.println("====Arrays.toString()====");
		System.out.println(Arrays.toString(arr1));
	}*/
	
	/*
		int i = 0;
	int [] arr1 = new int [500];
	
	for ( int a = 1 ; a < 3000 ; a++) {      // a : 3의 배수, 5의 배수를 저장하는 변수
		if ( a % 3 == 0 || a % 5 == 0) {
			arr1[i] = a;
			i++;
		}
		
		if ( i > 499 ) {
			break;
		}
		}
		
		System.out.println("===for====");
		for (int i = 0 ; i < 500 ; i++) {
			System.out.println(arr1[i] + " ");
		}
			
		System.out.println("====Enhanced For ====");
		for (int A : arr1) {
			System.out.printf( "%d" + " ");
		}
		
		System.out.println("====Arrays.toString()====");
		System.out.println(Arrays.toString(arr1));
	}
	
}	*/
}	}

