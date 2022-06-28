package C4_조건문4_프로젝트;

import java.util.Scanner;

public class 조건문3_프로젝트_배달의민족_문제 {

	/*
	[문제]
	
		[배달의 민족]

		 철수는 음식주문을 받고 배달하려고 한다. 
		 현재 철수는 y : 0 , x : 0 의 위치에 있다. 
		 
		 숫자는 2개 를 입력받는다. 
		 숫자1은 방향을 설정하는값이다.
		 숫자2는 이동거리를 설정하는값이다.
		 
		 [방향]
		 	1) 이동해야할 방향은 숫자 0 ~ 3 으로 표현한다. 
		 	2) 각 숫자의 의미는 (북 : 0) ,(동 : 1) , (남 : 2) , (서 : 3) 이다.
		 [이동거리]
		 	1) 이동할 거리는 1~10 사이이다. 


		 예를 들어 방향이 3 이고 , 거리가 8이면 	
		 
		 첫번째 숫자 3은 방향이므로 "서쪽" 이고 ,
		 두번째 숫자 8은 거리는 이므로, 결국 x 가 -8 이된다.  
		 이동할곳은 x : -8 , y : 0 이다.
		
		-----------------------------------------------------------------------------
		 랜덤으로 방향(0~3) 과 거리(1~10)을 저장하고 배달할 위치를 출력하시오.
		 예) 방향은 2 ,  거리는 3 ==> (y = -3 , x = 0)
	
	*/
	public static void main(String[] args) {
		
		int 방향;
		int 거리;
		int x = 0;
		int y = 0;
		
		int 북 = 0;
		int 동 = 1;
		int 남 = 2;
		int 서 = 3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("방향을 입력하시오.");
		방향 = scan.nextInt();
		if(방향<0 || 방향>3) {
			System.out.println("오류");
		}
		else {
			System.out.println("거리을 입력하시오.");
			거리 = scan.nextInt();
			if(거리<1 || 거리>10) {
				System.out.println("오류");
			}
			else{
			if(방향 == 북) {
				y += 거리;
			}
			else if(방향 == 동 ){
				x+= 거리;
			}
			else if(방향 == 남 ){
				y-= 거리;
			}
			else if(방향 == 서 ){
				x-= 거리;
			}
			
			}
			
		}
		
		
		System.out.println(x +"  "+y);
	}
}