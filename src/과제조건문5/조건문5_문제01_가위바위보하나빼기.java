package �������ǹ�5;

import java.util.Random;

/*	
	[����]
	[���������� �ϳ�����]
	[1] ���� ���� ���ϰ� ������ �ִ��� ����ϰ� �����ÿ�.
*/
public class ���ǹ�5_����01_�����������ϳ����� {
	public static void main(String[] args) {
		Random ran = new Random();
		int com1 = 0;
		int com2 = 0;
		System.out.println("���� : 0 ���� : 1 �� : 2");
		int a1 = ran.nextInt(3);
		int a2 = ran.nextInt(3);
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		int sel = ran.nextInt(2);
		if(sel == 0) {
			System.out.println(a1);
			com1 = a1;		
		} 
		else if (sel == 1) {
			System.out.println(a2);
			com1 = a2;
			} 
		
		int b1 = ran.nextInt(3);
		int b2 = ran.nextInt(3);
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		int sel1 = ran.nextInt(2);
		if(sel1 == 0) {
			System.out.println(b1);
			com2 = b1;
		}
		else if (sel1 == 1) {
			System.out.println(b2);
			com2 = b2;
		}
		
		if(com1 == 0) {
			if(com2 == 0) {
				System.out.println("com1 ���");
			} 
			else if(com2 == 1) {
				System.out.println("com1 �й�");
			}
			else {
				System.out.println("com1 �¸�");
			}
		}
		else if(com1 == 1) {
			if(com2 == 0) {
				System.out.println("com1 �¸�");
			} 
			else if(com2 == 1) {
				System.out.println("com1 ���");
			}
			else {
				System.out.println("com1 �й�");
			}
		}
		else if(com1 == 2) {
			if(com2 == 0) {
				System.out.println("com1 �й�");
			} 
			else if(com2 == 1) {
				System.out.println("com1 �¸�");
			}
			else {
				System.out.println("com1 ���");
			}
		}
	}
}