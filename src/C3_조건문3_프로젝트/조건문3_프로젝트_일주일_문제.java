package C3_조건문3_프로젝트;

import java.util.Random;

public class 조건문3_프로젝트_일주일_문제 {
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
		int day = ran.nextInt(31)+1;
		int week = day%7;
		System.out.println(day);
		if(week == 1) {
			System.out.println("수요일");
		}
		else if(week == 2) {
			System.out.println("목요일");
		}
		else if(week == 3) {
			System.out.println("금요일");
		}
		else if(week == 4) {
			System.out.println("토요일");
		}
		else if(week == 5) {
			System.out.println("일요일");
		}
		else if(week == 6) {
			System.out.println("월요일");
		}
		else if(week == 7) {
			System.out.println("화요일");
		}
		
		
	}
}