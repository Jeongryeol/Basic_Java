package chapter03_Control_Statement.partB_Looping_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
		1. 제어문 중 반복문 while문의 기본형태를 이해합니다.
		2. while문의 작동 원리를 이해합니다.
		3. while문의 조건식과 실행블럭은 생략될수 없으며,
			조건식은 boolean타입으로 반복여부를 판단합니다.
		
*****************************************************************

	<<while문의 기본형태>>

		while(조건식) {
			조건식이 '참'일 동안 계속 반복할 실행문;
		}
	
*****************************************************************/

public class Step04_while {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("[알림] 로켓이 발사 카운트다운을 시작합니다.");
		while(true) {
			System.out.println("          "+ a-- +"...");
			if(a==-1) {
				System.out.println("------< WARNING >-------");
				break;
			}
		}
		System.out.println("[알림] 로켓이 발사되었습니다.");
	}
	
}
