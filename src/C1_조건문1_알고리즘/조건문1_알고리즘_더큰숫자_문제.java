package C1_조건문1_알고리즘;

import java.util.Scanner;

public class 조건문1_알고리즘_더큰숫자_문제 {
	/*
	 *  [문제] 
	 *  
	 *  	숫자 2개를 입력받고 더큰숫자의 값을 출력하시오.
	 *  
	 *  (1) 숫자1을 입력 : 
	 *  (2) 숫자2를 입력 : 
	 *  (3) 더큰숫자는 ? 입니다.
	 */
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
			
		
		System.out.println("숫자1 입력하시오 : ");
		int a = scan.nextInt();
		
		System.out.println("숫자2 입력하시오 : ");
		int b = scan.nextInt();
		
		if (a>b) {System.out.println("a가 더크다" + a);}
		
		if (b>a) {System.out.println("b가 더크다" + b);}
		
		
		
		}
}