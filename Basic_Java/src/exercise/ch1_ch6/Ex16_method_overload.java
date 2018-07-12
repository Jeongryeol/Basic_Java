package exercise.ch1_ch6;

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

public class Ex16_method_overload {

	    public void setVar(int a, int b, float c) {}

	/*  Which two overload the setVar method ? (choose two) */
		
	    //a.Overload method
		private void setVar(int a, float c, int b) { }
	
		//b.접근제어자만 변경된 같은 메소드이므로 컴파일 에러 발생
	//	protected void setVar(int a, int b, float c) { }             
		
		//c.Overload method
		public int setVar(float c, int a, int b) {return a;}
	
		//d.파라미터의 타입과 순서가 기존메소드와 일치하므로, 기존메소드와 같은 것으로 인식함. 컴파일에러 발생.
	//	public int setVar(int a, int b, float c) {return a;}
		
		//e.리턴타입자리에 final을 선언할 수 없고, 리턴타입도 float으로 선언하지 않았음. 컴파일에러 발생.
	//	protected final setVar(int a, int b, float c) {return c;}

}
