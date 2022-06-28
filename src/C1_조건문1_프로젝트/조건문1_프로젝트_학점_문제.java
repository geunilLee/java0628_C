package C1_조건문1_프로젝트;

import java.util.Scanner;

public class 조건문1_프로젝트_학점_문제 {
	Scanner scan = new Scanner(System.in);
	/*
	 * [문제]
	 * 
	 * 	[학점]
	 * 	시험점수를 입력받는다. 
	 * 	시험점수에 해당하는 학점을 출력하시오.
	 * 	아래는 점수표이다.
	 * 		100~91 이면 A학점,
	 * 		90~81  이면 B학점,
	 * 		80이하는 "재시험"
	 * 		
	 * 		단, 만점이거나, A학점과 B학점의 일의 자리가 7점이상이면 + 추가하시오.
	 * 		A학점과 B학점의 일의 자리가 3점이하이면 - 추가하시오.
	 * 
	 * 	예) 
	 * 		100 => A+
	 *     	87 ==> B+
	 *     	82 ==> B-
	 *     	23 ==> 재시험
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("점수를입력하시오.");
		int a = scan.nextInt();
		
		if(a>=97 && a<=100 ) {
			System.out.println("a+");
		}
		if(a >= 94 && a <= 96) {
			System.out.println("a");
		}
		if(a <= 93 && a >=91 ) {
			System.out.println("a-");
		}
		
		if(a>=87 && a<= 90 ) {
			System.out.println("b+");
		}
		if(a <= 86 && a >= 84) {
			System.out.println("b");
		}
		if(a <= 83 && a >=81 ) {
			System.out.println("b-");
		}


		if(a<= 80 ) {
			System.out.println("재시험");
		}
		if(a > 100 || a < 0) {
			System.out.println("오류");
		}
	

	}
}