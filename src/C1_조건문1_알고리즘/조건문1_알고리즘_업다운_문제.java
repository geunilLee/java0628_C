package C1_조건문1_알고리즘;

import java.util.Scanner;

public class 조건문1_알고리즘_업다운_문제 {
	/*
	 * [문제]
	 * 	[Up & Down 게임]
	 * 
	 *  com은 8이다.
	 *  me는 숫자를 하나입력받는다.
	 *  com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
	 *   [1] me < com	: Up!
	 *   [2] me == com : Bingo!
	 *   [3] me > com  : Down!
	 *   
	 *   예)
	 *   (1) 숫자를 입력 : 
	 *   (2) Up! 
	 *   
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		System.out.println("숫자를 입력하시오 : ");
		int me = scan.nextInt();
		
		if (me < com) {System.out.println("Up!");}
			
	    if (me == com) {System.out.println("Bingo!");}
				
		if (me > com) {System.out.println("Down!");}

	}
	}