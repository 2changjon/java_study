package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8958
public class OX_Quiz {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int quiz_Num = Integer.parseInt(bf.readLine()); //퀴즈 개수
		int[] quiz_Values = new int[quiz_Num]; //퀴즈 점수가 들어갈 배열
		
		for(int i = 0; i < quiz_Num; i++) { // quiz_num = 5; 0~4까지 5번 반복
			String quiz_OX = bf.readLine(); // ox를 입력받을 변수
			
			int count = 0; // 연속된 o로 누적되는 점수를 담당하는 변수
			
			//quiz_OX에 입력받은 ox의 개수 만큼 반복해 점수 확인해서 점수 넣기
			for(int k = 0; k < quiz_OX.length(); k++) {

				//quiz_OX.substring(k,k+1) "oxoxoo"일때 k가 0이라면 0부터1까지의 위치에 있는 o하나 출력됨
				if(quiz_OX.substring(k,k+1).equals("O")) {
					count++;
					quiz_Values[i] = quiz_Values[i] + count; 
				}else {
					count = 0; //x가 나온경우에는 누적 점수 초기화
				}
			}
			
			System.out.println(quiz_Values[i]); 
		}
		bf.close();
	}

}
