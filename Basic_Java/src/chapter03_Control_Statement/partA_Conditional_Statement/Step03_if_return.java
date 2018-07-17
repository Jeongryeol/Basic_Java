package chapter03_Control_Statement.partA_Conditional_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
	1. 조건문 if는 중복으로 사용될 수 있다.
	2. 조건문을 즉시 탈출하며 메소드도 함께 종료하는 예약어 return 학습한다.
	
 ****************************************************************
	
	<<return 예약어의 역할>>
	
	1. 제어문 중 조건문 if의 진행을 중단한다.
	2. 동시에 작동하고 있는 메소드를 중단한다.(리턴에 대해 객체파트에서 다룰 예정)
	
*****************************************************************/

public class Step03_if_return {

	public static void main(String[] args) {
		//같은 타입은 한번에 초기화 할 수 있다.
		String himName = "철수", herName = "영희";
		int himAge = 22, herAge = 20;
		
		/*외부 if문*/
		if( himAge > herAge ) {	// 22 > 20
			//printf : 형식을 지정한 순서대로 값을 입력 print예약어
			// %s : 문자(String)
			// %d : 10진수(digit)
			// %c : 단어(Charactor type/ex.A)
			// %n : 줄바꾸기 (=\n)
			System.out.printf("%s가 %s보다 나이가 %d더 많다.\n",himName,herName,himAge-herAge);
			
			/*중첩 내부if문*/
			if( --himAge == ++ herAge) {// 21 == 21
				System.out.println("1년후..");
				System.out.println("2년후..");
				return;
			}
			System.out.println("이 문장 이후는 실행되지 않습니다.");
			System.out.println("3년후..");
			System.out.println("4년후..");
		}
		System.out.println("이 문장도 실행되지 않습니다."
		   + "return 예약어가 main메소드를 종료시켰기 때문입니다.");
	}
	
}
