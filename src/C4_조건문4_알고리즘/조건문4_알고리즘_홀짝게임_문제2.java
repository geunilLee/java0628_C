package C4_���ǹ�4_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�4_�˰���_Ȧ¦����_����2 {
	/*
	 * [����]
	 * 
	 * 	[Ȧ¦ ����]
	 * 
	 * 1. 1~10���� ������ �������� �Ѱ��� ���ڸ� �����Ѵ�.
	 * 2. ������ ���ڰ� [1.Ȧ��][2.¦��] ���� ���ߴ°����̴�.
	 */		
	public static void main(String[] args) {
		
		 Random ran = new Random();
		 Scanner scan = new Scanner(System.in);
	
			 int r = ran.nextInt(10)+1;
		 
			 System.out.println("[1.Ȧ��][2.¦��]");
			 int sel = scan.nextInt();
			 
			 if(sel == 2 && r%2 == 0) {
			 System.out.println("��������(¦) : " + r);
			 System.out.println("����");
			 }
			else if(sel == 1 && r%2 != 0) {
			 System.out.println("��������(Ȧ) : " + r);
			 System.out.println("����");
			}
			else {
				System.out.println(r);
			 System.out.println("����");
			}
	
		 
	}
}