package C3_조건문3_문제;

import java.util.Random;

/*
	[문제]
	[회원등급]
		볼펜하나의 가격은 1200원이다. 	
		볼펜은 20개이상구매시 볼펜하나당 100원을 할인해주고있다. 
			
		또한, 회원등급에 따라 할인을 추가제공한다.
		
		회원등급이 1 이면 15% 할인제공,
		회원등급이 2 이면 10% 할인제공,
		기본회원등급은 3이고 할인을 제공하지않는다.
        위에서 할인된금액에 중복할인이 적용된다.
		
		철수가 구입해야하는볼펜개수는 (10~50) 사이로 랜덤으로 저장하고,
		철수의 등급은 (1~3) 사이로 랜덤으로 표현해서 
		철수가 지불해야하는 금액을 출력하시오.		
		소수점 2 자리까지 표현하시오.
*/
public class 조건문4_문제05_회원등급3 {	
	public static void main(String[] args) {
		Random ran = new Random();
		int 볼펜갯수 = ran.nextInt(41)+10;
		int 회원등급 = ran.nextInt(3)+1;
		
		
		int 갯수당할인금액 = 100;
		int 볼펜 = 1200;
		int 볼펜금액 = 볼펜*볼펜갯수;
		int 할인금액 = 볼펜갯수*갯수당할인금액;
		double 총금액 = 볼펜금액- 볼펜갯수*갯수당할인금액;
		double 회원등급할인1 = 총금액*0.15;
		double 회원등급할인2 = 총금액*0.10;
		if(볼펜갯수 >= 20){
			System.out.println("회원 등급 : " + 회원등급);
			System.out.println("볼팬 갯수 : " + 볼펜갯수);
			System.out.println("볼팬 금액 : " + 볼펜금액);
			System.out.println("할인 금액 : " + 할인금액);
			System.out.printf ("총 금 액 : %.2f   ", + 총금액);
			
			if(회원등급 == 1) {
				System.out.printf ("총 금 액 : %.2f   " , (총금액-회원등급할인1));							
			}
			else if(회원등급  == 2) {
				System.out.printf ("총 금 액 : %.2f   " , (총금액-회원등급할인2));
			}else{
				System.out.printf ("총 금 액 : %.2f   ", + 볼펜금액);
			}
		}
		else {
			System.out.println("회원 등급 : " + 회원등급);
			System.out.println("볼팬 갯수 : " + 볼펜갯수);
			System.out.println("볼팬 금액 : " + 볼펜금액);
			if(회원등급 == 1) {
				System.out.printf ("총 금 액 : %.2f   " , (볼펜금액-회원등급할인1));	
				System.out.println("회원등급1할인 : " + 회원등급할인1);
			}
			else if(회원등급  == 2) {
				System.out.printf ("총 금 액 : %.2f   " , (볼펜금액-회원등급할인2));
				System.out.println("회원등급2할인 : " + 회원등급할인2);
			}
			else {
				System.out.printf ("총 금 액 : %.2f   ", + 볼펜금액);
			}
		}
		
		
	}		
}
