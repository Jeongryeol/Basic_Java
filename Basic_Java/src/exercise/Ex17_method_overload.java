package exercise;

/****************************************************************

	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		리턴타입만을 변경한 것이 메소드 오버로드가 될 수 없는 이유 ??
		인스턴스 변수를 선언하여 클래스를 객체로 만들어 호출할때, 생성자가 동시에 호출되는데
		이때 파라미터가 똑같은 생성자가 리턴타입만 다르도록 2개가 존재하게되면 JVM입장에선 난감해진다.
		  
		Java에서 같은 이름의 메소드와 생성자를 여러개 개질 수 있을 때
		JVM이 메소드와 생성자를 서로 다르게 구분하는 기준은
		메소드 혹은 생성자의 이름과 그 파라미터의 변수타입과 순서라는 점을 알 수 있다.
	
******************************************************************/

public class Ex17_method_overload {

    private int x,y;
    private float z;
    public void setVar(int a, int b, float c){
        x=a;
        y=b;
        z=c;
    }
    
/**  which two overload the setVar method?(choose two)*/

    //a. [오답] 메소드 오버로딩은 그대로 가져와야함 (메소드형태, 타입, 파라미터) 
/*    void setVar(int a, int b, float c){
        x=a;
        y=b;
        z=c;
    }*/

    
    //b. [정답] 파라미터의 변수타입이 순서가 달라졌으므로 메소드 오버로딩 규칙을 준수함
    public void setVar(int a, float c, int b){  
    	setVar(a,b,c);
    }
    
    
    //c. [오답] 메소드 오버로딩은 그대로 가져와야함 (메소드형태, 타입, [파라미터])
/*    public void setVar(int a, float c, int b){
    	this(a,b,c);
    	//상기 코드의 에러사유 3가지
    	//첫번째 : 파라미터가 있는 생성자는 제공되지 않는다.( 디폴트생성자만 지원됨 )
    	//두번째 : this()생성자 호출구문은 반드시 생성자가 맨 처음에 와야한다.
    	//세번째 : 자기자신에 대한 생성자 호출(재귀호출)은 불가함
    }*/
  
    
    //d. [정답] 파라미터의 변수개수가 달라졌으므로 메소드 오버로딩 규칙을 준수함
    public void setVar(int a, float b){
    	x=a;
    	//y=b;//값은 같으나 타입이 다르기 때문에 문법에러
    }
    	
    
    //e. [오답] 메소드 오버로딩은 그대로 가져와야함 (메소드형태, 타입, [파라미터]) 
/*	  public void setVar(int ax, int by, float cz){
    	x=ax;
    	y=by;
    	z=cz;
    }*/

}
