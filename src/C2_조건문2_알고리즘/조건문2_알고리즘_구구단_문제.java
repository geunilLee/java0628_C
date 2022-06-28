package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_구구단_문제 {
	/*
	 * [문제]
	 *  구구단 게임
	 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
	 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
	 * 예)	3 x 7 = ?
	 * 3. 문제에 해당하는 정답을 입력받는다.
	 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
	 */
	
	public static void main(String[] args) {		
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int a = scan.nextInt();
		
		System.out.println("숫자2를 입력하시오");
		int b = scan.nextInt();
		
		System.out.printf ("%d*%d",a, b);
		int c = scan.nextInt();
	
		if(a*b == c) {System.out.println("정답");}
		if(a*b != c) {System.out.println("땡");}
		
		
	}
}