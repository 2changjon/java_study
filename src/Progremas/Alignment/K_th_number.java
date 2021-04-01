package Progremas.Alignment;

public class K_th_number {
	
	public static void main(String[] args) {
		K_th_number alignment = new K_th_number(); //class를 가져와서 함수 사용
		
		int[] a = {1, 5, 2, 6, 3, 7, 4};
		int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; //a배열 2~5번까지 숫자에서(5,2,6,3) 정렬한 뒤(2,3,5,6) 3번째 숫자(5)  

		System.out.println(alignment.solution(a, b));//solution에 데이터 삽입
	}

	/**
	 * array의 길이는 1 이상 100 이하입니다.
	 * array의 각 원소는 1 이상 100 이하입니다.
	 * commands의 길이는 1 이상 50 이하입니다.
	 * commands의 각 원소는 길이가 3입니다.
	 */
	public int[] solution(int[] array, int[][] commands) {
		for(int i = 0; i<commands.length; i++) {
			for(int k = 0; k<2; k++) {
				System.out.println(commands[i][k]);
			}
		}
		for(int i = 0; i<array.length; i++) {
			
		}
		
	    int[] answer = {};
	    return answer;
	}
}