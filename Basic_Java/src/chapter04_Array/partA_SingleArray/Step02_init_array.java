package chapter04_Array.partA_SingleArray;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.24
	@classGoal
		1. �迭�� �������� �����մϴ�.
		2. �迭�� ������ �� ���� ���� �Է�(�ʱ�ȭ)�ϴ� ����� �����մϴ�.
		3. �迭�� ������ 2���� �Ѱ踦 �����մϴ�.
		
*****************************************************************

	�迭�� ���� Ÿ������ �� ���� �ѹ��� �����Ǵ� �ڷᱸ���Դϴ�.
	
	�迭�� �濡 ���� Ÿ�԰� �迭�� Ÿ���� ���ƾ��մϴ�.
	�迭�� ���� 0������ �����մϴ�.
	
	�ʱ�ȭ ������ ���� ��� ����ֱ� ������ �ʱⰪ���� �����ǰԵ˴ϴ�.
		 		String[]�� �ʱⰪ�� null�Դϴ�.
		 		int[]�� �ʱⰪ�� 0�Դϴ�.
	
	�迭�� �ڷḦ �����Ҷ� ������ ���� �Ѱ踦 �����ϴ�.
	( 1.���� Ÿ�Ը� ���� �� �ִ�. 2.�迭�� ũ�⺯���� �Ұ����ϴ� ) 
	
	<<�迭�� ����>>
	
	TYPE[] arrayName = new TYPE[n]; //n�� ���� ����
		�Ǵ�
	TYPE arrayName[] = new TYPE[n]; //n�� ���� ����
	
*****************************************************************/

public class Step02_init_array {

	public static void main(String[] args) {
		
		//�����ʱ�ȭ
		int intA=11, intB=22, intC=33, intD=44;
		String banana="�ٳ���", orange="������", peach="������";
		
		System.out.println("=============[[ TEST-2 ]]==============");
		/* �迭�� �����Ҷ� ���� ũ�⸦ �����ϰ�, �� �濡 ���� ���߿� ���� �� �ֽ��ϴ�. */
		int[] intArr2 = null;//����� �ʱ�ȭ �� �� �� �ֽ��ϴ�.
		intArr2 = new int[4];//���� �����ϱ⸸ �� �� �ֽ��ϴ�.
		//�ʱ�ȭ�ص� ������Ÿ���� �迭�� �� �濡 ���� �� �ֽ��ϴ�.
		intArr2[0] = intA;
		intArr2[1] = intB;
		intArr2[2] = intC;
		intArr2[3] = intD;
		
		//���� �����ؼ�,
		String[] strArr2 = new String[4];
		//�� ���� �ʱ�ȭ�Ҷ�, �ʱ�ȭ���� ���� ���� ����ְ� �˴ϴ�.
		strArr2[0] = banana;
		strArr2[1] = orange;
		strArr2[2] = peach;
		
		System.out.println("intArr2 = "+intArr2+"\n�����迭�� ȣ���ϸ� �迭�� �ּҹ����� ȣ���մϴ�.");
		System.out.println("intArr2[0] = "+intArr2[0]);
		System.out.println("intArr2[1] = "+intArr2[1]);
		System.out.println("intArr2[2] = "+intArr2[2]);
		System.out.println("intArr2[3] = "+intArr2[3]);
		System.out.println("--------------------------------------");
		System.out.println("strArr2 = "+strArr2+"\n�����迭�� ȣ���ϸ� �迭�� �ּҹ����� ȣ���մϴ�.");
		System.out.println("strArr2[0] = "+strArr2[0]);
		System.out.println("strArr2[1] = "+strArr2[1]);
		System.out.println("strArr2[2] = "+strArr2[2]);
		System.out.println("strArr2[3] = "+strArr2[3]+"\n�����ʱ�ȭ���� ���� ���� �⺻���� null(intŸ�Թ迭�� 0)�Դϴ�.");

	}
	
}
