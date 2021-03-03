
public class ForClass {

	public static void main(String[] args) {

		/*
		 * //배열이란 여러개의 데이터를 한개의 변수에 넣기 위해 사용 int[] k = {2,3,6,7,8,9}; //k라는 배열의 크기는 6인데
		 * 그 이유는 현재 6개의 데이터가 들어가있기 때문이다. //배열 안에 [c,b,a,f,e,d,g]가 있다면 순서대로 c는 0번 b는
		 * 1번이라는 위치를 가진다
		 * 
		 * System.out.println(k[2]);
		 * 
		 * 
		 * int[] i = new int[8]; // i라는 숫자형은 현재 8개의 데이터를 넣을수 있음 int a=1;
		 * 
		 * for (int t= 0; t <= 7; t++) { //0부터 8까지 반복을 돌리고 안의 내용물이 끝날때 마다 a++를 실행
		 * 
		 * i[t] = (++a); // i[0] 에 a+1을 넣겠다
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
