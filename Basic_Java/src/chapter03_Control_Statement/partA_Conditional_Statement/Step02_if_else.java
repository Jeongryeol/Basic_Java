package chapter03_Control_Statement.partA_Conditional_Statement;
/****************************************************************

@author Jeongryeol Lee
@date	2018.07.17
@classGoal
	1. 제어문 중 조건문 if의 작동방식과 기본꼴을 이해한다.
	2. 조건식은 boolean타입의 true|false로 작동된다.
	
*****************************************************************

	<<if문의 구성>>

	if( 조건식1 : true|false ) {
		조건식1이 참(true)일때 실행할 문장;
	} else if ( 조건식2 : true|false ){
		조건식1이 거짓이면 else if가 실행
		조건식2가 참(true)일때 실행할 문장;
	} else {
		조건식1,2 모두 거짓일때 실행할 문장;
	}
	
*****************************************************************/

public class Step02_if_else {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		boolean bool = false;
		
		if(a>b) {//true
			System.out.println("조건문이 참이므로 이 문장은 실행됩니다");
			System.out.println("a = "+a);
		} else {
			System.out.println("조건문이 거짓이므로 이 문장이 실행되지 않습니다.");
		}
		System.out.println("=================================");
		if(bool) {//false
			System.out.println("첫번째 조건문이 거짓이므로 이 문장은 실행되지 않습니다");
		} else if(a>b) {
			System.out.println("첫번째 조건문이 거짓이므로 두번째 조건문을 판별합니다.");
			System.out.println("두번째 조건문이 참이므로 이 문장은 실행됩니다");
			System.out.println("b = "+b);
		}
	}
	
	
}
