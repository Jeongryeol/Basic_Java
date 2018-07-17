package chapter03_Control_Statement.partB_Looping_Statement;
/****************************************************************

@author Jeongryeol Lee
@date	2018.07.17
@classGoal
	1. 제어문 중 반복문 while문의 기본형태를 이해합니다.
	2. do while문의 작동 원리를 이해합니다.
	3. do while문의 조건식과 실행블럭은 생략될수 없으며,
		조건식은 boolean타입으로 반복여부를 판단합니다.
	4. do while문은 조건식의 판별하기전에 일단 실행블럭에 진입합니다.
	
*****************************************************************

	<<while문의 기본형태>>
	
		do {
			조건식이 '참'일 동안 계속 반복할 실행문;
		} while (조건식);

	최초 do문을 만나자마자 블럭({})에 진입한다.
	이때 조건식이 참이 아니더라도 do블럭은 반드시 1회 실행된다.
	왜냐하면 최초 do문을 만나는 과정에서는 조건식의 판별여부가 진행되지 않기 때문이다.
	최초1회 실행이후 조건식을 판단하여 do블럭을 다시 반복할지를 결정한다.
		
*****************************************************************/
public class Step05_do_while {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("[알림] 로켓이 발사 카운트다운을 시작합니다.");
		do {
			System.out.println("          "+ a-- +"...");
			if(a==-1) {
				System.out.println("------< WARNING >-------");
				break;
			}
		} while(true);//끝에 세미콜론(;)으로 문장을 마쳐주는 것을 잊으면 안됨!!
		System.out.println("[알림] 로켓이 발사되었습니다.");
	}
	
}
