package exercise.ch1_ch6;

/****************************************************************
	
	@author Jeongryeol Lee 
	@date	2018.07.11
	@classGoal
		1.	������� ���ǹ��� �ݺ����� �ִ�.
		2.	�� : ����� �̸��� ������ �� �ִ�. (���̸�:�ݺ���) 26������ Ȯ�� 
		3.	����� break; continue;�� ��Ʈ�� �۵��ؾ� ���ѹݺ��� ������ �� �ִ�.
		4.	break; ���� ����� ����� Ż���Ѵ�
		5.	break ���̸�; �󺧷� ������ ����� Ż���Ѵ�.
		6.	continue; ���� ����� ����� ���� �����ΰ��� �ش� ����� �ٽ� �ݺ��ϵ��� �Ѵ�.
		
 *****************************************************************/

public class Ex06_Loop_for {

	public static void main(String args[]){
	
		int i = 0;
		int j = 0;
		
		outer:
			for(i=1; i<3; i++){
				inner:
					for(j=1; j<3; j++) {
						if(j==2) {
							continue outer;
						//	break outer;
						//	continue inner;
						}
						System.out.println("Value are " + i + " " + j);
					}
			}
	
	}
	
}
