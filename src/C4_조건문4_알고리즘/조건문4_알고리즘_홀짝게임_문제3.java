package C4_조건문4_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 조건문4_알고리즘_홀짝게임_문제3 {
	/*
	 * [문제]
	 * 
	 * 	[홀짝 게임]
	 * 
	 * 1. 1~10개의 숫자중 랜덤으로 한개의 숫자를 저장한다.
	 * 2. 랜덤의 숫자가 [1.홀수][2.짝수] 인지 맞추는게임이다.
	 */		
	public static void main(String[] args) {		
	
		Scanner scan = new Scanner(System.in);
		Random ran  = new Random();
		
		int r = ran.nextInt(10)+1;
		
		System.out.println("[1.홀수][2.짝수]");
		int sel = scan.nextInt();
		
		if(sel == 1) {
			if(r%2 == 1) {
				System.out.println(r);
				System.out.println("정답");
			}
			else {
				System.out.println(r);
				System.out.println("오답");
			}
		}
		else if(sel == 2) {
			if(r%2 == 0) {
				System.out.println(r);
				System.out.println("정답");
			}
			else {
				System.out.println(r);
				System.out.println("오답");
			}
		}
		else {
			System.out.println(r);
			System.out.println("오답");
		}
		
	}

}
