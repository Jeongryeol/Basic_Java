package chapter03_Control_Statement.partA_Conditional_Statement;
/****************************************************************

@author Jeongryeol Lee
@date	2018.07.17
@classGoal
	1. ��� �� ���ǹ� if�� �۵���İ� �⺻���� �����Ѵ�.
	2. ���ǽ��� booleanŸ���� true|false�� �۵��ȴ�.
	
*****************************************************************

	<<if���� ����>>

	if( ���ǽ�1 : true|false ) {
		���ǽ�1�� ��(true)�϶� ������ ����;
	} else if ( ���ǽ�2 : true|false ){
		���ǽ�1�� �����̸� else if�� ����
		���ǽ�2�� ��(true)�϶� ������ ����;
	} else {
		���ǽ�1,2 ��� �����϶� ������ ����;
	}
	
*****************************************************************/

public class Step02_if_else {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		boolean bool = false;
		
		if(a>b) {//true
			System.out.println("���ǹ��� ���̹Ƿ� �� ������ ����˴ϴ�");
			System.out.println("a = "+a);
		} else {
			System.out.println("���ǹ��� �����̹Ƿ� �� ������ ������� �ʽ��ϴ�.");
		}
		System.out.println("=================================");
		if(bool) {//false
			System.out.println("ù��° ���ǹ��� �����̹Ƿ� �� ������ ������� �ʽ��ϴ�");
		} else if(a>b) {
			System.out.println("ù��° ���ǹ��� �����̹Ƿ� �ι�° ���ǹ��� �Ǻ��մϴ�.");
			System.out.println("�ι�° ���ǹ��� ���̹Ƿ� �� ������ ����˴ϴ�");
			System.out.println("b = "+b);
		}
	}
	
	
}
