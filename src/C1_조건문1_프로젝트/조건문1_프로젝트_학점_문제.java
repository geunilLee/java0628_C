package C1_���ǹ�1_������Ʈ;

import java.util.Scanner;

public class ���ǹ�1_������Ʈ_����_���� {
	Scanner scan = new Scanner(System.in);
	/*
	 * [����]
	 * 
	 * 	[����]
	 * 	���������� �Է¹޴´�. 
	 * 	���������� �ش��ϴ� ������ ����Ͻÿ�.
	 * 	�Ʒ��� ����ǥ�̴�.
	 * 		100~91 �̸� A����,
	 * 		90~81  �̸� B����,
	 * 		80���ϴ� "�����"
	 * 		
	 * 		��, �����̰ų�, A������ B������ ���� �ڸ��� 7���̻��̸� + �߰��Ͻÿ�.
	 * 		A������ B������ ���� �ڸ��� 3�������̸� - �߰��Ͻÿ�.
	 * 
	 * 	��) 
	 * 		100 => A+
	 *     	87 ==> B+
	 *     	82 ==> B-
	 *     	23 ==> �����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("�������Է��Ͻÿ�.");
		int a = scan.nextInt();
		
		if(a>=97 && a<=100 ) {
			System.out.println("a+");
		}
		if(a >= 94 && a <= 96) {
			System.out.println("a");
		}
		if(a <= 93 && a >=91 ) {
			System.out.println("a-");
		}
		
		if(a>=87 && a<= 90 ) {
			System.out.println("b+");
		}
		if(a <= 86 && a >= 84) {
			System.out.println("b");
		}
		if(a <= 83 && a >=81 ) {
			System.out.println("b-");
		}


		if(a<= 80 ) {
			System.out.println("�����");
		}
		if(a > 100 || a < 0) {
			System.out.println("����");
		}
	

	}
}