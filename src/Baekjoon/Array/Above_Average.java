package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4344
public class Above_Average {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_Case = Integer.parseInt(bf.readLine()); //전체 테스트 수를 저장할 변수
		String[] case_Values; //케이스 별 입력값을 저장할 변수
		int students; //학생 수를 저장할 변수
		int sum = 0; // 케이스별 총 점수 합계를 저장할 변수
		float mean; // 케이스별 평균을 저장할 변수
		float count; // 평균 이상의 학생 수를 저장할 변수
		float result; // 학생 수 비율을 저장할 변수
		
		//전체 테스트 수 만큼 반복해서 출력
		for(int i = 0; i< test_Case; i++) {
			case_Values = bf.readLine().split(" "); //공백을 기준으로 배열에 저장
			students = Integer.parseInt(case_Values[0]); //case_Values 배열의 0은 언제나 학생수
			sum = 0; // 총 점수 합계 케이스별 초기화
			count = 0; // 평균 이상의 학생수 케이스별 초기화
			
			//전체 평균 및 평균 이상의 학생수를 구하는 반복문입니다. 1부터 시작하는 이유는 0번째 값은 학생의 수이기 때문이다.
			for(int k = 1; k<= students; k++) {
				sum = sum + Integer.parseInt(case_Values[k]); //케이스별 총 점수를 저장
				
				//마지막 반복일 경우
				if(k == students) {
					mean = sum/students; //평균을 저장
					
					//평균이상의 점수를 맞은 학생 수를 저장
					for(int j = 1; j <= students; j++) {
						if(Integer.parseInt(case_Values[j]) > mean) {
							count++; //평균 이상의 학생 수 카운트
						}
					}
				}
			}
			result = count/students*100; // 평균 이상의 학생 수 비율 계산
			System.out.printf("%.3f%% \n",result);
		}

	}

}
