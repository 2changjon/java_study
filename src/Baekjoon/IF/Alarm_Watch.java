package Baekjoon.IF;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alarm_Watch {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		String[] bf_s = bf.readLine().split(" "); //String
		int H = Integer.parseInt(bf_s[0]); //Int �ð�
		int M = Integer.parseInt(bf_s[1]); //Int ��
		
		if(M >=45) {
			M = M-45;
			System.out.println(H+" "+M);
		}else if(H == 0){
			H = 23;
			M = M+15;
			System.out.println(H+" "+M);
		}else {
			H--;
			M=M+15;
			System.out.println(H+" "+M);
		}
		bf.close();
	}
}
