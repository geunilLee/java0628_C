package C3_조건문3_문제;

import java.util.Scanner;

/*
	[문제]
		택시기본요금은 10000원이다.		
		기본요금으로는  10km 까지 이동할수있다. 		
		10km이상 이동시 추가요금이 발생한다.		
		추가요금은 3km이동 할때마다 2300원씩 요금이 추가된다.			
		이동거리를 입력받고 요금을 출력하시오.	
		이동거리가 0이하일경우 "오류" 출력하시오.
*/
public class 조건문2_문제03_택시요금 {
	public static void main(String[] args) {	
		int 기본요금 =10000;
		int 기본거리 = 10;
		int 추가거리 = 3;
		int 추가요금 = 0;
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("이동거리를입력하시오.");
		 int 이동거리 = scan.nextInt();
		 if(이동거리<=기본거리) {
			 System.out.println("요금 : " + 기본요금);
		 }
		 
		 if (이동거리>기본거리) {
			 int 추가이동거리=이동거리-기본거리;
			 추가요금 = 추가이동거리/추가거리;
			 
			 if(추가이동거리%추가거리>0) {
				 추가요금=추가요금+1;
			 }
			 int 총요금 = 기본요금 + 추가요금*2300;
			 System.out.println("요금 : " + 총요금);
		 }

	}
}