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
			
			int count = 0; // ������ �������� �ִ��� ���� Ȯ��
			//���� ���� �������� ���� ������ �������� ���� ���� ��
			for(int k = 0; k < i; k++) {
				if(num_rest[i] == num_rest[k]) {
					count++;// ������ �������� ������ ī��Ʈ
				}
			}
			//������ �������� ������ ���ο� ������
			if(count == 0) {
				new_rest++;
			}
		}
		System.out.print(new_rest);
		bf.close();
		
	}

}
