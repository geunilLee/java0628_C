package C2_���ǹ�2_������Ʈ;

import java.util.Scanner;

public class ���ǹ�2_������Ʈ_����������_���� {
	/*
	 * [����]
	 * 		[����(0) ����(1) ��(2) ����]
	 * 1. player1 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
	 * 2. player2 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
	 * 3. ����,����,���� �������ڷδ� ǥ���Ҽ������Ƿ�  0,1,2 ���ڷ� ���ǥ���Ѵ�.
	 * 4. player1�� player2�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
	 */
	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);
		System.out.println("�÷��̾� 1�� ���� [1] ���� [2] �� [3] ���ڸ��Է��Ͻÿ�");
		int a = scan.nextInt();
		System.out.println("�÷��̾� 2�� ���� [1] ���� [2] �� [3] ���ڸ��Է��Ͻÿ�");
		int b = scan.nextInt();
		
		
		if(a == 1 && b == 2) {
			System.out.println("�����ϴ�.");			
		}
		else if(a == 1 && b == 3) {
			System.out.println("�̰���ϴ�.");
			
		}else if(a == 2 && b == 1) {
			System.out.println("�̰���ϴ�.");
		}
		
		else if(a == 2 && b == 3) {
			System.out.println("�����ϴ�.");
		}
		else if(a == 3 && b == 1) {
			System.out.println("�����ϴ�.");
		}
		else if(a == 3 && b == 2) {
			System.out.println("�̰���ϴ�.");
		}
		else if(a == b) {
			System.out.println("�����ϴ�.");
		}
		
		
	}
}