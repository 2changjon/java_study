package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4344
public class Above_Average {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_Case = Integer.parseInt(bf.readLine()); //��ü �׽�Ʈ ���� ������ ����
		String[] case_Values; //���̽� �� �Է°��� ������ ����
		int students; //�л� ���� ������ ����
		int sum = 0; // ���̽��� �� ���� �հ踦 ������ ����
		float mean; // ���̽��� ����� ������ ����
		float count; // ��� �̻��� �л� ���� ������ ����
		float result; // �л� �� ������ ������ ����
		
		//��ü �׽�Ʈ �� ��ŭ �ݺ��ؼ� ���
		for(int i = 0; i< test_Case; i++) {
			case_Values = bf.readLine().split(" "); //������ �������� �迭�� ����
			students = Integer.parseInt(case_Values[0]); //case_Values �迭�� 0�� ������ �л���
			sum = 0; // �� ���� �հ� ���̽��� �ʱ�ȭ
			count = 0; // ��� �̻��� �л��� ���̽��� �ʱ�ȭ
			
			//��ü ��� �� ��� �̻��� �л����� ���ϴ� �ݺ����Դϴ�. 1���� �����ϴ� ������ 0��° ���� �л��� ���̱� �����̴�.
			for(int k = 1; k<= students; k++) {
				sum = sum + Integer.parseInt(case_Values[k]); //���̽��� �� ������ ����
				
				//������ �ݺ��� ���
				if(k == students) {
					mean = sum/students; //����� ����
					
					//����̻��� ������ ���� �л� ���� ����
					for(int j = 1; j <= students; j++) {
						if(Integer.parseInt(case_Values[j]) > mean) {
							count++; //��� �̻��� �л� �� ī��Ʈ
						}
					}
				}
			}
			result = count/students*100; // ��� �̻��� �л� �� ���� ���
			System.out.printf("%.3f%% \n",result);
		}

	}

}
