package 테스트0303_문제;

public class 연습문제7 {
	public static void main(String[] args) {
		/*
			거리문제
			
			[1] 철수는 시속 3km 의 속도로 37분간 걸어갔다. 
			    철수가 간거리는 몇km 인가?
			    철수가 간거리는 몇m 인가?
			    
			[2] 철수는 870미터를 40분간 걸어갔다. 
				철수의 시속은 얼마인가?
				철수의 분속은 얼마인가?
				
				
			1분은 3/60
			한시간에 3km
		
		 */
		double 일분 =0;
		
		
		일분 = 3/60.0;
		System.out.println("일분동안간 km : " + 일분 + "km");
		System.out.println("일분동안간 m : " + 일분*1000 + "m");
		System.out.println("37분간 간거리는 : " + ((일분*1000)*37) + "m" );
		System.out.println();
		일분 = 870/40.0;
		System.out.println("일분동안간거리 : " + 일분 + "m");
		System.out.println("시속" + ((일분*60)/1000) + "km");
		System.out.println("분속" + (일분*60) + "m");
	}
}