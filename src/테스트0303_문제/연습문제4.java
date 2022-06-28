package 테스트0303_문제;

public class 연습문제4 {
	public static void main(String[] args) {
		/*
			34565 의 숫자중에서 제일 가운데 숫자만 변수a 에 담아서 출력하시오.
		 */
		int num = 34565;
		int a = 0;
		
		a = num%1000/100;
		
		System.out.println(a);
	}
}