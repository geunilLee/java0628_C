package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_������_���� {
	/*
	 * [����]
	 *  ������ ����
	 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
	 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
	 * ��)	3 x 7 = ?
	 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
	 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
	 */
	
	public static void main(String[] args) {		
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int a = scan.nextInt();
		
		System.out.println("����2�� �Է��Ͻÿ�");
		int b = scan.nextInt();
		
		System.out.printf ("%d*%d",a, b);
		int c = scan.nextInt();
	
		if(a*b == c) {System.out.println("����");}
		if(a*b != c) {System.out.println("��");}
		
		
	}
}