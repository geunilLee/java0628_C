package C3_조건문3_프로젝트;

import java.util.Random;

public class 조건문3_프로젝트_일주일_문제2 {
	/*
	 * [문제]
	 * 
	 *  [요일 맞추기]
	 *  
	 * 	이번달 1일이 수요일이라고 할때, 
	 *  랜덤으로 1~31을 저장하고 해당 요일 출력한다. 
	 *  
	 *  예) 3일 ==> 금요일
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(31)+1;
		
		int week = 7;
		if(r%week == 1) {
			System.out.println(r+"일"+" "+"수요일");
		}
		else if(r%week == 2) {
			System.out.println(r+"일"+" "+"목요일");
		}
		else if(r%week == 3) {
			System.out.println(r+"일"+" "+"금요일");
		}
		else if(r%week == 4) {
			System.out.println(r+"일"+" "+"토요일");
		}
		else if(r%week == 5) {
			System.out.println(r+"일"+" "+"일요일");
		}
		else if(r%week == 6) {
			System.out.println(r+"일"+" "+"월요일");
		}
		else if(r%week == 0) {
			System.out.println(r+"일"+" "+"화요일");
		}
	}
}
