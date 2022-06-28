package C1_조건문1_프로젝트;
import java.util.Scanner;

public class 조건문1_프로젝트_합격_문제 {
	/*
	 * [문제]
	 *  [점수 유효성 검사]
	 * 1. 점수2개를 입력받아 평균을 구한다.
	 * 2. 평균이  60점 이상이면 합격, 60점 미만이면 불합격이다.
	 * 3. 조건1)  입력받은 정수가 
	 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
	 *    예) 점수를  잘못 입력했습니다.
	 * 4. 조건2) 평균이 60 이상이라도 , 한과목이라도 50미만이면 불합격을 출력한다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 숫자를 입력하시오.");
		int a = scan.nextInt();
		System.out.println("2. 숫자를 입력하시오.");
		int b = scan.nextInt();
		
		double c = (a+b)/2;
		System.out.println("평균 : " + c);
		if(c>=60 && a>=50 && b>=50) {
			System.out.println("합격");
		}
		if(c<60 || a<50 || b<50 ) {
			System.out.println("불합격");
		}
		if(a<0 || a>100 || b < 0 || b < 100) {
			System.out.println("점수를 잘못입력하였습니다");
		}
		
		

	}
}