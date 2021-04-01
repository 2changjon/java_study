package Progremas.Hash;

import java.util.HashMap;

public class Marathon {

	public static void main(String[] args) {
		
		Marathon hash = new Marathon(); // class를 가져와서 함수 사용

		String[] a = { "mislav", "stanko", "mislav", "ana" };
		String[] b = { "stanko", "ana", "mislav" };

		System.out.println(hash.solution(a, b));// solution에 데이터 삽입
	}

	/**
	 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
	 * completion의 길이는 participant의 길이보다 1 작습니다.
	 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
	 * 참가자 중에는 동명이인이 있을 수 있습니다.
	 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant 완주한 선수들의 이름이 담긴 배열 completion
	 */
	public String solution(String[] participant, String[] completion) {
		HashMap<String, String> pmap = new HashMap<String, String>();

		for (int i = 0; i < participant.length; i++) {

		}

		String answer = "";
		return answer;
	}

}
