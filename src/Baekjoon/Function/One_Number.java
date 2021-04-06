package Baekjoon.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1065
public class One_Number {
	
	/**
	 * 
	 * 등차수열 == 연속된 두 개의 수의 차이가 일정한 수열
	 * 한수 == 어떤 양의 정수 X의 각 자리가 등차수열을 이루는 수
	 * 1,2자리 수는 비교할 다음 수가 없기 때문에 한수 
	 * 
	 * 1~1000의 수를 입력받고 입력 수보다 작거나 같은 한수의 개수 출력
	 * */
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(count(bf.readLine()));//함수의 개수 출력
		
		bf.close();
	}

	//한수의 개수를 구하는 함수
	public static int count(String num) {
		int count; //한수의 개수
		int number = Integer.parseInt(num); //입력 받은 수 
		int hundred; //백의자리 
		int ten; //십의 자리
		int one; //일의자리
		
		
		if(number <= 99) {
			count = number; // 99이하일 경우  한수
		}else {
			count = 99;
			//100 이상일 경우 한수가 아닌 경우가 있음(비교가 가능해 지는 부분이기 때문이다)
			for (int i = 100; i <= number; i++) {
				hundred = i/100; //백의자리 초기화
				ten = (i%100)/10; //십의자리 초기화
				one = (i%100)%10; //일의자리 초기화

				//등차수열인지 확인
				if(hundred-ten == ten-one) {
					count++;
				}
			}
			
		}
		
		return count;
	}
}
