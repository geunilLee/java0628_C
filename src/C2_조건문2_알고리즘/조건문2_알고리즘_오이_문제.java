 package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_오이_문제 {
	/*
  	[문제]
  	
  	 	 마트에서 오이를 3개씩 묶어서 1500원에 판매한다.
	 	 오이가 14개 필요하다. 
	 	 필요한 금액을 출력하시오.
	 	 단, 오이는 묶음으로만 판매한다.

 */
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("필요한 오이갯수는?");
	int 필요한오이갯수 = scan.nextInt();
	int 오이 = 3;
	int 묶음 = 필요한오이갯수/오이;
	
	if(필요한오이갯수%오이 > 0) {
		묶음 = 묶음 +1;
	
	}
	
		System.out.println(묶음*1500);
		
		
		
		
	}
}