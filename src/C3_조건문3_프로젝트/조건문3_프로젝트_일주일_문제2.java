package C3_���ǹ�3_������Ʈ;

import java.util.Random;

public class ���ǹ�3_������Ʈ_������_����2 {
	/*
	 * [����]
	 * 
	 *  [���� ���߱�]
	 *  
	 * 	�̹��� 1���� �������̶�� �Ҷ�, 
	 *  �������� 1~31�� �����ϰ� �ش� ���� ����Ѵ�. 
	 *  
	 *  ��) 3�� ==> �ݿ���
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(31)+1;
		
		int week = 7;
		if(r%week == 1) {
			System.out.println(r+"��"+" "+"������");
		}
		else if(r%week == 2) {
			System.out.println(r+"��"+" "+"�����");
		}
		else if(r%week == 3) {
			System.out.println(r+"��"+" "+"�ݿ���");
		}
		else if(r%week == 4) {
			System.out.println(r+"��"+" "+"�����");
		}
		else if(r%week == 5) {
			System.out.println(r+"��"+" "+"�Ͽ���");
		}
		else if(r%week == 6) {
			System.out.println(r+"��"+" "+"������");
		}
		else if(r%week == 0) {
			System.out.println(r+"��"+" "+"ȭ����");
		}
	}
}
