package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//10818
public class Min_Max_Find {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		String[] arr = bf.readLine().split(" ");
		
		int min;
		int max;
			
		max = min = Integer.parseInt(arr[0]);
		
		for(int i = 1; i<num; i++) {
			if (min > Integer.parseInt(arr[i])) {
				min = Integer.parseInt(arr[i]); 
			}else if(max < Integer.parseInt(arr[i])){
				max = Integer.parseInt(arr[i]); 
			}
		}
		
		bf.close();
		
		System.out.println(min+" "+max);
	}

}
