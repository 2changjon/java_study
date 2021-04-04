package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8958
public class OX_Quiz {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int quiz_Num = Integer.parseInt(bf.readLine()); //���� ����
		int[] quiz_Values = new int[quiz_Num]; //���� ������ �� �迭
		
		for(int i = 0; i < quiz_Num; i++) { // quiz_num = 5; 0~4���� 5�� �ݺ�
			String quiz_OX = bf.readLine(); // ox�� �Է¹��� ����
			
			int count = 0; // ���ӵ� o�� �����Ǵ� ������ ����ϴ� ����
			
			//quiz_OX�� �Է¹��� ox�� ���� ��ŭ �ݺ��� ���� Ȯ���ؼ� ���� �ֱ�
			for(int k = 0; k < quiz_OX.length(); k++) {

				//quiz_OX.substring(k,k+1) "oxoxoo"�϶� k�� 0�̶�� 0����1������ ��ġ�� �ִ� o�ϳ� ��µ�
				if(quiz_OX.substring(k,k+1).equals("O")) {
					count++;
					quiz_Values[i] = quiz_Values[i] + count; 
				}else {
					count = 0; //x�� ���°�쿡�� ���� ���� �ʱ�ȭ
				}
			}
			
			System.out.println(quiz_Values[i]); 
		}
		bf.close();
	}

}
