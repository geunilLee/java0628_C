package 과제조건문5;
import java.util.Random;
/*
	[학습목표]
		랜덤을 활용해서 조건문을 학습한다.
	[문제]
	[연속짝수복권]
		100~900 사이의 랜덤숫자를 출력한다. 
		세자리의 숫자를 전부 한자리씩 분리한다.		
	[규칙]
		[1] 세자리모두 짝수이면 "1등"을 출력한다.
		[2] 두자리가 짝수이고, 짝수인숫자가 연속이면 "2등"을 출력한다. 
		[3] 그외는 "꽝"을 출력한다. 
		[4] 단, 0은 짝수이다.
	[예시]
		462 : 4,6,2 세자리 모두 짝수이므로 "1등"
		462/100=4
		462%100/10=6
		462%100%10=2
		245 : 2,4,5 두자리가 짝수이고 2,4연속이므로 "2등"
		456 : 4,5,6 두자리가 짝수이지만 연속이 아니므로 "꽝"
		782 : 7,8,2 두자리가 짝수이고 8,2연속이므로 "2등" 	
*/
public class 조건문4_문제06_연속짝수복권 {
	public static void main(String[] args) {	
		Random ran = new Random();
		int 램덤숫자 = ran.nextInt(801)+100;
		int 램덤숫자백 = 램덤숫자/100;
		int 램덤숫자십 = 램덤숫자%100/10;
		int 램덤숫자일 = 램덤숫자%100%10;
		System.out.println(램덤숫자);
		if (램덤숫자백%2 == 0 && 램덤숫자십%2 == 0 && 램덤숫자일%2 == 0) {
			System.out.println("1등");
		} else if(램덤숫자백%2 == 0 && 램덤숫자십%2 == 0 && 램덤숫자일%2 != 0) {
				System.out.println("2등");
			} else if(램덤숫자백%2 != 0 && 램덤숫자십%2 == 0 && 램덤숫자일%2 == 0){
				System.out.println("2등");			
			} else {
				System.out.println("꽝");
			}
	}
}