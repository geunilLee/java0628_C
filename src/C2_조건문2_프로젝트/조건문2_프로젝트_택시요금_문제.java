package C2_조건문2_프로젝트;

import java.util.Scanner;

public class 조건문2_프로젝트_택시요금_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
			택시기본요금은 10000원입니다.
			
			기본요금으로는  10km 까지 이동 가능합니다. 
			
			10km이상 이동시 추가요금이 발생합니다. 
			
			추가요금은 3km이동할때마다 2300원씩 요금이 추가됩니다.
				
			이동거리를 입력받고 요금출력하시오.
		
		 */
		
		int 기본요금 = 10000;
		int 기본거리 = 10;
		int 추가요금 = 0;
		int 추가거리 = 3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이동할 거리 입력 : ");
		int 이동할거리 = scan.nextInt();
		
		if(이동할거리 <= 기본거리) {
			System.out.println("요금 : " + 기본요금);
		}
		if(이동할거리 > 기본거리) {
			int 추가이동거리 = 이동할거리 - 기본거리;
			추가요금 = 추가이동거리 / 추가거리;
			if(추가이동거리 % 추가거리 > 0) {
				추가요금 = 추가요금 + 1;
			}		
			int 총요금 = 기본요금 + 추가요금 * 2300;
			System.out.println("요금 : " + 총요금);
		}
		
	}
}