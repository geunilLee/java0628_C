package C4_조건문4_알고리즘;

import java.util.Scanner;

public class 조건문4_알고리즘_ATM_문제 {
	/*
	 * [문제] 
	 * 
	 * [ATM]
	 *  
	 *   [변수설명]
	 *   cash ==> 가지고있는 현금을 표현한다.
	 *   balance ==> 예금을 표현한다.
	 *   joinId ==> 이미 가입한 아이디
	 *   joinPw ==> 이미 가입한 패스워드
	 *  
	 *   [특이사항] ==>  로그인 이후에 새로운 메뉴가 나오도록 한다.
	 *   
	 *   	[1.로그인] 
	 *  	    [1-1. 로그인성공] ==> 새로운매뉴등장 ==> [1.입금] [2.출금] 	                
	 *              [1-1-1.입금] ==> 입금금액을 따로 입력받는다. 현금이 줄어들고 예금이 늘어난다.
	 *              [1-1-2.출금] ==> 출금금액을 따로 입력받는다. 예금이 줄어들고 현금이 늘어난다.
	 *  		[1-2. 로그인실패] ==> 종료
	 *  	[0.종료]
	 *  
package C4_조건문4_알고리즘;

import java.util.Scanner;

public class 조건문4_알고리즘_ATM_문제 {
	/*
	 * [문제] 
	 * 
	 * [ATM]
	 *  
	 *   [변수설명]
	 *   cash ==> 가지고있는 현금을 표현한다.
	 *   balance ==> 예금을 표현한다.
	 *   joinId ==> 이미 가입한 아이디
	 *   joinPw ==> 이미 가입한 패스워드
	 *  
	 *   [특이사항] ==>  로그인 이후에 새로운 메뉴가 나오도록 한다.
	 *   
	 *   	[1.로그인] 
	 *  	    [1-1. 로그인성공] ==> 새로운매뉴등장 ==> [1.입금] [2.출금] 	                
	 *              [1-1-1.입금] ==> 입금금액을 따로 입력받는다. 현금이 줄어들고 예금이 늘어난다.
	 *              [1-1-2.출금] ==> 출금금액을 따로 입력받는다. 예금이 줄어들고 현금이 늘어난다.
	 *  		[1-2. 로그인실패] ==> 종료
	 *  	[0.종료]
	 *  
	 *   [최종결과를 출력하시오]
	 *  
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;    
		int balance = 30000; 
		int joinId = 11111; 
		int joinPw = 1234;  
	
		System.out.println("===MEGA ATM===");
		System.out.println("[1.로그인] [0.종료]");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("아이디를 입력하시오. : ");
			int joinId1 = scan.nextInt();
			System.out.println("비밀번호를 입력하시오. : ");
			int joinPw2 = scan.nextInt();
			if(joinId == joinId1 && joinPw == joinPw2) {
				System.out.println("로그인성공");
				System.out.println("1. 입금, 2. 출금");
				int sel = scan.nextInt();
				if(sel == 1) {
					System.out.println("금액을입력하시오");
					int 돈 = scan.nextInt();
					System.out.println("현재금액 : " + (cash+돈));
				} else if(sel == 2){
					System.out.println("금액을입력하시오");
					int 돈 = scan.nextInt();
					if(돈<=cash){
						System.out.println("현재금액 : " + (cash-돈));
						}
					else{
						System.out.println("미네랄이부족합니다.");
					}
				}
			} else {
					System.out.println("로그인실패");
		    	}
		}else if (select == 0) {
			System.out.println("종료");
		}

	}
}