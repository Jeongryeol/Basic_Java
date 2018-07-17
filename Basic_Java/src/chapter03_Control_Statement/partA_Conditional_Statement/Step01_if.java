package chapter03_Control_Statement.partA_Conditional_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
		1. 제어문 중 조건문 if의 작동방식과 기본꼴을 이해한다.
		2. 조건식은 boolean타입의 true|false로 작동된다.
		
*****************************************************************

	<<body({})가 없는 if문의 구성>>

	if( 조건식 : true|false ) 실행문;
	
	조건문이 참일 때 실행할 실행문에 대하여 블럭( {} )이 지정되지 않았을때,
	가장 먼저 만나는 세미콜론(;)까지를 하나의 단위로 하여 참일때 실행하도록 구분함
	
*****************************************************************/

public class Step01_if {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		int c = 0;
		boolean isTrue = true;

		System.out.println("===========[ if ]===========");
		if(isTrue) {//조건문이 참일때 실행할 문장
			System.out.println("if문의 조건식이 참입니다.");
			c = a-b;
			System.out.println("a - b = "+c);
		}
		
		System.out.println("\n==========[ else ]==========");
		if(!isTrue) {//조건문이 참일때 실행할 문장
			System.out.println("조건문이 거짓이므로 이 문장은 실행되지 않습니다");
		}
		else {//조건문이 거짓일때 실행할 문장
			System.out.println("조건문이 거짓이므로 이 문장이 출력됩니다.");
			System.out.println("초기화된 c값 : "+c);
		}
		
		System.out.println("\n=======[블럭이 없는 if문]=======");
		if(true) System.out.println("이 문장이 출력됩니다.");
	}
	
}
