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

public class Ex12_equals {

	public static void main(String[] args) {
		
		int i = 5;
		Integer ig = new Integer(5);
		String s = new String("5");
		String u_id = "test";
	
		if(i==5) {	// 원시형타입이 반환하는 값과 숫자값이 같은지를 반환
			System.out.println("원시형 변수의 값과 숫자값을 비교한다.");
			System.out.println("호출할때 반환한 값 5와 숫자값 5가 같아서 이 문장들이 출력된다.");
		}
		System.out.println("\n==========================================\n");

//		if(i==s) {	// 원시형 타입과 클래스 타입은 같이 비교불가함. ( 급이 같아야 비교가능 )
		
		if(i==ig) {	// 아래 참조
			System.out.println("기본적으로 원시형 타입과 클래스타입은 비교불가");
			System.out.println("	왜냐하면 원시형 타입의 변수는 값을 반환하지만");
			System.out.println("	클래스타입은 참조형 타입이기 때문에 주소번지를 반환함");
			System.out.println("	즉, 값과 주소번지라는 비교대상이 잘못된 문법오류 발생\n");
			
			System.out.println("그러나! Integer는 WrapperClass로 JVM이 자동형전환을 진행함!");
			System.out.println("따라서 int타입 5와 int로 형전환한 Interger변수의 값 5를 비교함");
			System.out.println("값이 서로 5로 같기때문이 위 문장부터 여기까지가 출력되도록 수행함\n");
		}
		
		System.out.println("==========================================\n");
		
		if(u_id.equals("test")) {//대상1.equals(대상1) 각 주소번지가 가르키는 값을 나타냄
			System.out.println("원시형 변수(int타입 등 숫자를 담는 변수들과 boolean타입)과");
			System.out.println("String타입 변수를 호출하면 값을 출력하기때문에");
			System.out.println("상기 구문에서 대상1의 값에 대하여 대상2의 값을 비교한다.");
			
			System.out.println("\n이와 달리 참조형 변수(인스턴스 변수 등)는 Object클래스에서 출발하므로");
			System.out.println("생성된 모든 객체는 주소번지를 가지기 때문에, 호출하면 주소번지를 출력한다.");
		}
	
	}
}
