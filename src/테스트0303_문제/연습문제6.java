package 테스트0303_문제;

public class 연습문제6 {
	public static void main(String[] args) {
		/*
			거리문제		
			[1] 철수는 자전거를 타고 2시간에 65040 미터를 간다. 
				1시간에는 몇미터를 가는가?
				30분에는 몇미터를 가는가?
				10분에는 몇미터를 가는가?
				1분에는 몇미터를 가는가?
				1초에는 몇미터를 가는가?
				17초에는 몇미터를 가는가?
				
			[2]
				철수는 자전거를 타고 2시간에 65040 미터를 간다. 
				
				철수는 10000미터를 몇초에 가는가?
				철수는 1000 미터를 몇초에 가는가?
				철수는 1미터를 몇초에 가는가?
		 */
		int 한시간 = 65040/2;
		
		int 분 = 한시간/2;
		
		int a = 분/3;
		
		int b = a/10;
		
		int c = b/60;
		
		int d = c*17;
		
		System.out.println(한시간);
		System.out.println(분);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("17초 : " + d);
		

		System.out.println((double)7200/65040*10000);
		System.out.println((double)7200/65040*1000);
		System.out.println((double)7200/65040);
		
		
		    
		    
		
	}
}