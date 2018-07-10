package chapter01_variable;

public class Step02_static_nonStatic {
	/*선언부*/
	//내 필통엔 5자루의 한정판 볼펜이 담겨있습니다.
	String	pen = "한정판 볼펜";
	int		penNum = 5;
	
	/*사용자정의메소드*/
	//친구의 필통에 펜을 담아봅시다
	public void putPens() {
		String fPen = "친구의 볼펜";
		int fPenNum = 3;
		System.out.println("친구의 필통에는 '"+fPen+"'이 "+fPenNum+"자루를 담았다.");
	}
	
	/*메인메소드*/
	/** 메인메소드는 static영역으로 제일먼저 실행된다.
	 * 	non-static영역의 전역변수와 메소드들은 2가지 방법으로 접근할 수 있다
	 * 		1) static 타입으로 선언하여 호출 (비권장, 최하단 별첨주석 참조)
	 * 		2) 인스턴스 변수로 선언하여 호출		
	 **/
	public static void main(String[] args) {
		//자기자신을 인스턴스변수 선언(non-static영역 접근)
		Step02_static_nonStatic ss = new Step02_static_nonStatic();		
		//insert here :: 나의 필통에 담겨진 볼펜의 종류와 개수를 출력합시다.
		System.out.println("나의 필통에는 '"+ss.pen+"'이 "+ss.penNum+"자루가 들어있다.");
		//insert here :: 친구의 필통에 펜을 몇개 담았는지 출력합시다.
		ss.putPens();
		
	}
	
/**********************************************************************
 
<<static메서드에서 non-static메서드나 전역변수(멤버변수)로 접근할 수 없는 이유>>
	
	static관련자료가 non-static자료보다 먼저 생성되기 때문이다.
	
	static 자료를 남발하면, 사용되지 않는 변수가 프로그램이 종료될 때 까지 잔류하기 떄문에
	memory overflow현상 등의 문제를 초래하게 되므로 static 선언은 상당한 주의를 필요로 한다.
	(잔류하는 이유는 하단의 메모리 생명주기 참조)


<<Java 메모리 구조 >>
	[JVM(자바가상머신,Java Virtual Machine)의 역할]
		개발자(developer)가 입력된 코드(code, high level language)를
		JVM(자바가상머신)이 기계어(low level language)로 변환하고 반대과정도 수행한다.
		이 과정을 컴파일(complie)이라고 한다.
	
	[Text Area]
		JVM이 컴파일하여 컴퓨터 프로그램이 이해하는 row-level언어가 저장되는 영역
	
	[Method Area-실행순서1,3]
		프로그램 실행중에 어떤 클래스가 사용되면 JVM은 bin파일내부의 해당 *.class파일을 읽어서 분석하고
		클래스에 대한 정보(클래스 데이터)를 이곳에 저장하고, 클래스 변수(전역변수)도 이곳에 저장된다.
	
	[Static Area-실행순서2]
		프로그램 실행부터 모든 인스턴스에 접근가능한 클래스 차원에서 정의된 전역적 성격의 필드
		프로그램이 종료되는 가장 마지막에 반환된다.
	
	[Heap Area-실행순서4]
		프로그램 실행중에 생성되는 모든 인스턴스를 관리하는 메모리영역(non-static영역)
		new 예약어를 통해서 인스턴스 필드가 생성되고, 인스턴스를 참조하였던
	
	[Stack Area-실행순서5]::메소드 실행시 생성되는 변수(지역변수, 로컬변수, 자동변수)가 저장되는 메모리영역
		메소드가 실행하면 지역변수가 생성되고 종료되면 그 자원이 반환되므로
		프로그램 순서 상 가장 먼저 반환되는 영역이다.
		그러므로 지역변수로 선언하면 다른 메소드나 클래스에서는 사용할 수 없다.
	 
***********************************************************************/
}
