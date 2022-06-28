package C3_조건문3_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 조건문3_알고리즘_랜덤가운데숫자_문제 {
	/*
	 * [문제]
	 * 
	 * 	[가운데 숫자 맞추기 게임]
	 * 
	 * 1. 150~250 사이의 랜덤 숫자 저장한다.
	 * 2. 랜덤 숫자의 가운데 숫자를 직접 입력하여 맞추는 게임이다.
	 * 예)
	 * 		249		: 4
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt(101);
		num=num+150;
		//System.out.println(num);
		
		int a = num%100;
		//System.out.println(a);
		
		int b = a/10;
		//System.out.println(b);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int me = scan.nextInt();
		
		if( b== me) {System.out.println("정답");}
		else {
			System.out.println("꽝");
		}
		
		
	
	}
}