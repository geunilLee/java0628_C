package C2_조건문2_프로젝트;

import java.util.Scanner;

public class 조건문2_프로젝트_가위바위보_문제 {
	/*
	 * [문제]
	 * 		[가위(0) 바위(1) 보(2) 게임]
	 * 1. player1 은 0~2 사이의 숫자를 입력받는다. 
	 * 2. player2 는 0~2 사이의 숫자를 입력받는다. 
	 * 3. 가위,바위,보를 아직문자로는 표현할수없으므로  0,1,2 숫자로 대신표현한다.
	 * 4. player1과 player2를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
	 */
	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);
		System.out.println("플레이어 1은 가위 [1] 바위 [2] 보 [3] 숫자를입력하시오");
		int a = scan.nextInt();
		System.out.println("플레이어 2는 가위 [1] 바위 [2] 보 [3] 숫자를입력하시오");
		int b = scan.nextInt();
		
		
		if(a == 1 && b == 2) {
			System.out.println("졌습니다.");			
		}
		else if(a == 1 && b == 3) {
			System.out.println("이겼습니다.");
			
		}else if(a == 2 && b == 1) {
			System.out.println("이겼습니다.");
		}
		
		else if(a == 2 && b == 3) {
			System.out.println("졌습니다.");
		}
		else if(a == 3 && b == 1) {
			System.out.println("졌습니다.");
		}
		else if(a == 3 && b == 2) {
			System.out.println("이겼습니다.");
		}
		else if(a == b) {
			System.out.println("비겼습니다.");
		}
		
		
	}
}