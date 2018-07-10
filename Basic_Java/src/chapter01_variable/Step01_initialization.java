package chapter01_variable;
/****************************************************************
	  
	<<키워드>> :: 변수의 선언위치와 초기화
	  
	<<Java에 있어 변수란?>>
		해당 '값'을 '타입'에 맞춰서
		'이름'으로 '주소번지'를 부여해서'기억'하고
		기억된 데이터들을 '일괄처리'하기 위해서 고안된 기초 자료구조이다.
		
	<<자료구조의 발전순서>> :: ( 읽고 지나가도 좋습니다. )
		변수 ▶▶ 배열 ▶▶ 객체배열 ▶▶ 자료구조 ▶▶ 프레임워크 ▶▶ 스프링 
	  
*****************************************************************
	  
	<<전역변수(멤버변수)와 지역변수(로컬변수)>>
		1)선언만 해도 자동으로 초기화를 진행한다.
			지역변수는 반드시 초기화를 해주어야한다.
		2)전역변수로 선언되면 지역단위에서 사용가능하다.
			지역변수는 해당 지역을 벗어나면 사용할 수 없고 접근할 수 없다.
		3)전역변수를 static영역에서 사용하기 위해서는 아래 2가지 방법을 이용해야한다.
	  		a) static변수로 선언하기 (★★★2년차 이하 사용엄금/제일 아래 주석 참조★★★) 
	  		b) 전역변수가 있는 클래스를 인스턴스화 하여 호출하기
		4)전역변수를 지역에서 사용하기 위해서는 this(자기자신의 주소번지)를 이용해야한다.
	  
	<<전역변수와 지역변수의 사용기준>>
		이 지역을 벗어나서 계속 저장되어야 하는가? 	▶▶ 전역변수
		이 지역에서만 사용하고 기억할 필요가 없는가?	▶▶ 지역변수
	  
 ****************************************************************/
public class Step01_initialization {
	/*선언부*/
	//전역변수는 자동으로 초기화시켜준다. 하지만 가급적 초기화까지 함께 해주는 것을 추천한다.
	int		number;	//0 값으로 자동 초기화
	long	pi_l;	//0l 값으로 자동 초기화
	double	pi_d;	//0.0d 값으로 자동 초기화
	float	pi_f;	//0f 값으로 자동 초기화
	String	test;	//null 값으로 자동 초기화
	boolean	bool;	//false 값으로 자동 초기화	

	/*사용자정의메소드*/
	//전역변수를 초기화하는 메소드
	public void initialize() {
		this.number = 1026;			//int는 정수를 담을 수 있다.
		this.pi_l = 80099010230l;	//long은 int보다 더 큰 정수를 담을 수 있다.
		this.pi_d = 3.14;			//3.14d와 같다. (double이 기본형으로 더 큰집합)
		this.pi_f = 3.14f;			//3.14를 담을 수 없다. (float이 더 작은 집합)
	}
	//출력을 처리하는 메소드
	public void printVariables() {
		System.out.println("(int타입)		number	: "+number);
		System.out.println("(long타입) 	pi_l	: "+pi_l);
		System.out.println("(double타입)	pi_d	: "+pi_d);
		System.out.println("(float타입 )	pi_f	: "+pi_f);
		System.out.print("\n");
	}
	
	/*메인메소드*/
	//실행부
	public static void main(String[] args) {
		Step01_initialization in = new Step01_initialization();
		System.out.println("====[아래는 초기화 전 전역변수의 값]====");
		in.printVariables();
		System.out.println("====[아래는 초기화 후 전역변수의 값]====");
		in.initialize();
		in.printVariables();
		System.out.println("====[메엔메소드가 종료되었습니다.]====");
	}
	
}