package exercise.ch1_ch6;

/****************************************************************

	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
	1.	원시타입의 변수가 호출되었을때 반환하는 값은 "안에 담긴 값"이다.
			원시타입 : int/long/double/float/boolean
			
	2.	참조타입의 변수가 호출되었을때 반환하는 값은 "객체가 가진 주소번지"이다.
			참조타입 : 인스턴스변수(클래스급)/자료구조(배열,객체배열,컬렉션)/모든 오브젝트
			단, String은 문자를 담는 참조변수이지만, 예외적으로 값을 반환한다.
			
	3.	비교연산자 A==B의 각 A,B가 원시타입과 참조타입으로 일치되어 비교되어야하는 것을 이해한다.
			원시형타입일 때는 서로의 값을 비교하고,
			참조형 타입일때는 서로의 주소번지를 비교한다.
			(연산자는 Autoboxing없이 Wrapper Class도  주소번지를 비교한다.)
	
	4.	모든 객체가 상속받는 Object 클래스는 equals(Object obj)라는 메소드를 가지고 있고
			객체와 파라미터의 객체가 서로 같은지 비교하는 기능을 수행한다.
			이 두 객체가 원시타입 일때는 값과 값을 비교하여 같은 값인지를 반환하고,
			참조타입일때는 주소번지와 주소번지를 비교하여 같은 객체인지를 반환한다.
			(equals메소드에서 참조타입 변수가 Wrapper Class급 일때는
			JVM이 Autoboxing을 적용하여 원시타입으로 형전환한다)
	
******************************************************************/

public class Ex11_equals {

	public static void main(String[] args) {
		
		float f = 4.2f;
		Float g = new Float(4.2f);
		Double d = new Double(4.2);
/*
 		객체 g와 d는 오브젝트로, 객체 안에 값이 담겨있다.
		원래 객체를 호출하면 주소번지를 출력해야하지만,
		JVM이 원시타입을 생성하는 Wrapper Class를  사용해서
		자동 형전환하기 때문에, 주소번지대신 값이 출력됨
*/
		
		System.out.println("g : "+g);
						//autoboxing기능으로 float타입으로 자동형전환 됨.
		
		
		System.out.println(f==g);
						//true	: float타입의 값과 주소번지에 들어있는 float타입의 값을 비교함 true
		System.out.println(d==f);
						//false	: float타입의 값과 주소번지에 들어있는 double타입의 값을 비교함 false
		System.out.println(g==g);
						//true	: 타입이 같고 같은 주소값이므로 true (자기자신과 비교)
		System.out.println(d.equals(f));
						//false : double타입 4.2d와 float타입 4.2f 비교이므로 false
		System.out.println(d.equals(g));
						//false : double타입 4.2d와 float타입 4.2f 비교이므로 false
		System.out.println(g.equals(4.2));
						//false	: float타입 4.2와 (실수값의 defalut 타입인) double타입 4.2 비교이므로 false
			
	}

}
