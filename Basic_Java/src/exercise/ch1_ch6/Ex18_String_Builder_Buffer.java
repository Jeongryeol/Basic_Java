package exercise.ch1_ch6;

/****************************************************************
	
	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		문자열인 원본을 함께 변경하면서 효율적으로 작업할때는,
 		StringBuffer, StringBuilder 클래스를 사용한다.
 		
 		String은 문자를 한 덩어리로 관리하고, += 연산자로 덩어리에 문자를 붙여나가는 방식이지만,
 		대입연산자로 초기화 시켜주지 않으면 계속해서 객체를 생성하여 관리가 불편하다
 		
 		StringBuilder나 StringBuffer클래스는 문자의 낱말을 자리수대로 관리하고
 		appens()메서드로 추가하면서 원본을 갱신하기 때문에 메모리관리에 효율적이다.
		
 *****************************************************************/

public class Ex18_String_Builder_Buffer {

	public static void main(String[] args) {
		
		String s="Hello";
		s=s.toLowerCase() + " there";
		System.out.println(s + " my friend");
		
		//만약 아래와 같다면?
		s.toLowerCase();//String은 반드시 대입연산자를 사용해야만 원본문자열을 초기화할 수 있다.
		System.out.println(s + " my friend (만약의 경우)");//이 경우엔, toLowerCase메소드가 적용되지 않았음. 
		
	}

}
