package C3_���ǹ�3_������Ʈ;

import java.util.Random;

public class ���ǹ�3_������Ʈ_����Ǹ���_���� {
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
		int ����ġ = 9; 
		int bonus = 6;
		
		if(a == b) {
			System.out.println("a b ����"+ a+b);
			System.out.println(����ġ + bonus + a+b);
			����ġ = (����ġ + bonus) + (a+b) ;
			if(����ġ >= 14 && ����ġ <= 16) {
				System.out.println("������ ���� �ֻ����� �ٽô�������");
				 a = ran.nextInt(6)+1;
				 b = ran.nextInt(6)+1;
				
				if(a+b <= 6) {
					System.out.println("0���� �̵�");
				}
				if(a+b>=7) {
					System.out.println("���Ƽ ����");					
				}
			}
			if(����ġ >= 20) {
				System.out.println("�¸�");
			}
		}
		else if(a != b) {
			System.out.println("a b �ٸ�"  + ((a+b)+����ġ));
			����ġ = ����ġ +(a+b) ;
			System.out.println(����ġ);
			if(����ġ >= 14 && ����ġ <= 16) {
				System.out.println("������ ���� �ֻ����� �ٽô�������");
				 a = ran.nextInt(6)+1;
				 b = ran.nextInt(6)+1;
				
				if(a+b <= 6) {
					System.out.println("0���� �̵�");
					����ġ = 0;
				}
				if(a+b>=7) {
					System.out.println("���Ƽ ����");					
				}
			}
			if(����ġ >= 20) {
				System.out.println("�¸�");
			}
		}
			System.out.println(a);
			System.out.println(b);
			System.out.println("���� ����ġ : " + ����ġ);
		}
	}