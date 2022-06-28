package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_옷_문제 {
	/*
	[문제] 
		상점에서 24600원 짜리 옷을샀습니다.
		1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가격을 입력하시오.");
		int 가격 = scan.nextInt();
		int 매수 = 가격/1000;
		
		if(가격%1000 < 1000)
			System.out.println((가격/1000) +1 + "장 ");
		}
		

		
	
		
	}
