package C3_조건문3_기본이론;

import java.util.Random;

public class 조건문3_기본이론1_랜덤 {
	/*
	 * [랜덤]
	 * 
	 *  1) import java.util.Random; 추가
	 *  2) Random ran = new Random(); 추가 
	 *  3) 이후 main 매소드안에서  int r = ran.nextInt(랜덤범위); 
	 *  4) ( 0 ~ 랜덤범위-1 )  사이값이 나온다. 
	 */		
	public static void main(String[] args) {
		
		Random ran = new Random();
		// 예) 0 ~ 2 사이의 랜덤
		int rNum = ran.nextInt(3);
		System.out.println(rNum);

		// 문제 1) 1 ~ 5 사이의 랜덤
		rNum = ran.nextInt(5) + 1; // [0 ~ 4] + 1
		System.out.println(rNum);

		// 문제 2) -3 ~ 3 사이의 랜덤
		rNum = ran.nextInt(7) - 3; // [0 ~ 6] - 3
		System.out.println(rNum);	
	}
}