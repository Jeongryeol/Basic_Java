package chapter02_Operator;

/****************************************************************

@author Jeongryeol Lee
@date	2018.07.11
@classGoal
	1. 연산자의 종류와 우선순위를 이해한다
	2. 각 연산자의 결합규칙을 이해한다.
	3. 이 단계에서 비교연산자와 논리연산자를 이해한다.

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

public class Step02_operators {
	
	/*선언부*/
	int numA = 4;
	int numB = 8;
	int numC = 0;
	
	/*생성자*/
	//인스턴스 변수를 선언할때 호출된다 정도로만 이해합니다
	public Step02_operators() {
		calculate();
	}
	
	/*사용자정의메소드*/
	//계산을 실행하는 메소드
	public void calculate() {

		//비교연산자
		System.out.println("\n========[비교연산자 테스트]========");
		numA = 4;
		numB = 8;
		numC = 12;
		System.out.println("numA<numB : "+(numA<numB));	// 비교연산자의 반환값은 boolean이다 (참 true / 거짓 false)
		System.out.println("numC>=numB :"+(numC>=numB));
		System.out.println("numA==4 : "+(numA==4));
		System.out.println("numB!=8 : "+(numB!=8));
		
		
		
		//논리연산자
		System.out.println("\n========[논리연산자 테스트]========");
		boolean boolA;
		boolA = false;
			//참고 :지역변수는 반드시 초기화해야하지만, 선언과 초기화를 따로할 수 있다.
			//전역변수의 경우 선언만 해도 자동 기본값으로 초기화된다.
		
		//OR연산자[ A|B ] : A 또는 B 하나라도 참이면 참, 양쪽 다 거짓이어야 거짓 
		boolA = (numA*numB <= numC) | (++numA*--numB >= numC*2);
			//왼쪽항  4*8 <= 12 : false
			//오른쪽항 5*7 >= 12*2 : true
			//boolA = false | true : true
		System.out.println("OR연산자 테스트 [ | ] : "+boolA);
		
		//AND연산자[ A&B ] : A 과 B 하나라도 거짓이면 거짓, 양쪽 다 참이어야 참 
		boolA = (numA*numB <= numC) & (++numA*--numB >= numC*2);
		//왼쪽항  5*7 <= 12 : false
		//오른쪽항 6*6 >= 12*2 : true
		//boolA = false & true : false
		System.out.println("OR연산자 테스트 [ & ] : "+boolA);
		
		
		
		//논리연산자 step2
		//조건문,반복문 등에 빈번히 사용되는 연산자는 아래 연산자이다.
		System.out.println("\n========[논리연산자 테스트 2단계]========");
		//OR연산자[ A||B ] : A 가 참이면 B를 연산하지 않고 참, A가 거짓이면  B를 연산해서 참거짓 판별, B가 참이면 참
		/*차이점 : 둘다 양쪽이 거짓이어야 거짓이라는 점은 동일하지만
				A가 참이면 B의 연산이 진행되지 않는다는 점에서 연산순서 및 양이 달라서 속도에서 차이가 발생한다.*/
		boolA = (numA*numB >= numC) || (++numA*--numB >= numC*2);
			//왼쪽항  4*8 >= 12 : true
			//오른쪽항 연산진행하지않음
			//boolA = false | true : true
		System.out.println("OR연산자 테스트 [ || ] : "+boolA);
		
		//AND연산자[ A&B ] : A가 참이면 B를 연산하여 참거짓 판별, B가 참이면 참, A가 거짓이면 B를 연산하지 않음 
		/*차이점 : 둘다 양쪽이 참이어야 참이라는 점은 동일하지만
				A가 거짓이면 B의 연산이 진행되지 않는다는 점에서 연산순서 및 양이 달라서 속도에서 차이가 발생한다.*/
		boolA = (numA*numB <= numC) & (++numA*--numB >= numC*2);
		//왼쪽항  5*7 <= 12 : false
		//오른쪽항 연산진행하지않음
		//boolA = false & true : false
		System.out.println("OR연산자 테스트 [ && ] : "+boolA);
		
		System.out.println("\n<<중요>>||와 &&는 코드의 처리속도와 반복문의 연산량에 영향을 미친다.");
		System.out.println("이는 메모리 자원과 부하에 연관되기 때문에 매우 중요한 개념이므로 이해하길 적극권장한다.");
		
	}
	
	/*메인메소드*/
	public static void main(String[] args) {
		//인스턴스변수 선언으로 자기자신을 인스턴스화함
		Step02_operators instVar = new Step02_operators();
	}
}
