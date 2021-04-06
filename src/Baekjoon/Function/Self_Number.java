package Baekjoon.Function;

import java.util.Arrays;

//4673
public class Self_Number {

	/**
	 * 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51 
	 * 33은 39의 생성자  39는 51의 생성자 
	 * 생성자가 없는 숫자를 셀프 넘버
	 *  
	 * */
	public static void main(String[] args) {
		Self_Number self_Number = new Self_Number();
		
		boolean[] check_Arr = new boolean[10000]; //셀프 넘버 유무 체크
		Arrays.fill(check_Arr, true); //boolean 배열의 초기값 true로 설정
		
		//생성자 유무 파악
		for(int i = 1; i<=10000; i++) {
			int num = self_Number.Num_Check(i); //생성된 수
			
			// 10000까지만 필요함
			if(num <= 10000) {
				check_Arr[num-1] = false; //생성자면 false
			}
		}
		
		for(int k = 1; k <= check_Arr.length; k++) {
			if(check_Arr[k-1]) {
				System.out.println(k);
			}
		}
		
		
	}
	//생성자 유무 체크
	int Num_Check(int num)  {
		int sum = num;
		
		while(num > 0) {
			
			//전체에 1의 자리를 더함
			sum = sum + num %10;
			
			//다음 자리 수(10) 구하기
			num = num /10;
			
		}
	
		return sum;
	}

}
