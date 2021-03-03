
public class IfClass {

	public static void main(String[] args) {
		// 배열이란 여러개의 데이터를 한개의 변수에 넣기 위해 사용
				int[] k = {2,3,6,7,8,9}; //k라는 배열의 크기는 6인데 그 이유는 현재 6개의 데이터가 들어가있기 때문이다.
				//배열은 [a,b,c,d,e,f,g]가 있다면 순서대로 a는 0번 b는 1번이라는 위치를 가진다
				System.out.println(k[0]);
				
				int[] i = new int[8]; // i라는 숫자형은 현재 8개의 데이터를 넣을수 있음
				int f = 1;
				for (int a = 0; a < 9; a++) { //0부터 8까지 반복을 돌리고 안의 내용물이 끝날때 마다 a++를 실행
					
					i[a] = f; // i[0] 에 f을 넣겠다
					
					System.out.print(i[a]);
					
					f++;
				}

	}

}
