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

public class Ex14_eqauls {

	public static void main(String args[]) {
		
		Integer s = new Integer(9);
		Integer t = new Integer(9);
		Long u = new Long(9);

		//Which tests would return true?
		//a.
		System.out.println(s.equals(t));
						//변수이름이 가르키는 주소번지의 내용물을 비교하므로 true
		//b.
		System.out.println(s.equals(new Integer(9)));
						//변수와 선언된 새객체의 내용물을 비교하므로 true
		//c.
		System.out.println(s.equals(9));
						//변수이름이 가르키는 주소번지의 내용물과 autoboxing으로 설정된 int타입의 9를 비교하므로 ture
		//d.
		System.out.println(s == t);
						//주소번지를 비교하는 ==의 경우 서로 다름 false
		//e.
//		System.out.println(s == u);
						//주소번지를 비교하는 ==의 경우, 서로 다른 타입을 비교할 수 없으므로 오류
	}
}
