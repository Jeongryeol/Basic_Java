package chapter03_Control_Statement.partB_Looping_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
		1. ��� �� �ݺ��� while���� �⺻���¸� �����մϴ�.
		2. while���� �۵� ������ �����մϴ�.
		3. while���� ���ǽİ� ������� �����ɼ� ������,
			���ǽ��� booleanŸ������ �ݺ����θ� �Ǵ��մϴ�.
		
*****************************************************************

	<<while���� �⺻����>>

		while(���ǽ�) {
			���ǽ��� '��'�� ���� ��� �ݺ��� ���๮;
		}
	
*****************************************************************/

public class Step04_while {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("[�˸�] ������ �߻� ī��Ʈ�ٿ��� �����մϴ�.");
		while(true) {
			System.out.println("          "+ a-- +"...");
			if(a==-1) {
				System.out.println("------< WARNING >-------");
				break;
			}
		}
		System.out.println("[�˸�] ������ �߻�Ǿ����ϴ�.");
	}
	
}
