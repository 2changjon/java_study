package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//2562
public class Max_Value {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr= new int[9];
		int max =0;
		int count = 0;
		
		for(int i =0; i<9; i++) {
			String bf_s = bf.readLine();
			arr[i] = Integer.parseInt(bf_s);
			if(max < arr[i]) {
				max = arr[i];
				count = i+1;
			}
		
		}
		 bf.close();
	
		System.out.println(max);
		System.out.print(count);
	}
}
