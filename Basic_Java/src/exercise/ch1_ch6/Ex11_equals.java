package exercise.ch1_ch6;

/****************************************************************

	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
	1.	����Ÿ���� ������ ȣ��Ǿ����� ��ȯ�ϴ� ���� "�ȿ� ��� ��"�̴�.
			����Ÿ�� : int/long/double/float/boolean
			
	2.	����Ÿ���� ������ ȣ��Ǿ����� ��ȯ�ϴ� ���� "��ü�� ���� �ּҹ���"�̴�.
			����Ÿ�� : �ν��Ͻ�����(Ŭ������)/�ڷᱸ��(�迭,��ü�迭,�÷���)/��� ������Ʈ
			��, String�� ���ڸ� ��� ��������������, ���������� ���� ��ȯ�Ѵ�.
			
	3.	�񱳿����� A==B�� �� A,B�� ����Ÿ�԰� ����Ÿ������ ��ġ�Ǿ� �񱳵Ǿ���ϴ� ���� �����Ѵ�.
			������Ÿ���� ���� ������ ���� ���ϰ�,
			������ Ÿ���϶��� ������ �ּҹ����� ���Ѵ�.
			(�����ڴ� Autoboxing���� Wrapper Class��  �ּҹ����� ���Ѵ�.)
	
	4.	��� ��ü�� ��ӹ޴� Object Ŭ������ equals(Object obj)��� �޼ҵ带 ������ �ְ�
			��ü�� �Ķ������ ��ü�� ���� ������ ���ϴ� ����� �����Ѵ�.
			�� �� ��ü�� ����Ÿ�� �϶��� ���� ���� ���Ͽ� ���� �������� ��ȯ�ϰ�,
			����Ÿ���϶��� �ּҹ����� �ּҹ����� ���Ͽ� ���� ��ü������ ��ȯ�Ѵ�.
			(equals�޼ҵ忡�� ����Ÿ�� ������ Wrapper Class�� �϶���
			JVM�� Autoboxing�� �����Ͽ� ����Ÿ������ ����ȯ�Ѵ�)
	
******************************************************************/

public class Ex11_equals {

	public static void main(String[] args) {
		
		float f = 4.2f;
		Float g = new Float(4.2f);
		Double d = new Double(4.2);
/*
 		��ü g�� d�� ������Ʈ��, ��ü �ȿ� ���� ����ִ�.
		���� ��ü�� ȣ���ϸ� �ּҹ����� ����ؾ�������,
		JVM�� ����Ÿ���� �����ϴ� Wrapper Class��  ����ؼ�
		�ڵ� ����ȯ�ϱ� ������, �ּҹ������ ���� ��µ�
*/
		
		System.out.println("g : "+g);
						//autoboxing������� floatŸ������ �ڵ�����ȯ ��.
		
		
		System.out.println(f==g);
						//true	: floatŸ���� ���� �ּҹ����� ����ִ� floatŸ���� ���� ���� true
		System.out.println(d==f);
						//false	: floatŸ���� ���� �ּҹ����� ����ִ� doubleŸ���� ���� ���� false
		System.out.println(g==g);
						//true	: Ÿ���� ���� ���� �ּҰ��̹Ƿ� true (�ڱ��ڽŰ� ��)
		System.out.println(d.equals(f));
						//false : doubleŸ�� 4.2d�� floatŸ�� 4.2f ���̹Ƿ� false
		System.out.println(d.equals(g));
						//false : doubleŸ�� 4.2d�� floatŸ�� 4.2f ���̹Ƿ� false
		System.out.println(g.equals(4.2));
						//false	: floatŸ�� 4.2�� (�Ǽ����� defalut Ÿ����) doubleŸ�� 4.2 ���̹Ƿ� false
			
	}

}
