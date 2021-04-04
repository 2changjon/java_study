package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1546
public class Average {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_Num =  Integer.parseInt(bf.readLine()); //���谳��
		String[] test_arr = bf.readLine().split(" "); //�ӽ� ��������
		float[] test_value = new float[test_Num];  //��������
		float max = 0; //�ְ�����
		float sum = 0; //�հ�
		float mean; // ���
		
		//�ְ������� ����
		for(int i = 0; i<test_Num; i++) {
			test_value[i] = Integer.parseInt(test_arr[i]);
	
			if(max < test_value[i]) {
				max = test_value[i];
			}
			//�������� ����
			if( i == test_Num-1) {
				for(int k = 0; k<test_Num; k++) {
					test_value[k] = test_value[k]/max*100;
					sum = sum + test_value[k];
				}
			}
			
		}
		
		mean = sum / test_Num;
		bf.close();
		System.out.println(mean);
	}

}
