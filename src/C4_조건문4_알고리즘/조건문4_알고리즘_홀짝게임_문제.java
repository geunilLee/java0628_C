package C4_���ǹ�4_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�4_�˰���_Ȧ¦����_���� {
	/*
	 * [����]
	 * 
	 * 	[Ȧ¦ ����]
	 * 
	 * 1. 1~10���� ������ �������� �Ѱ��� ���ڸ� �����Ѵ�.
	 * 2. ������ ���ڰ� [1.Ȧ��][2.¦��] ���� ���ߴ°����̴�.
	 */		
	public static void main(String[] args) {		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Ȧ�� , 2. ¦�����Է��Ͻÿ�.");
		int ������� = scan.nextInt();
		
		Random ran = new Random();
		int �������� = ran.nextInt(10)+1;
		
		if(������� == 1) {
			if(��������%2 != 0) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
			} else if(������� == 2){
				if(��������%2 == 0) {
					System.out.println("����");
				} else {
					System.out.println("����");
				}
			} else {
				System.out.println("����");
			}
		System.out.println(��������);
	}
}