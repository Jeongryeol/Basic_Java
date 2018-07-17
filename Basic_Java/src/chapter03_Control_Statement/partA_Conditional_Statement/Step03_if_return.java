package chapter03_Control_Statement.partA_Conditional_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
	1. ���ǹ� if�� �ߺ����� ���� �� �ִ�.
	2. ���ǹ��� ��� Ż���ϸ� �޼ҵ嵵 �Բ� �����ϴ� ����� return �н��Ѵ�.
	
 ****************************************************************
	
	<<return ������� ����>>
	
	1. ��� �� ���ǹ� if�� ������ �ߴ��Ѵ�.
	2. ���ÿ� �۵��ϰ� �ִ� �޼ҵ带 �ߴ��Ѵ�.(���Ͽ� ���� ��ü��Ʈ���� �ٷ� ����)
	
*****************************************************************/

public class Step03_if_return {

	public static void main(String[] args) {
		//���� Ÿ���� �ѹ��� �ʱ�ȭ �� �� �ִ�.
		String himName = "ö��", herName = "����";
		int himAge = 22, herAge = 20;
		
		/*�ܺ� if��*/
		if( himAge > herAge ) {	// 22 > 20
			//printf : ������ ������ ������� ���� �Է� print�����
			// %s : ����(String)
			// %d : 10����(digit)
			// %c : �ܾ�(Charactor type/ex.A)
			// %n : �ٹٲٱ� (=\n)
			System.out.printf("%s�� %s���� ���̰� %d�� ����.\n",himName,herName,himAge-herAge);
			
			/*��ø ����if��*/
			if( --himAge == ++ herAge) {// 21 == 21
				System.out.println("1����..");
				System.out.println("2����..");
				return;
			}
			System.out.println("�� ���� ���Ĵ� ������� �ʽ��ϴ�.");
			System.out.println("3����..");
			System.out.println("4����..");
		}
		System.out.println("�� ���嵵 ������� �ʽ��ϴ�."
		   + "return ���� main�޼ҵ带 ������ױ� �����Դϴ�.");
	}
	
}
