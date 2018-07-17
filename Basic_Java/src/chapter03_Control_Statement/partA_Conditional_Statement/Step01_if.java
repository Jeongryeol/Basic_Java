package chapter03_Control_Statement.partA_Conditional_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
		1. ��� �� ���ǹ� if�� �۵���İ� �⺻���� �����Ѵ�.
		2. ���ǽ��� booleanŸ���� true|false�� �۵��ȴ�.
		
*****************************************************************

	<<body({})�� ���� if���� ����>>

	if( ���ǽ� : true|false ) ���๮;
	
	���ǹ��� ���� �� ������ ���๮�� ���Ͽ� ��( {} )�� �������� �ʾ�����,
	���� ���� ������ �����ݷ�(;)������ �ϳ��� ������ �Ͽ� ���϶� �����ϵ��� ������
	
*****************************************************************/

public class Step01_if {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		int c = 0;
		boolean isTrue = true;

		System.out.println("===========[ if ]===========");
		if(isTrue) {//���ǹ��� ���϶� ������ ����
			System.out.println("if���� ���ǽ��� ���Դϴ�.");
			c = a-b;
			System.out.println("a - b = "+c);
		}
		
		System.out.println("\n==========[ else ]==========");
		if(!isTrue) {//���ǹ��� ���϶� ������ ����
			System.out.println("���ǹ��� �����̹Ƿ� �� ������ ������� �ʽ��ϴ�");
		}
		else {//���ǹ��� �����϶� ������ ����
			System.out.println("���ǹ��� �����̹Ƿ� �� ������ ��µ˴ϴ�.");
			System.out.println("�ʱ�ȭ�� c�� : "+c);
		}
		
		System.out.println("\n=======[���� ���� if��]=======");
		if(true) System.out.println("�� ������ ��µ˴ϴ�.");
	}
	
}
