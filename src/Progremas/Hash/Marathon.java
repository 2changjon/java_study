package Progremas.Hash;

import java.util.HashMap;

public class Marathon {

	public static void main(String[] args) {
		
		Marathon hash = new Marathon(); // class�� �����ͼ� �Լ� ���

		String[] a = { "mislav", "stanko", "mislav", "ana" };
		String[] b = { "stanko", "ana", "mislav" };

		System.out.println(hash.solution(a, b));// solution�� ������ ����
	}

	/**
	 * ������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
	 * completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
	 * �������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
	 * ������ �߿��� ���������� ���� �� �ֽ��ϴ�.
	 * �����濡 ������ �������� �̸��� ��� �迭 participant ������ �������� �̸��� ��� �迭 completion
	 */
	public String solution(String[] participant, String[] completion) {
		HashMap<String, String> pmap = new HashMap<String, String>();

		for (int i = 0; i < participant.length; i++) {

		}

		String answer = "";
		return answer;
	}

}
