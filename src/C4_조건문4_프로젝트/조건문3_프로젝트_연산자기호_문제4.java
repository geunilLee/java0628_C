package C4_���ǹ�4_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_������Ʈ_�����ڱ�ȣ_����4 {
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
	 *  
	 */
	
	public static void main(String[] args) {	
		Random ran = new Random();
		Scanner scan= new Scanner(System.in);
		int ���ϱ� = 1;
		int ���� = 2;
		int ���ϱ� = 3;
		int ������ = 4;
		int c = 0;
		
		int a = ran.nextInt(10)+1;
		int b = ran.nextInt(10)+1;
		int op = ran.nextInt(4)+1;
		
		if(op == ���ϱ�) {
			c = a+b;
		}
		else if(op == ����) {
			c = a-b;
		}
		else if(op == ���ϱ�) {
			c = a*b;
		}
		else if(op == ������) {
			c = a%b;
		}
		System.out.printf ("%d ? %d = %d\n", a,b,c);
		System.out.println("[1] + [2] - [3] * [4] %");
		int sel = scan.nextInt();
		
		if(sel<1 || sel>4){
			System.out.println("����");
		}
		else if(op == sel) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		
	}
}