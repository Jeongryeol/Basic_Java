package exercise;

/****************************************************************
	
	@author Jeongryeol Lee 
	@date	2018.07.11
	@classGoal
		1.	클래스변수(멤버변수,전역변수)는 선언만 해도 자동 초기화된다.(타입별 초기화:26번 문장)
		2.	로컬변수(자동변수,지역변수)는 선언후 초기화한 뒤에 사용할 수 있다.
		3.	변수는 사용되기전에 반드시 초기화과정을 거친다.(전역변수는 JVM이 자동초기화)
		
 *****************************************************************/

public class Ex03_static {
    
	private static int a;
	
    public static void main(String[] args){
        
    	modify(a);//메소드의 지역변수 a=1, 전역변수 a는 여전히 0
        System.out.println(a);//그러므로  출력0
        
        //만약 아래와 같다면?
        modify2(a);//메소드의 지역변수 a=0, 전역변수 a++이므로 1
        System.out.println(a);//그러므로  출력1
        
    }
    
    public static void modify(int a){
        a++;
    }
    
    //만약 아래와 같다면?
    public static void modify2(int a){
    	Ex03_static.a++;
    	//static 변수이므로 인스턴스화없이 주소번지.변수명 으로 호출가능
    	a++;
    	//주소번지를 입력하지 않은경우에,
    	//파라미터변수와 이름이 같을 경우에는 파라미터변수를 따라가고,
    	//파라미터변수와 이름이 다를 경우에는 스태틱변수를 따라간다.(스태틱은 무조건 전역에서만 선언가능)
    }
    
}
