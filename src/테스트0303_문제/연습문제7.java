package �׽�Ʈ0303_����;

public class ��������7 {
	public static void main(String[] args) {
		/*
			�Ÿ�����
			
			[1] ö���� �ü� 3km �� �ӵ��� 37�а� �ɾ��. 
			    ö���� ���Ÿ��� ��km �ΰ�?
			    ö���� ���Ÿ��� ��m �ΰ�?
			    
			[2] ö���� 870���͸� 40�а� �ɾ��. 
				ö���� �ü��� ���ΰ�?
				ö���� �м��� ���ΰ�?
				
				
			1���� 3/60
			�ѽð��� 3km
		
		 */
		double �Ϻ� =0;
		
		
		�Ϻ� = 3/60.0;
		System.out.println("�Ϻе��Ȱ� km : " + �Ϻ� + "km");
		System.out.println("�Ϻе��Ȱ� m : " + �Ϻ�*1000 + "m");
		System.out.println("37�а� ���Ÿ��� : " + ((�Ϻ�*1000)*37) + "m" );
		System.out.println();
		�Ϻ� = 870/40.0;
		System.out.println("�Ϻе��Ȱ��Ÿ� : " + �Ϻ� + "m");
		System.out.println("�ü�" + ((�Ϻ�*60)/1000) + "km");
		System.out.println("�м�" + (�Ϻ�*60) + "m");
	}
}