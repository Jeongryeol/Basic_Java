package chapter03_Control_Statement.partA_Conditional_Statement;

import java.util.Random;

/****************************************************************

@author Jeongryeol Lee
@date	2018.07.17
@classGoal
	1. ���ǹ� switch�� �ߺ����� ���� �� �ִ�.
	2. ���ǹ��� Ż��(�ߴ�)�ϴ� break�� ���ǹ��� �̸��� �ٴ� label(��)�� �����Ѵ�.

*****************************************************************

	<<break ������ label(��)�� ����>>
	
	1. label(��)�� ����� �̸��� �ο��ϴ� ����� �Ѵ�. 
	2. break�� ����� ������ Ż��(�ߴ�)�Ѵ�.
	 	- break;���� ������ ��쿡 ���� ����� ����� Ż���Ѵ�.
	 	- break �󺧸�;�� ��� �ش� �̸��� ����� Ż���Ѵ�.
	
*****************************************************************/

public class Step05_switch {

	public static void main(String[] args) {
		
		String snack1 = "�������";
		String snack2 = "���ڰ���";
		String snack3 = "�������";
		
		/*�ܺ� switch��*/
		outter://��
		switch (snack1) {
			case "�������":
				System.out.println(snack1+"�� Ȯ���߽��ϴ�. [outter switch��]");
				/*���� switch��*/
				inner://����
				switch(snack2) {
					case "���ڰ���":
						System.out.println(snack2+"�� Ȯ���߽��ϴ�. [inner swtich��]");
					default :
						//break�� �����Ƿ� case "���ڰ���"�� ���๮ ���ķ� �Ʒ��� ���������� �����
						System.out.println("<�˸�>outter switch������ �����մϴ�.");
						break outter;//�ܺ� switch���� ������
				}
			case "���ڰ���":
				System.out.println("�� ������ ������� �ʽ��ϴ�.");
			case "�������":
				System.out.println("�� ������ ������� �ʽ��ϴ�.");
			default :
				System.out.println("�� ������ ������� �ʽ��ϴ�.");
		}
		//break outter; ���� JVM�� ������ ���� ��ġ�� �̰�
		System.out.println(snack3+"�� Ȯ���߽��ϴ�. [switch�� �ܺ�]");
		
	}
	
}
