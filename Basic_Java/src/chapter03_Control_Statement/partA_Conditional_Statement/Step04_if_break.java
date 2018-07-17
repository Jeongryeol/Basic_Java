package chapter03_Control_Statement.partA_Conditional_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
	1. ���ǹ� if�� �ߺ����� ���� �� �ִ�.
	2. ���ǹ��� Ż��(�ߴ�)�ϴ� break�� ���ǹ��� �̸��� �ٴ� label(��)�� �����Ѵ�.
	
****************************************************************
		
	<<break ������ label(��)�� ����>>
	
	1. label(��)�� ����� �̸��� �ο��ϴ� ����� �Ѵ�. 
	2. break�� [���� �����/������] �ݺ����� Ż���� �� �ֽ��ϴ�.
		- break;���� ������ ��쿡 ���� ����� ����� Ż���Ѵ�.
		- break �󺧸�;�� ��� �ش� �̸��� ����� Ż���Ѵ�.
	
*****************************************************************/

public class Step04_if_break {

	public static void main(String[] args) {
		//���� Ÿ���� �ѹ��� �ʱ�ȭ �� �� �ִ�.
		String himName = "ö��", herName = "����";
		int himAge = 22, herAge = 20;
		
		/*�ܺ� if��*/
		outter://��
		if( himAge > herAge ) {	// 22 > 20
			System.out.printf("%s�� %s���� ���̰� %d�� �� ����.\n",himName,herName,himAge-herAge);
			inner://��
			/*��ø ����if��*/
			if( --himAge == ++ herAge) {// 21 == 21
				System.out.println("1����..");
				System.out.println("2����..");
				/*��ø ����if�� ������ if��*/
				if(himName=="ö��")
					break inner;//inner if���� �ߴ���
				System.out.println("inner if���� �ߴܵǾ��� ������ �Ʒ��� 3������ ������� �ʽ��ϴ�.");
				System.out.println("3����..");
				System.out.println("4����..");
			}
			System.out.println("�� ������ ����˴ϴ�.");
		}
		System.out.println("�� ���嵵 ����˴ϴ�.");
	}
	
}
