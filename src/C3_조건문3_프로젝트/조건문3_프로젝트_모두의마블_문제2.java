package C3_���ǹ�3_������Ʈ;

import java.util.Random;

public class ���ǹ�3_������Ʈ_����Ǹ���_����2 {
	/*
		[����]
		
		[����Ǹ������] 
		
		 - ö���� ���� ����Ǹ�������� �ϰ��ִ�.
		 - ������ 0 ~ 20���� �̵��Ҽ��ִ°Ÿ����ִ�.
		 - ���� ö���� �����̰� , ������ ��ġ�� 
		 - ���������κ���  9 ��ŭ �̵��ߴ�.		 
		 - 1 ~ 6�� ������ �ִ� �ֻ��� 2���� ������.
		 - �ֻ��� ������  �ո�ŭ �̵��Ѵ�. 
		 - ���� �̵��� ö���� ��ġ�� ����Ͻÿ�.
	
		 [����]
		 1) �� �ֻ��� ���ڰ� ���δٸ����� ������ġ����
		 		�ֻ������� �ո�ŭ �̵��Ѵ�. ��) 3, 5 ==> 8 ��ŭ�̵��Ѵ�.
	
		 2) �� �ֻ��� ���ڰ� ������� ���ʽ� �̵��Ÿ� 6 �߰��Ѵ�.
		      ��) 2 , 2  ==> 4 + 6 ��ŭ�̵��Ѵ�.
	
		 3) 14,15,16 ���� ��ġ�� ������ �ִ�. 
			  ������ �ɸ��� �ֻ���2���� �ٽ� ������ 
			  ������ 6�����̸� [�г�Ƽ] ó����ġ(0)�� �̵��Ѵ�.
	          ������ 7�̻��̸� ����Ż��[�г�Ƽ����]
	
		 4) 20 �̻��� ���� ������ "�¸�" �� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(6)+1;
		int b = ran.nextInt(6)+1;
		int c = ran.nextInt(6)+1;
		int d = ran.nextInt(6)+1;
		System.out.println("�ֻ����� �����ÿ�.");
		int ����ġ = 0;
		int ö�� = 9;
		int bonus = 6;
		if(a == b) {
			System.out.println(a);
			System.out.println(b);
			����ġ = ö��+a+b+bonus;
			System.out.println(����ġ);

		if(����ġ >= 14 && ����ġ <= 16) {
				System.out.println("������ �������ϴ�. �ֻ����� �ٽô����ÿ�.");
				a = ran.nextInt(6)+1;
				b = ran.nextInt(6)+1;
				if(a+b <= 6) {
					System.out.println("���Ƽ 0ĭ���� �̵�");
					����ġ = 0;
				}
				else if(a+b >= 7) {
					System.out.println("�г�Ƽ���� Ż�⼺��");
					System.out.println("����ġ : " + ����ġ);
				}
				
			}
		}
		
		
		if(a != b) {
			System.out.println(a);
			System.out.println(b);
			����ġ = ö��+a+b;
			System.out.println("����ġ : " + ����ġ);
		if(����ġ >= 14 && ����ġ <= 16) {
				System.out.println("������ �������ϴ�. �ֻ����� �ٽô����ÿ�.");
				System.out.println("�ι�° �ֻ��� 1" + c);
				System.out.println("�ι�° �ֻ��� 2" + d);
				if(a+b <= 6) {
					System.out.println("���Ƽ 0ĭ���� �̵�");
					����ġ = 0;
				}
				else if(a+b >= 7) {
					System.out.println("�г�Ƽ���� Ż�⼺��");
					System.out.println("����ġ : " + ����ġ);
				}
				
		}
		}
		if(����ġ >= 20) {
				System.out.println("�¸�");
		}
		
		
	}
}
