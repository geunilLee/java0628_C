package C4_���ǹ�4_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_������Ʈ_�����ڱ�ȣ_���� {
	/*
	 * [����]
	 * 
	 * 	[������ ��ȣ ���߱� ����]
	 * 1. 1~10 ������ ���� ���� 2���� a�� b�� ���� �����Ѵ�. ��) a = 3 , b = 4 
	 * 
	 * 2. 1~4 ������ ���� ���� 1���� op�� �����Ѵ�.  ��) op = 3
	 * 
	 * 3. op�� ����  ������ ��ȣ�� �ش�ȴ�. ��) op�ǰ��� 3�̸� ���ϱ� �̴�.
	 * 	  [1] + [2] - [3] * [4] % 
	 * 
	 * 4. ȭ�鿡 ���ڵΰ��� ���� ����Ѵ�.(��, ��ȣ�� ����ϸ�ȵȴ�.)
	 *    �׸��� �Ʒ� ������ ���⸦ ����Ѵ�.
	 * ��) 
	 * 		3 ? 4  = 12
	 *    	[1] + [2] - [3] * [4] % 
	 *    
	 * 5. ����ڴ� ��ȣ�� ���߸�ȴ�. ��) 3 ==> ����
	 *    
	 *  �ƽ��Ե� ���� ������ ���ü��ִ�. ������ �����Ұ����ϰ�, ���Ŀ� ���������ϴ�.  
	 
	  �������� �ΰ�
	  op 1���� 4
	  �����ȣ ��Ʈ
	  �������� ��
	 */
	
	public static void main(String[] args) {	
		 Random ran = new Random();
		 Scanner scan = new Scanner(System.in);
		 int a = ran.nextInt(10)+1;
		 int b = ran.nextInt(10)+1;
		// int op = ran.nextInt(4)+1;
		 int op = 1;
		 int ���ϱ� = 1;
		 int ���� = 2;
		 int ���ϱ� = 3;
		 int ������ = 4;
		 
		 if(op == ���ϱ�) {
			 op = a+b;
			// System.out.printf ("%d ? %d = %d\n", a, b);
			 System.out.println("[1] + [2] - [3] * [4] %");
			 int c = scan.nextInt();
			 if(c == ���ϱ�) {
				 System.out.println("����");
			 }
			 else{
				 System.out.println("����");
			 }
		 }
		 
//		 else if(op == ����) {
//			 System.out.printf ("%d ? %d = %d\n", a, b);
//			 System.out.println("[1] + [2] - [3] * [4] %");
//			 int c = scan.nextInt();
//			 if(c == ����) {
//				 System.out.println("����");
//			 }
//			 else{
//				 System.out.println("����");
//			 }
//		 }
//		 else if(op == ���ϱ�) {
//			 System.out.printf ("%d ? %d = %d\n", a, b);
//			 System.out.println("[1] + [2] - [3] * [4] %");
//			 int c = scan.nextInt();
//			 if(c == ���ϱ�) {
//				 System.out.println("����");
//			 }
//			 else{
//				 System.out.println("����");
//			 }
//		 }
//		 else if(op == ������) {
//			 System.out.printf ("%d ? %d = \n", a, b);
//			 System.out.println("[1] + [2] - [3] * [4] %");
//			 int c = scan.nextInt();
//			 if(c == ������) {
//				 System.out.println("����");
//			 }
//			 else{
//				 System.out.println("����");
//			 }
//		 }			 
		 }	
	}
