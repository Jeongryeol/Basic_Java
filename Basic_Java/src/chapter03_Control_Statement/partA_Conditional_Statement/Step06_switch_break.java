package chapter03_Control_Statement.partA_Conditional_Statement;

import java.util.Random;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
		1. switch문과 break문은 선택적으로 사용된다.
		2. 특수예제를 참조하여 아래 내용을 확인한다.
			하나의 조건값에 대응되는 조건값에 대해 수행할 구문만 끝내는 경우 break
			다른 내용도 수행해야하는 경우 break제외
	
*****************************************************************/

public class Step06_switch_break {

	public static void main(String[] args) {
		
		System.out.println("===========[switch + break]===========");
		
		/* 10점이하의 점수가 매겨진 다트판에 다트를 던져서 점수를 얻는다고 할때 */ 
		System.out.println("[알림]10점이하가 매겨진 다트판에 다트를 던집니다.");
		Random r = new Random();
		int getPoint = r.nextInt(10);
		
		/* 아래 switch문에서 break;를 주석처리하고 실행하면 어떻게 실행되는지 확인하시오. */
		System.out.println("[알림]다트의 점수를 확인합니다.");
		switch(getPoint) {
			case 1:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 2:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 3:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 4:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 5:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 6:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 7:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 8:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			case 9:	System.out.println("[알림]"+getPoint+"점 입니다."); break;
			default:System.out.println("[알림]"+getPoint+"점 입니다.");
		}
		
		
		
		
		System.out.println("\n==========[switch / no break]=========");
		/*	어떤 회원관리시스템에 가입한 사람이 일반회원/게시판관리자/전체관리자 로 나누어질경우
		 *	그 권한은 차등분배되어야한다. 이를 switch문을 통해 구현할 수 있다.*/
		final int grade_master = 1;//전체관리자의 등급
		final int grade_board  = 2;//게시판관리자의 등급
		final int grade_newbie = 3;//신입회원의 등급
		int grade = 0;		 //등급을 담을 변수
		
		/*	아래 주석을 바꾸어가며 if문과 switch문의 작동을 확인하시오.*/
		grade = grade_newbie;
		//grade = grade_board;
		//grade = grade_master;
		
		if(grade==1) {
			System.out.println("[알림1]전체관리자의 등급부여를 진행합니다.");
		}else if(grade==2) {
			System.out.println("[알림1]게시판관리자의 등급부여를 진행합니다.");
		}else if(grade==3) {
			System.out.println("[알림1]신입회원의 등급부여를 진행합니다.");
		}
		
		switch(grade) {
			case 1:
				giveDeleteMember();	//회원삭제권한을 부여
				System.out.println("[알림2]회원삭제권한이 부여되었습니다.");
			case 2:
				giveDeletePost();	//게시글삭제권한부여
				System.out.println("[알림2]게시글삭제권한이 부여되었습니다.");
			case 3:
				giveWritePost();	//게시글작성권한부여
				System.out.println("[알림2]게시글작성권한이 부여되었습니다.");
		}
		
	}
	//회원을 삭제하는 기능이 담겼다고 가정할 메소드
	public static void giveDeleteMember() {}
	//게시글을 삭제하는 기능이 담겼다고 가정할 메소드
	public static void giveDeletePost() {}
	//게시글을 작성하는 기능이 담겼다고 가정할 메소드
	public static void giveWritePost() {}
}
