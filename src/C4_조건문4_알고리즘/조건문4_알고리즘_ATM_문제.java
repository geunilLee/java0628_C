package C4_���ǹ�4_�˰���;

import java.util.Scanner;

public class ���ǹ�4_�˰���_ATM_���� {
	/*
	 * [����] 
	 * 
	 * [ATM]
	 *  
	 *   [��������]
	 *   cash ==> �������ִ� ������ ǥ���Ѵ�.
	 *   balance ==> ������ ǥ���Ѵ�.
	 *   joinId ==> �̹� ������ ���̵�
	 *   joinPw ==> �̹� ������ �н�����
	 *  
	 *   [Ư�̻���] ==>  �α��� ���Ŀ� ���ο� �޴��� �������� �Ѵ�.
	 *   
	 *   	[1.�α���] 
	 *  	    [1-1. �α��μ���] ==> ���ο�Ŵ����� ==> [1.�Ա�] [2.���] 	                
	 *              [1-1-1.�Ա�] ==> �Աݱݾ��� ���� �Է¹޴´�. ������ �پ��� ������ �þ��.
	 *              [1-1-2.���] ==> ��ݱݾ��� ���� �Է¹޴´�. ������ �پ��� ������ �þ��.
	 *  		[1-2. �α��ν���] ==> ����
	 *  	[0.����]
	 *  
package C4_���ǹ�4_�˰���;

import java.util.Scanner;

public class ���ǹ�4_�˰���_ATM_���� {
	/*
	 * [����] 
	 * 
	 * [ATM]
	 *  
	 *   [��������]
	 *   cash ==> �������ִ� ������ ǥ���Ѵ�.
	 *   balance ==> ������ ǥ���Ѵ�.
	 *   joinId ==> �̹� ������ ���̵�
	 *   joinPw ==> �̹� ������ �н�����
	 *  
	 *   [Ư�̻���] ==>  �α��� ���Ŀ� ���ο� �޴��� �������� �Ѵ�.
	 *   
	 *   	[1.�α���] 
	 *  	    [1-1. �α��μ���] ==> ���ο�Ŵ����� ==> [1.�Ա�] [2.���] 	                
	 *              [1-1-1.�Ա�] ==> �Աݱݾ��� ���� �Է¹޴´�. ������ �پ��� ������ �þ��.
	 *              [1-1-2.���] ==> ��ݱݾ��� ���� �Է¹޴´�. ������ �پ��� ������ �þ��.
	 *  		[1-2. �α��ν���] ==> ����
	 *  	[0.����]
	 *  
	 *   [��������� ����Ͻÿ�]
	 *  
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;    
		int balance = 30000; 
		int joinId = 11111; 
		int joinPw = 1234;  
	
		System.out.println("===MEGA ATM===");
		System.out.println("[1.�α���] [0.����]");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("���̵� �Է��Ͻÿ�. : ");
			int joinId1 = scan.nextInt();
			System.out.println("��й�ȣ�� �Է��Ͻÿ�. : ");
			int joinPw2 = scan.nextInt();
			if(joinId == joinId1 && joinPw == joinPw2) {
				System.out.println("�α��μ���");
				System.out.println("1. �Ա�, 2. ���");
				int sel = scan.nextInt();
				if(sel == 1) {
					System.out.println("�ݾ����Է��Ͻÿ�");
					int �� = scan.nextInt();
					System.out.println("����ݾ� : " + (cash+��));
				} else if(sel == 2){
					System.out.println("�ݾ����Է��Ͻÿ�");
					int �� = scan.nextInt();
					if(��<=cash){
						System.out.println("����ݾ� : " + (cash-��));
						}
					else{
						System.out.println("�̳׶��̺����մϴ�.");
					}
				}
			} else {
					System.out.println("�α��ν���");
		    	}
		}else if (select == 0) {
			System.out.println("����");
		}

	}
}