package �׽�Ʈ0303_����;

public class ��������1 {
	public static void main(String[] args) {
		/*
		 * �ð� �׽�Ʈ 
		 * 
		 * 4000 �ʸ� �ð��� ����Ͻÿ�.
		 * 4000 �ʸ� �ð��� �����ϰ� �ʸ� ����Ͻÿ�.
		 * 4000 �ʸ� �ð��� �����ϰ� �и� ����Ͻÿ�.
		 * 
		 * 8000 �ʸ� �ð��� ����Ͻÿ�.
		 * 8000 �ʸ� �ð��� �����ϰ� �ʸ� ����Ͻÿ�.
		 * 8000 �ʸ� �ð��� �����ϰ� �и� ����Ͻÿ�.
		 * 
		 * 
		 * 123123 �ʸ� �ð��� ����Ͻÿ�.
		 * 123123 �ʸ� �ð��� �����ϰ� �ʸ� ����Ͻÿ�.
		 * 123123 �ʸ� �ð��� �����ϰ� �и� ����Ͻÿ�.
		 */
		
		int �ð� = 4000/3600;
		int �� = 4000%3600;
		int �� = 4000%3600/60;
		System.out.println("�ð� : " + �ð�);
		System.out.println("�� : " + ��);
		System.out.println("�� : " + ��);
		System.out.println();
		int a = 8000/3600;
		int b = 8000%3600;
		int c = 8000%3600/60;
		System.out.println("�ð� : " + a);
		System.out.println("�� : " + b);
		System.out.println("�� : " + c);
		System.out.println();
		int d = 123123/3600;
		int e = 123123%3600;
		int f = 123123%3600/60;
		System.out.println("�ð� : " + d);
		System.out.println("�� : " + e);
		System.out.println("�� : " + f);
		
	}
}