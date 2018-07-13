package exercise;

/****************************************************************

	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		1.	다른 static타입이 먼저 있어도, main메소드가 가장 먼저 실행된다.
	    	먼저 실행되어도 static타입은 모두 메모리에 로딩되어 있기 때문에
	    	따로 인스턴스화 할 필요없이 어디에서든 사용할 수 있고 값이 유지된다.
	    	
	    2.	논리연산자의 연산순서를 이해하고 그 차이에 따른 증감연산자의 수행여부를 판단할 수 있다.
	
******************************************************************/

public class Ex10_static_operator {

    private static int j = 0;
    
    public static boolean methodB(int k){
        j += k;
        return true;
    }
    
    public static void methodA(int i){
        boolean b;				 //지역변수의 선언만 된 상태
        b = i < 10 | methodB(4); //지역변수를 초기화함
        	//[참] A|B는 A가 참이더라도 B가 참인지 논리를 따진다.
        	//즉, methodB(4);호출이 실행됨
        b = i < 10 || methodB(4);//지역변수를 또 초기화함 / 참
        	//[참] A||B는 A가 참이면 B가 참인지 논리를 따지지 않는다.
        	//즉, methodB(4);호출은 실행되지 않음
    }

    public static void main(String[] args){
        methodA(0);
        System.out.println(j);
    }

}
