package C4_���ǹ�4_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�4_�˰���_Ȧ¦����_����3 {
	/*
	 * [����]
	 * 
	 * 	[Ȧ¦ ����]
	 * 
	 * 1. 1~10���� ������ �������� �Ѱ��� ���ڸ� �����Ѵ�.
	 * 2. ������ ���ڰ� [1.Ȧ��][2.¦��] ���� ���ߴ°����̴�.
	 */		
	public static void main(String[] args) {		
	
		Scanner scan = new Scanner(System.in);
		Random ran  = new Random();
		
		int r = ran.nextInt(10)+1;
		
		System.out.println("[1.Ȧ��][2.¦��]");
		int sel = scan.nextInt();
		
		if(sel == 1) {
			if(r%2 == 1) {
				System.out.println(r);
				System.out.println("����");
			}
			else {
				System.out.println(r);
				System.out.println("����");
			}
		}
		else if(sel == 2) {
			if(r%2 == 0) {
				System.out.println(r);
				System.out.println("����");
			}
			else {
				System.out.println(r);
				System.out.println("����");
			}
		}
		else {
			System.out.println(r);
			System.out.println("����");
		}
		
	}

}
