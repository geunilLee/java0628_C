package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_�ִ밪_���� {

	/*
	 * [����]
	 *	�ִ밪 ���ϱ�
	 * 1. ���� 3���� �Է¹޴´�.
	 * 2. �Է¹��� 3���� ���� ���Ѵ�.
	 * 3. ���� ū ��(MAX)�� ����Ѵ�.
	 */
	public static void main(String[] args) {		
			
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("����1 �Է�");
		a = scan.nextInt();
		System.out.println("����2 �Է�");
		b = scan.nextInt();
		System.out.println("����3 �Է�");
		c = scan.nextInt();
		int max= a;
		if(max<b) {System.out.println(max=b);}
		if(max<c) {System.out.println(max=c);}
		System.out.println("max : " + max);
		
}
}
