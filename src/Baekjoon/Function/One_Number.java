package Baekjoon.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1065
public class One_Number {
	
	/**
	 * 
	 * �������� == ���ӵ� �� ���� ���� ���̰� ������ ����
	 * �Ѽ� == � ���� ���� X�� �� �ڸ��� ���������� �̷�� ��
	 * 1,2�ڸ� ���� ���� ���� ���� ���� ������ �Ѽ� 
	 * 
	 * 1~1000�� ���� �Է¹ް� �Է� ������ �۰ų� ���� �Ѽ��� ���� ���
	 * */
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(count(bf.readLine()));//�Լ��� ���� ���
		
		bf.close();
	}

	//�Ѽ��� ������ ���ϴ� �Լ�
	public static int count(String num) {
		int count; //�Ѽ��� ����
		int number = Integer.parseInt(num); //�Է� ���� �� 
		int hundred; //�����ڸ� 
		int ten; //���� �ڸ�
		int one; //�����ڸ�
		
		
		if(number <= 99) {
			count = number; // 99������ ���  �Ѽ�
		}else {
			count = 99;
			//100 �̻��� ��� �Ѽ��� �ƴ� ��찡 ����(�񱳰� ������ ���� �κ��̱� �����̴�)
			for (int i = 100; i <= number; i++) {
				hundred = i/100; //�����ڸ� �ʱ�ȭ
				ten = (i%100)/10; //�����ڸ� �ʱ�ȭ
				one = (i%100)%10; //�����ڸ� �ʱ�ȭ

				//������������ Ȯ��
				if(hundred-ten == ten-one) {
					count++;
				}
			}
			
		}
		
		return count;
	}
}
