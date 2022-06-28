package C4_조건문4_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 조건문3_프로젝트_연산자기호_문제4 {
	/*
	 * [문제]
	 * 
	 * 	[연산자 기호 맞추기 게임]
	 * 1. 1~10 사이의 랜덤 숫자 2개를 a와 b에 각각 저장한다. 예) a = 3 , b = 4 
	 * 
	 * 2. 1~4 사이의 랜덤 숫자 1개를 op에 저장한다.  예) op = 3
	 * 
	 * 3. op의 값은  연산자 기호에 해당된다. 예) op의값이 3이면 곱하기 이다.
	 * 	  [1] + [2] - [3] * [4] % 
	 * 
	 * 4. 화면에 숫자두개와 답을 출력한다.(단, 기호는 출력하면안된다.)
	 *    그리고 아래 선택할 보기를 출력한다.
	 * 예) 
	 * 		3 ? 4  = 12
	 *    	[1] + [2] - [3] * [4] % 
	 *    
	 * 5. 사용자는 기호를 맞추면된다. 예) 3 ==> 정답
	 *    
	 *  아쉽게도 답이 여러개 나올수있다. 아직은 수정불가능하고, 추후에 수정가능하다.  
	 *  
	 */
	
	public static void main(String[] args) {	
		Random ran = new Random();
		Scanner scan= new Scanner(System.in);
		int 더하기 = 1;
		int 빼기 = 2;
		int 곱하기 = 3;
		int 나누기 = 4;
		int c = 0;
		
		int a = ran.nextInt(10)+1;
		int b = ran.nextInt(10)+1;
		int op = ran.nextInt(4)+1;
		
		if(op == 더하기) {
			c = a+b;
		}
		else if(op == 빼기) {
			c = a-b;
		}
		else if(op == 곱하기) {
			c = a*b;
		}
		else if(op == 나누기) {
			c = a%b;
		}
		System.out.printf ("%d ? %d = %d\n", a,b,c);
		System.out.println("[1] + [2] - [3] * [4] %");
		int sel = scan.nextInt();
		
		if(sel<1 || sel>4){
			System.out.println("오류");
		}
		else if(op == sel) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
	}
}