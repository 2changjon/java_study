
public class ForClass {

	public static void main(String[] args) {

		/*
		 * //�迭�̶� �������� �����͸� �Ѱ��� ������ �ֱ� ���� ��� int[] k = {2,3,6,7,8,9}; //k��� �迭�� ũ��� 6�ε�
		 * �� ������ ���� 6���� �����Ͱ� ���ֱ� �����̴�. //�迭 �ȿ� [c,b,a,f,e,d,g]�� �ִٸ� ������� c�� 0�� b��
		 * 1���̶�� ��ġ�� ������
		 * 
		 * System.out.println(k[2]);
		 * 
		 * 
		 * int[] i = new int[8]; // i��� �������� ���� 8���� �����͸� ������ ���� int a=1;
		 * 
		 * for (int t= 0; t <= 7; t++) { //0���� 8���� �ݺ��� ������ ���� ���빰�� ������ ���� a++�� ����
		 * 
		 * i[t] = (++a); // i[0] �� a+1�� �ְڴ�
		 * 
		 * System.out.printf("%d ",i[t]);
		 * 
		 * }
		 * 
		 * 
		 * int[] i = {1,2,3,4,5,6,7,8,9,10};
		 * 
		 * for(int t = 0; t<=9; t++) { System.err.printf("%d",i[t]); }
		 * 
		 */ int i = 0;
		int hap = 0;
		int num[] = new int[90];

		for (i = 0; i <= 89; i++) {
			num[i] = (i + 11);
			hap = hap + num[i];
		}
		i = 0;
		while (i < 90) {
			System.out.println(num[i]);
			i++;
		}
		System.out.println(hap);

	}

}
