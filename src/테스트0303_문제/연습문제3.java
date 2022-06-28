package 테스트0303_문제;

public class 연습문제3 {
	public static void main(String[] args) {
		/*
			화폐 테스트
			
			거스름돈이 167000원 있다.
			
			화폐종류별로 몇장씩 나눠줘야하는지 구하시오.
			
			단위는 세단위이다. [오만원,오천원,일천원] 
		 */
		int 거스름돈 = 167000;
		int 오만원 = 167000/50000;
		int 오천원 = 167000%50000/5000;
		int 일천원 = 167000%50000%5000/1000;
		System.out.println(오만원);
		System.out.println(오천원);
		System.out.println(일천원);
		
		
		
		
		
		
		
		
		
	}	

}