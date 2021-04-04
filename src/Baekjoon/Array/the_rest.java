package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3052
public class the_rest {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] num_rest = new int[10];	
		
		int rest_num = 42;
		int new_rest = 0;

		for(int i = 0; i< num_rest.length; i++) {
			num_rest[i] = Integer.parseInt(bf.readLine()) % rest_num;
			
			int count = 0; // 동일한 나머지가 있는지 여부 확인
			//현재 들어온 나머지와 여태 까지의 나머지들 과의 숫자 비교
			for(int k = 0; k < i; k++) {
				if(num_rest[i] == num_rest[k]) {
					count++;// 동일한 나머지가 있음면 카운트
				}
			}
			//동일한 나머지가 없으면 새로운 나머지
			if(count == 0) {
				new_rest++;
			}
		}
		System.out.print(new_rest);
		bf.close();
		
	}

}
