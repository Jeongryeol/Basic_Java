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

public class Step01_array {

	public static void main(String[] args) {
		
		//intŸ�� �迭�� intŸ�Ը� ���� �� �ֽ��ϴ�.
		int[] intArr = {10,20,30,40,50};
		
		System.out.println("=============[[ TEST-1 ]]==============");
		System.out.println("intArr = "+intArr+"\n�����迭�� ȣ���ϸ� �迭�� �ּҹ����� ȣ���մϴ�.");
		System.out.println("intArr[0] = "+intArr[0]);
		System.out.println("intArr[1] = "+intArr[1]);
		System.out.println("intArr[2] = "+intArr[2]);
		System.out.println("intArr[3] = "+intArr[3]);
		
		//StringŸ���� ���� Ÿ�Ը� ���� �� �ֽ��ϴ�.
		String strArr[] = {"���ڿ���","���� �� �ִ�","StringŸ�� �迭","���� 4���� �����Ǿ��׿�"};
		
		System.out.println("--------------------------------------");
		System.out.println("strArr = "+strArr+"\n�����迭�� ȣ���ϸ� �迭�� �ּҹ����� ȣ���մϴ�.");
		System.out.println("strArr[0] = "+strArr[0]);
		System.out.println("strArr[1] = "+strArr[1]);
		System.out.println("strArr[2] = "+strArr[2]);
		System.out.println("strArr[3] = "+strArr[3]);
		
	}

}
