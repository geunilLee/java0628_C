package 과제조건문5;

import java.util.Random;

/*	
	[문제]
	[가위바위보 하나빼기]
	[1] 룰은 직접 정하고 게임을 최대한 비슷하게 만들어보시오.
*/
public class 조건문5_문제01_가위바위보하나빼기 {
	public static void main(String[] args) {
		Random ran = new Random();
		int com1 = 0;
		int com2 = 0;
		System.out.println("가위 : 0 바위 : 1 보 : 2");
		int a1 = ran.nextInt(3);
		int a2 = ran.nextInt(3);
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		int sel = ran.nextInt(2);
		if(sel == 0) {
			System.out.println(a1);
			com1 = a1;		
		} 
		else if (sel == 1) {
			System.out.println(a2);
			com1 = a2;
			} 
		
		int b1 = ran.nextInt(3);
		int b2 = ran.nextInt(3);
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		int sel1 = ran.nextInt(2);
		if(sel1 == 0) {
			System.out.println(b1);
			com2 = b1;
		}
		else if (sel1 == 1) {
			System.out.println(b2);
			com2 = b2;
		}
		
		if(com1 == 0) {
			if(com2 == 0) {
				System.out.println("com1 비김");
			} 
			else if(com2 == 1) {
				System.out.println("com1 패배");
			}
			else {
				System.out.println("com1 승리");
			}
		}
		else if(com1 == 1) {
			if(com2 == 0) {
				System.out.println("com1 승리");
			} 
			else if(com2 == 1) {
				System.out.println("com1 비김");
			}
			else {
				System.out.println("com1 패배");
			}
		}
		else if(com1 == 2) {
			if(com2 == 0) {
				System.out.println("com1 패배");
			} 
			else if(com2 == 1) {
				System.out.println("com1 승리");
			}
			else {
				System.out.println("com1 비김");
			}
		}
	}
}