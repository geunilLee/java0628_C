package C4_조건문4_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 조건문4_알고리즘_홀짝게임_문제 {
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
		System.out.println("1.홀수 , 2. 짝수를입력하시오.");
		int 맞춤숫자 = scan.nextInt();
		
		Random ran = new Random();
		int 램덤숫자 = ran.nextInt(10)+1;
		
		if(맞춤숫자 == 1) {
			if(램덤숫자%2 != 0) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
			} else if(맞춤숫자 == 2){
				if(램덤숫자%2 == 0) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
			} else {
				System.out.println("오류");
			}
		System.out.println(램덤숫자);
	}
}