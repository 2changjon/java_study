package Progremas.Alignment;

public class K_th_number {
	
	public static void main(String[] args) {
		K_th_number alignment = new K_th_number(); //class�� �����ͼ� �Լ� ���
		
		int[] a = {1, 5, 2, 6, 3, 7, 4};
		int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}; //a�迭 2~5������ ���ڿ���(5,2,6,3) ������ ��(2,3,5,6) 3��° ����(5)  

		System.out.println(alignment.solution(a, b));//solution�� ������ ����
	}

	/**
	 * array�� ���̴� 1 �̻� 100 �����Դϴ�.
	 * array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
	 * commands�� ���̴� 1 �̻� 50 �����Դϴ�.
	 * commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
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