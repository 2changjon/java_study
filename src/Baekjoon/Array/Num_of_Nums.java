package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2577
public class Num_of_Nums {

	public static void main(String[] args)  throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int multiplication = 1;
		
		/*
		 * int num1 = Integer.parseInt(bf.readLine()); 
		 * int num2 = Integer.parseInt(bf.readLine()); 
		 * int num3 = Integer.parseInt(bf.readLine());
		 * int multiplication = num1 * num2 * num3;
		 */
		
		for(int i = 0; i<3; i++ ) {
			multiplication = multiplication * Integer.parseInt(bf.readLine()); //숫자 곱하기
		}
		bf.close();

		int[] num_rest = new int[10]; //0~9까지 10개
	
		while(multiplication > 0 ) {
			num_rest[multiplication % 10]++; //123 % 10 == 3
			multiplication = multiplication/10; //123 / 10 == 12
		}
		
		for(int i =0; i < num_rest.length; i++ ) {
			System.out.println(num_rest[i]);
		}
	}

}
