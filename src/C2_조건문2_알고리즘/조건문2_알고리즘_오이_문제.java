 package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_����_���� {
	/*
  	[����]
  	
  	 	 ��Ʈ���� ���̸� 3���� ��� 1500���� �Ǹ��Ѵ�.
	 	 ���̰� 14�� �ʿ��ϴ�. 
	 	 �ʿ��� �ݾ��� ����Ͻÿ�.
	 	 ��, ���̴� �������θ� �Ǹ��Ѵ�.

 */
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("�ʿ��� ���̰�����?");
	int �ʿ��ѿ��̰��� = scan.nextInt();
	int ���� = 3;
	int ���� = �ʿ��ѿ��̰���/����;
	
	if(�ʿ��ѿ��̰���%���� > 0) {
		���� = ���� +1;
	
	}
	
		System.out.println(����*1500);
		
		
		
		
	}
}