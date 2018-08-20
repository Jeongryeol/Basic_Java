package chapter04_Array.partA_SingleArray;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.24
	@classGoal
		1. 배열의 선언방법을 이해합니다.
		2. 배열의 구조와 각 방의 값을 입력(초기화)하는 방식을 이해합니다.
		3. 배열이 가지는 2가지 한계를 이해합니다.
		
*****************************************************************

	배열은 같은 타입으로 각 방이 한번에 구성되는 자료구조입니다.
	
	배열의 방에 담기는 타입과 배열의 타입은 같아야합니다.
	배열의 방은 0번부터 시작합니다.
	
	초기화 직후의 방은 모두 비어있기 때문에 초기값으로 설정되게됩니다.
		 		String[]의 초기값은 null입니다.
		 		int[]의 초기값은 0입니다.
	
	배열은 자료를 저장할때 다음과 같은 한계를 가집니다.
	( 1.같은 타입만 담을 수 있다. 2.배열의 크기변경이 불가능하다 ) 
	
	<<배열의 선언>>
	
	TYPE[] arrayName = new TYPE[n]; //n은 방의 개수
		또는
	TYPE arrayName[] = new TYPE[n]; //n은 방의 개수
	
*****************************************************************/

public class Step01_array {

	public static void main(String[] args) {
		
		//int타입 배열은 int타입만 담을 수 있습니다.
		int[] intArr = {10,20,30,40,50};
		
		System.out.println("=============[[ TEST-1 ]]==============");
		System.out.println("intArr = "+intArr+"\n▶▶배열을 호출하면 배열의 주소번지를 호출합니다.");
		System.out.println("intArr[0] = "+intArr[0]);
		System.out.println("intArr[1] = "+intArr[1]);
		System.out.println("intArr[2] = "+intArr[2]);
		System.out.println("intArr[3] = "+intArr[3]);
		
		//String타입은 문자 타입만 담을 수 있습니다.
		String strArr[] = {"문자열만","담을 수 있는","String타입 배열","방이 4개가 생성되었네요"};
		
		System.out.println("--------------------------------------");
		System.out.println("strArr = "+strArr+"\n▶▶배열을 호출하면 배열의 주소번지를 호출합니다.");
		System.out.println("strArr[0] = "+strArr[0]);
		System.out.println("strArr[1] = "+strArr[1]);
		System.out.println("strArr[2] = "+strArr[2]);
		System.out.println("strArr[3] = "+strArr[3]);
		
	}

}
