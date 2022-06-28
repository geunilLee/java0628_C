package 테스트0303_문제;

public class 연습문제1 {
	public static void main(String[] args) {
		/*
		 * 시간 테스트 
		 * 
		 * 4000 초를 시간만 출력하시오.
		 * 4000 초를 시간을 제외하고 초만 출력하시오.
		 * 4000 초를 시간을 제외하고 분만 출력하시오.
		 * 
		 * 8000 초를 시간만 출력하시오.
		 * 8000 초를 시간을 제외하고 초만 출력하시오.
		 * 8000 초를 시간을 제외하고 분만 출력하시오.
		 * 
		 * 
		 * 123123 초를 시간만 출력하시오.
		 * 123123 초를 시간을 제외하고 초만 출력하시오.
		 * 123123 초를 시간을 제외하고 분만 출력하시오.
		 */
		
		int 시간 = 4000/3600;
		int 초 = 4000%3600;
		int 분 = 4000%3600/60;
		System.out.println("시간 : " + 시간);
		System.out.println("분 : " + 분);
		System.out.println("초 : " + 초);
		System.out.println();
		int a = 8000/3600;
		int b = 8000%3600;
		int c = 8000%3600/60;
		System.out.println("시간 : " + a);
		System.out.println("분 : " + b);
		System.out.println("초 : " + c);
		System.out.println();
		int d = 123123/3600;
		int e = 123123%3600;
		int f = 123123%3600/60;
		System.out.println("시간 : " + d);
		System.out.println("분 : " + e);
		System.out.println("초 : " + f);
		
	}
}