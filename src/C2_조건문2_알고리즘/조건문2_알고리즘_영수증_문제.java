package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_영수증_문제 {
	/*
	 * [문제]
	 *  
	 * 	[영수증 출력]
	 * 1. 메뉴판을 출력한다.
	 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
	 * 3. 현금을 입력받는다.
	 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
	 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
	 */
	public static void main(String[] args) {	
		
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		System.out.println("번호를 입력하시오");
		int 번호 = scan.nextInt();
		if (번호==1) {
			System.out.println("현금을 입력하시오");
			int 돈 = scan.nextInt();
			int 거스름돈 = 돈-price1;
			if(거스름돈>=0) {
				System.out.println("현금"+돈);
				System.out.println("불고기버거" + price1);
				System.out.println("거스름돈" + 거스름돈);}
			if(거스름돈<0) {
				System.out.println("현금이 부족합니다.");
			}
			
		}
		
		if (번호==2) {
			System.out.println("현금을 입력하시오");
			int 돈 = scan.nextInt();
			int 거스름돈 = 돈-price2;
			if(거스름돈>=0) {
				System.out.println("현금"+돈);
				System.out.println("새우    버" + price2);
				System.out.println("거스름돈" + 거스름돈);}
			if(거스름돈<0) {
				System.out.println("현금이 부족합니다.");
			}
			
		}
		
		if (번호==3) {
			System.out.println("현금을 입력하시오");
			int 돈 = scan.nextInt();
			int 거스름돈 = 돈-price3;
			if(거스름돈>=0) {
				System.out.println("현금"+돈);
				System.out.println("콜     라" + price3);
				System.out.println("거스름돈" + 거스름돈);}
			if(거스름돈<0) {
				System.out.println("현금이 부족합니다.");
			}
			
		}
		
		if(번호 <1 || 3<번호) {
			System.out.println("오류");
		}
		
		
				
	}
}