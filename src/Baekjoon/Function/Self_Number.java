package Baekjoon.Function;

import java.util.Arrays;

//4673
public class Self_Number {

	/**
	 * 33 + 3 + 3 = 39�̰�, �� ���� ���� 39 + 3 + 9 = 51 
	 * 33�� 39�� ������  39�� 51�� ������ 
	 * �����ڰ� ���� ���ڸ� ���� �ѹ�
	 *  
	 * */
	public static void main(String[] args) {
		Self_Number self_Number = new Self_Number();
		
		boolean[] check_Arr = new boolean[10000]; //���� �ѹ� ���� üũ
		Arrays.fill(check_Arr, true); //boolean �迭�� �ʱⰪ true�� ����
		
		//������ ���� �ľ�
		for(int i = 1; i<=10000; i++) {
			int num = self_Number.Num_Check(i); //������ ��
			
			// 10000������ �ʿ���
			if(num <= 10000) {
				check_Arr[num-1] = false; //�����ڸ� false
			}
		}
		
		for(int k = 1; k <= check_Arr.length; k++) {
			if(check_Arr[k-1]) {
				System.out.println(k);
			}
		}
		
		
	}
	//������ ���� üũ
	int Num_Check(int num)  {
		int sum = num;
		
		while(num > 0) {
			
			//��ü�� 1�� �ڸ��� ����
			sum = sum + num %10;
			
			//���� �ڸ� ��(10) ���ϱ�
			num = num /10;
			
		}
	
		return sum;
	}

}
