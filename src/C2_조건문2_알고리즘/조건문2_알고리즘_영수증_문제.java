package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_������_���� {
	/*
	 * [����]
	 *  
	 * 	[������ ���]
	 * 1. �޴����� ����Ѵ�.
	 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
	 * 3. ������ �Է¹޴´�.
	 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
	 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
	 */
	public static void main(String[] args) {	
		
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		System.out.println("��ȣ�� �Է��Ͻÿ�");
		int ��ȣ = scan.nextInt();
		if (��ȣ==1) {
			System.out.println("������ �Է��Ͻÿ�");
			int �� = scan.nextInt();
			int �Ž����� = ��-price1;
			if(�Ž�����>=0) {
				System.out.println("����"+��);
				System.out.println("�Ұ�����" + price1);
				System.out.println("�Ž�����" + �Ž�����);}
			if(�Ž�����<0) {
				System.out.println("������ �����մϴ�.");
			}
			
		}
		
		if (��ȣ==2) {
			System.out.println("������ �Է��Ͻÿ�");
			int �� = scan.nextInt();
			int �Ž����� = ��-price2;
			if(�Ž�����>=0) {
				System.out.println("����"+��);
				System.out.println("����    ��" + price2);
				System.out.println("�Ž�����" + �Ž�����);}
			if(�Ž�����<0) {
				System.out.println("������ �����մϴ�.");
			}
			
		}
		
		if (��ȣ==3) {
			System.out.println("������ �Է��Ͻÿ�");
			int �� = scan.nextInt();
			int �Ž����� = ��-price3;
			if(�Ž�����>=0) {
				System.out.println("����"+��);
				System.out.println("��     ��" + price3);
				System.out.println("�Ž�����" + �Ž�����);}
			if(�Ž�����<0) {
				System.out.println("������ �����մϴ�.");
			}
			
		}
		
		if(��ȣ <1 || 3<��ȣ) {
			System.out.println("����");
		}
		
		
				
	}
}