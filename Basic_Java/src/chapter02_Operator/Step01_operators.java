package chapter02_Operator;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.11
	@classGoal
		1. 연산자의 종류와 우선순위를 이해한다
		2. 각 연산자의 결합규칙을 이해한다.
		3. 이 단계에서는 단항연산자와 산술연산자를 이해한다.
	
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

public class Step01_operators {
	
	/*선언부*/
	int numA = 4;
	int numB = 8;
	int numC = 0;
	
	/*생성자*/
	//인스턴스 변수를 선언할때 호출된다 정도로만 이해합니다
	public Step01_operators() {
		calculate();
	}
	
	/*사용자정의메소드*/
	//계산을 실행하는 메소드
	public void calculate() {
		//단항연산자 1
		numA = -4;	//음수를 표현하는 [ - ]
		numB = -7;
		
		//단항연산자 2 :: 증감연산자 (전위 /후위)
		System.out.println("=====[단항연산자:증감연산자 테스트]=====");
		numA = 1;
		System.out.println(numA);
		System.out.println(numA++);//후위연산자는 값이 출력된 이후에 1을 증가시킨다
		System.out.println(numA);
		System.out.println(++numA);//전위연산자는 값이 표현되기전에 1을 증가시키고 출력한다
		System.out.println(numA);
		System.out.println("==[연산자가 들어간 곳의 변화를 관찰해보세요]==");
		
		//산술연산자 
		System.out.println("\n========[산술연산자 테스트]========");
		numC = numA + numB;
		System.out.println("4 + 8 = "+numC); // '+'은 덧셈을 뜻한다
		numC = numA - numB;
		System.out.println("4 - 8 = "+numC); // '-'은 뺄셈을 뜻한다
		numC = numA * numB;
		System.out.println("4 * 8 = "+numC); // '*'은 곱셈을 뜻한다
		numC = 10 / 3;
		System.out.println("10 / 3 = "+numC);// '/'는 나눗셈으로 얻은 몫을 반환한다
		numC = 10 % 3;
		System.out.println("10 % 3 = "+numC);// '%'는 나눗셈으로 얻은 나머지를 반환한다
	
	}
	
	/*메인메소드*/
	public static void main(String[] args) {
		//인스턴스변수 선언으로 자기자신을 인스턴스화함
		Step01_operators instVar = new Step01_operators();
	}
	
}
