package C3_���ǹ�3_�˰���;

import java.util.Random;

public class ���ǹ�3_�˰���_����369_���� {
	/*
	 * [����]
	 * 
	 * 	[369����]
	 * 
	 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
	 * 2. �� ���� 369�� ������
	 * 	1) 2���̸�, ¦¦�� ����Ѵ�.
	 *  2) 1���̸�, ¦�� ����Ѵ�.
	 *  3) 0���̸�, �ش� ���ڸ� ����Ѵ�.
	 * ��)
	 * 		33	 : ¦¦
	 * 		16	 : ¦
	 * 		 7	 : 7
	 */
	public static void main(String[] args) {	
		Random ran = new Random();
		
		int num = ran.nextInt(50); // 50�� ==> 0~49
		num = num + 1;
		System.out.println(num);
		
		int a = num / 10;
		int b = num % 10;
		int count = 0;
		if(a == 3 || a == 6 || a == 9) {
			count = count + 1;
		}
		if(b == 3 || b == 6 || b == 9) {
			count = count + 1;
		}
			
		if(count == 2) {
			System.out.println("¦¦");
		}else if(count == 1) {
			System.err.println("¦");
		}else {
			System.out.println(num);
		}
		
	}
}