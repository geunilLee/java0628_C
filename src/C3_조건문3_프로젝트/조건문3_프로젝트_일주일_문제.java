package C3_���ǹ�3_������Ʈ;

import java.util.Random;

public class ���ǹ�3_������Ʈ_������_���� {
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
		int day = ran.nextInt(31)+1;
		int week = day%7;
		System.out.println(day);
		if(week == 1) {
			System.out.println("������");
		}
		else if(week == 2) {
			System.out.println("�����");
		}
		else if(week == 3) {
			System.out.println("�ݿ���");
		}
		else if(week == 4) {
			System.out.println("�����");
		}
		else if(week == 5) {
			System.out.println("�Ͽ���");
		}
		else if(week == 6) {
			System.out.println("������");
		}
		else if(week == 7) {
			System.out.println("ȭ����");
		}
		
		
	}
}