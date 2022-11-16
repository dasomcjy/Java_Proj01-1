package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제>
		/*
		  	2차원 배열 변수 : arr1
		  	arr1[0]		<< 2의 배수만 저장
		  	arr1[1]		<< 5의 배수만 저장
		  	arr1[2]		<< 3의 배수와 8배수를 저장
		  	arr1[3]		<< 1부터 시작해서 1씩 증가하는데 7의 배수는 저장하지 않도록
		  	
		  	행의 갯수 : 4
		  	열의 갯수 : 100
		  	
		  	1. for 문으로 출력, 2. Enhanced For, 3. arrays.toString()		  	
		  
		 */

		
		int [][] arr1 = new int [4][100] ; 
		int i;
		int j;
		int y;
		System.out.println("======arr1[0] 2의 배수만 저장 =====");
		for ( i = 0 ; i < 1 ; i++) {		
			for (  j = 0 , y = 2 ; j < arr1[i].length ; j++ , y+=2)
				if (y % 2 == 0) {
					arr1[i][j] = y;					
			System.out.print( arr1[i][j] + " ");
				}		
			System.out.println();
		System.out.println(" =====arr1 [1] 5의 배수만 저장========");
		for (i = 1 ;  i < 2 ; i++) {
			for (j = 0 , y =1 ; j < arr1[i].length ; j++, y++)
				if (y % 5 == 0) {
					arr1[i][j] = y;
			System.out.print( arr1[i][j] + " ");		
				}
			System.out.println();
		System.out.println("=====arr1 [2] 3의 배수와 8의 배수 저장====");	
		for (i = 2 ; i <3 ; i ++) {
			for(j = 0 , y = 1 ; j < arr1[i].length ; j++, y++)
				if (y % 3 == 0 || y % 8 == 0) {
					arr1[i][j] = y;
			System.out.print(arr1[i][j] + " ");			
				}
			System.out.println();
		System.out.println("=====arr1 [3] 1부터 시작해서 1씩 증가하는데 7의 배수는 저장하지 않도록====");	
			for (i = 3; i < 4 ; i ++) {
			for(j = 0 , y = 1 ; j < arr1[i].length ; j++, y++)
				if (y % 7 != 0) {
					arr1[i][j] = y;
			System.out.print(arr1[i][j] + " ");		
				}
				}
			for (int[] arr2 : arr1) {
				for  (int k : arr2) {
					System.out.print( k + " ");
				}
				System.out.println();
		}
			for ( int[] arr3 : arr1 )
				System.out.println(Arrays.toString(arr3));
		}
}}}}

