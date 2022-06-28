package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_최대값_문제 {

	/*
	 * [문제]
	 *	최대값 구하기
	 * 1. 숫자 3개를 입력받는다.
	 * 2. 입력받은 3개의 수를 비교한다.
	 * 3. 가장 큰 수(MAX)를 출력한다.
	 */
	public static void main(String[] args) {		
			
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("숫자1 입력");
		a = scan.nextInt();
		System.out.println("숫자2 입력");
		b = scan.nextInt();
		System.out.println("숫자3 입력");
		c = scan.nextInt();
		int max= a;
		if(max<b) {System.out.println(max=b);}
		if(max<c) {System.out.println(max=c);}
		System.out.println("max : " + max);
		
}
}
