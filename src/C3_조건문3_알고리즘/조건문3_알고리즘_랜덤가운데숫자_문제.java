package C3_���ǹ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_�˰���_�����������_���� {
	/*
	 * [����]
	 * 
	 * 	[��� ���� ���߱� ����]
	 * 
	 * 1. 150~250 ������ ���� ���� �����Ѵ�.
	 * 2. ���� ������ ��� ���ڸ� ���� �Է��Ͽ� ���ߴ� �����̴�.
	 * ��)
	 * 		249		: 4
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = ran.nextInt(101);
		num=num+150;
		//System.out.println(num);
		
		int a = num%100;
		//System.out.println(a);
		
		int b = a/10;
		//System.out.println(b);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int me = scan.nextInt();
		
		if( b== me) {System.out.println("����");}
		else {
			System.out.println("��");
		}
		
		
	
	}
}