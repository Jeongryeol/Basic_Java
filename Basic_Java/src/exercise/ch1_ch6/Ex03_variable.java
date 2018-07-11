package exercise.ch1_ch6;

/****************************************************************
	
	@author Jeongryeol Lee
	@date	2018.07.11
	@classGoal
		1.	클래스변수(멤버변수,전역변수)는 선언만 해도 자동 초기화된다.(타입별 초기화:26번 문장)
		2.	로컬변수(자동변수,지역변수)는 선언후 초기화한 뒤에 사용할 수 있다.
		3.	변수는 사용되기전에 반드시 초기화과정을 거친다.(전역변수는 JVM이 자동초기화)
		
 *****************************************************************/

public class Ex03_variable {

	
    public static void main(String args[]){
    	
        String s;						//지역변수 선언이후 초기화하지 않은 상태
    //  System.out.println("s = " + s);	//초기화되지않은 상태로 사용했으므로 컴파일에러 발생
        	   s = "Hello!";			//올바른 코드로 만들기 위해서 추가해야하는 과정 : 초기화
        System.out.println("s = " + s);

        /*	단, 전역변수에서 선언만 했을 경우에는 컴파일에러는 발생하지 않는다.
			왜냐하면, 전역변수에서는 선언 후 초기화하지 않은 선언을
			JVM이 default값을 자동으로 설정하기 때문이다.
			
			전역변수 타입별 기본값(Default값)
			- int/long 타입 : 0
			- double/float 타입 : 0.0
			- boolean 타입 : false
			- String 타입   : null
			- Class 타입 : null
		*/
    }
}
