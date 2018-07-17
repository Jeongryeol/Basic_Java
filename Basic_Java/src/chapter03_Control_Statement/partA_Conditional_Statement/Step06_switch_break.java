package chapter03_Control_Statement.partA_Conditional_Statement;

import java.util.Random;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
		1. switch���� break���� ���������� ���ȴ�.
		2. Ư�������� �����Ͽ� �Ʒ� ������ Ȯ���Ѵ�.
			�ϳ��� ���ǰ��� �����Ǵ� ���ǰ��� ���� ������ ������ ������ ��� break
			�ٸ� ���뵵 �����ؾ��ϴ� ��� break����
	
*****************************************************************/

public class Step06_switch_break {

	public static void main(String[] args) {
		
		System.out.println("===========[switch + break]===========");
		
		/* 10�������� ������ �Ű��� ��Ʈ�ǿ� ��Ʈ�� ������ ������ ��´ٰ� �Ҷ� */ 
		System.out.println("[�˸�]10�����ϰ� �Ű��� ��Ʈ�ǿ� ��Ʈ�� �����ϴ�.");
		Random r = new Random();
		int getPoint = r.nextInt(10);
		
		/* �Ʒ� switch������ break;�� �ּ�ó���ϰ� �����ϸ� ��� ����Ǵ��� Ȯ���Ͻÿ�. */
		System.out.println("[�˸�]��Ʈ�� ������ Ȯ���մϴ�.");
		switch(getPoint) {
			case 1:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 2:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 3:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 4:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 5:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 6:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 7:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 8:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			case 9:	System.out.println("[�˸�]"+getPoint+"�� �Դϴ�."); break;
			default:System.out.println("[�˸�]"+getPoint+"�� �Դϴ�.");
		}
		
		
		
		
		System.out.println("\n==========[switch / no break]=========");
		/*	� ȸ�������ý��ۿ� ������ ����� �Ϲ�ȸ��/�Խ��ǰ�����/��ü������ �� �����������
		 *	�� ������ ����й�Ǿ���Ѵ�. �̸� switch���� ���� ������ �� �ִ�.*/
		final int grade_master = 1;//��ü�������� ���
		final int grade_board  = 2;//�Խ��ǰ������� ���
		final int grade_newbie = 3;//����ȸ���� ���
		int grade = 0;		 //����� ���� ����
		
		/*	�Ʒ� �ּ��� �ٲپ�� if���� switch���� �۵��� Ȯ���Ͻÿ�.*/
		grade = grade_newbie;
		//grade = grade_board;
		//grade = grade_master;
		
		if(grade==1) {
			System.out.println("[�˸�1]��ü�������� ��޺ο��� �����մϴ�.");
		}else if(grade==2) {
			System.out.println("[�˸�1]�Խ��ǰ������� ��޺ο��� �����մϴ�.");
		}else if(grade==3) {
			System.out.println("[�˸�1]����ȸ���� ��޺ο��� �����մϴ�.");
		}
		
		switch(grade) {
			case 1:
				giveDeleteMember();	//ȸ������������ �ο�
				System.out.println("[�˸�2]ȸ������������ �ο��Ǿ����ϴ�.");
			case 2:
				giveDeletePost();	//�Խñۻ������Ѻο�
				System.out.println("[�˸�2]�Խñۻ��������� �ο��Ǿ����ϴ�.");
			case 3:
				giveWritePost();	//�Խñ��ۼ����Ѻο�
				System.out.println("[�˸�2]�Խñ��ۼ������� �ο��Ǿ����ϴ�.");
		}
		
	}
	//ȸ���� �����ϴ� ����� ���ٰ� ������ �޼ҵ�
	public static void giveDeleteMember() {}
	//�Խñ��� �����ϴ� ����� ���ٰ� ������ �޼ҵ�
	public static void giveDeletePost() {}
	//�Խñ��� �ۼ��ϴ� ����� ���ٰ� ������ �޼ҵ�
	public static void giveWritePost() {}
}
