package chapter03_Control_Statement.partB_Looping_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
	1. ��� �� �ݺ��� for���� ��ø�� �� �ֽ��ϴ�.
	2. �ݺ����� ���ѹݺ��� �����մϴ�.
	3. ����� label(��)�� �� �� �ֽ��ϴ�.
	
	4. break�� [���� �����/������] ����� Ż���� �� �ֽ��ϴ�.
		- break;���� ������ ��쿡 ���� ����� ����� Ż���Ѵ�.
 		- break �󺧸�;�� ��� �ش� �̸��� ����� Ż���Ѵ�.
	
	5. continue�� [���� �����/������] �ݺ����� ���� ������ �̵��� �� �ֽ��ϴ�.
		- continue;���� ������ ��쿡 ���� ����� �ݺ����� ������ �̵��Ѵ�.
 		- continue �󺧸�;�� ��� �ش� �̸��� �ݺ����� ������ �̵��Ѵ�.
 		- �̵��� �� ����� ���ǽ��� ��/������ �Ǻ��ϸ� �ݺ����ΰ� ������.
 		- ��, break���� �޸� �ݺ��������� ��밡���ϰ�, �ݺ����� ����� ����
	
*****************************************************************/

public class Step02_for_break_continue {

	public static void main(String[] args) {
		
		int a = 0;
		/*�ܺ� �ݺ���*/
		outter:
		for(;;) {//���ѹݺ�
			/*���� �ݺ���*/
			inner:
			for(;;) {//���ѹݺ�
				System.out.println(a);
				a++;
				if(a==9) break outter;
			}
		}
		
		System.out.println("==[��ȭ����]==");
		/*�ڵ���ó :: �ڹ��� ���� 3rd Edition [���� �� ��]*/
		Loop1 : for(int i=2;i<=9;i++) {
			for (int j=1;j<9;j++) {
				if(j==5)
			/*�Ʒ��ּ��� �ϳ��� �����ϸ鼭 ��µ� ����� Ȯ���Ͻÿ�.*/	
			//	break Loop1;
			//	break;
			//	continue;
			//	continue Loop1;
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		
	}
	
}
