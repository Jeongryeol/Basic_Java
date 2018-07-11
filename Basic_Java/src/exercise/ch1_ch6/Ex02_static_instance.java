package exercise.ch1_ch6;

/****************************************************************
	
	@author Jeongryeol Lee
	@date	2018.07.11
	@classGoal
		1.	static영역은 non-static영역의 변수 및 메소드에 접근할 수 없다.
				접근을 위해서는 1)static으로 선언되거나
						 2)인스턴스변수로 선언하여 호출하여야 한다.
		2.	main메소드는 가장 먼저 실행되는 static 메소드이다.
		3.	static 선언은 클래스급(전역레벨)에서만 가능하다.
		4.	후위증감연산자(i++)은 단위구문실행이 모두 끝난 후에 1증가한다. 
		5.	메소드의 리턴값과 변수의 초기화의 관계를 이해한다.[34번 문장]
		
 *****************************************************************/

public class Ex02_static_instance {
    
	//인스턴스변수로 호출된 이후 실행
	public int aMethod(){
	//  static int i=0; //지역변수에서는 static을 붙일 수 없다. ( 전역변수에서만 가능 )
		int i=0; 		//올바르게 고친것.
        i++;			//22번 문장 실행후 i값 1 증가
        return i;		//1을 반환
    }
    
	//먼저실행
	public static void main(String[] args){
		//non-static영역의 aMethod()를 접근하기위해 자기자신을 인스턴스변수로 선언
		Ex02_static_instance test = new Ex02_static_instance();
        //인스턴스변수 내부에 위치한 메소드 실행
		test.aMethod();
		//인스턴스변수로 다시한번 호출하고, 해당 메소드의 리턴값을 새로운 변수 j에 선언한 동시에 초기화
		int j = test.aMethod();
			//리턴값인 int타입 i=1이다.
			//왜그럴까? 지역변수i가 메소드 내부에서 다시 초기화되어서 사용되었으므로 i=1을 리턴받아 j에 담김
		System.out.println(j);//그러므로 1 출력
    }
	
}
