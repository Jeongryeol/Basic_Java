package chapter02_Operator;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.11
	@classGoal
		1. 연산자의 종류와 우선순위를 이해한다
		2. 각 연산자의 결합규칙을 이해한다.
		3. 이 단계에서는 삼항연산자와 대입연산자를 이해한다.
	
*****************************************************************

	<<연산자의 종류>>
		결합규칙이 없는것은 →, 우선순위가 높을수록 상위표시
	
		1. 단항연산자[←] ++  --  +  -  ~  !  (type)
		2. 산술연산자 	 *(곱하기) /(나누기:몫) %(나누기:나머지)
		 			 + -
		 			 << >>
		3. 비교연산자	 <  >  <=  >=  ==(같은가?)  !=(다른가?) 
		4. 논리연산자	 &  ^  |  &&  ||
		5. 삼항연산자	 _?_:_
		6. 대입연산자[←] =  +=  -=  *=  /=  %=  <<=  >>=  &=  ^=  |=

		본 챕터에서는 주요한 연산자만 다룰 것이므로,
		상기개념을 이해하고 코딩하면서 자주 사용되는 연산자를 보도록 한다.

*****************************************************************/

public class Step03_operators {

	/*선언부*/
	int numA = 4;
	int numB = 8;
	String answer;
	boolean bool;
	
	/*생성자*/
	//인스턴스 변수를 선언할때 호출된다 정도로만 이해합니다
	public Step03_operators() {
		calculate();
	}
	
	/*사용자정의메소드*/
	//계산을 실행하는 메소드
	public void calculate() {
		//삼항연산자
		//기본꼴  [  A ? B : C  ] A의 결과값(반환값)이 참이면 B를, 거짓이면 C를 반환하는 연산자
		System.out.println("=====[삼항연산자 테스트]=====");
		
		answer = (numA-numB==0)?"0인가봐요":"0은 아닌가봐요";
		System.out.println("answer : "+answer);
		
		bool = (numA>3)?true:false;
		System.out.println("bool : "+bool);
		
		System.out.println("\n=====[대입연산자 테스트]=====");
		numA = 5; //5로 초기화
		System.out.println("현재 numA 값(1) : "+numA);
		numA += 2; //기존값에 2를 더한 값
		System.out.println("현재 numA 값(2) : "+numA);
		numA -= 1; //기존값에 1을 뺀 값
		System.out.println("현재 numA 값(3) : "+numA);
		numA *= 9; //기존값을 9로 곱한 값
		System.out.println("현재 numA 값(4) : "+numA);
		numA /= 3; //기존값을 3으로 나눈 몫
		System.out.println("현재 numA 값(5) : "+numA);
		
	}
	
	/*메인메소드*/
	public static void main(String[] args) {
		//인스턴스변수 선언으로 자기자신을 인스턴스화함
		Step03_operators instVar = new Step03_operators();
	}
	
}
