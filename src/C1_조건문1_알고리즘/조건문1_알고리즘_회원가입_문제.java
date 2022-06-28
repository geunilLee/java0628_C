package C1_조건문1_알고리즘;

import java.util.Scanner;

public class 조건문1_알고리즘_회원가입_문제 {
	/*
	 * [문제]
	 * 
	 * 	[회원가입 과 로그인] 
	 * 1. 먼저 아이디와 비밀번호를 입력해서 회원가입한다. 
	 * 2. 이후 로그인을 위해 다시 아이디와 비밀번호를 입력받는다.
	 * 3. 가입된 아이디와 비밀번호와 로그인시 입력한 아이디와 비밀번호를 비교한다.
	 * 4. "로그인" 또는 "로그인실패" 를 출력하세요. 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("회원가입 아이디 : ");
		int join_id = scan.nextInt();
		
		System.out.println("비밀번호 아이디 : ");
		int join_pw = scan.nextInt();
		
		System.out.println("아이디를 입력하시오");
		int log_id = scan.nextInt();
		
		System.out.println("아이디를 입력하시오");
		int log_pw = scan.nextInt();
		
		if (join_id == log_id && join_pw == log_pw) {
			System.out.println("로그인 성공");}
		
		if (join_id != log_id || join_pw != log_pw) {
			System.out.println("로그인 실패");}
		
	
		
	}
}