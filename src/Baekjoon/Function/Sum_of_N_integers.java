package Baekjoon.Function;

//15596
public class Sum_of_N_integers {

	public static void main(String[] args) {		

	}
	
	long sum(int[] a) {
		long sum =0;
		
		for(int i = 0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
