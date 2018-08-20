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

public class Step02_init_array {

	public static void main(String[] args) {
		
		//다중초기화
		int intA=11, intB=22, intC=33, intD=44;
		String banana="바나나", orange="오렌지", peach="복숭아";
		
		System.out.println("=============[[ TEST-2 ]]==============");
		/* 배열을 생성할때 방의 크기를 결정하고, 각 방에 값을 나중에 담을 수 있습니다. */
		int[] intArr2 = null;//비워서 초기화 할 수 도 있습니다.
		intArr2 = new int[4];//방을 생성하기만 할 수 있습니다.
		//초기화해둔 원시형타입을 배열의 각 방에 담을 수 있습니다.
		intArr2[0] = intA;
		intArr2[1] = intB;
		intArr2[2] = intC;
		intArr2[3] = intD;
		
		//방을 생성해서,
		String[] strArr2 = new String[4];
		//그 값을 초기화할때, 초기화하지 않은 방은 비어있게 됩니다.
		strArr2[0] = banana;
		strArr2[1] = orange;
		strArr2[2] = peach;
		
		System.out.println("intArr2 = "+intArr2+"\n▶▶배열을 호출하면 배열의 주소번지를 호출합니다.");
		System.out.println("intArr2[0] = "+intArr2[0]);
		System.out.println("intArr2[1] = "+intArr2[1]);
		System.out.println("intArr2[2] = "+intArr2[2]);
		System.out.println("intArr2[3] = "+intArr2[3]);
		System.out.println("--------------------------------------");
		System.out.println("strArr2 = "+strArr2+"\n▶▶배열을 호출하면 배열의 주소번지를 호출합니다.");
		System.out.println("strArr2[0] = "+strArr2[0]);
		System.out.println("strArr2[1] = "+strArr2[1]);
		System.out.println("strArr2[2] = "+strArr2[2]);
		System.out.println("strArr2[3] = "+strArr2[3]+"\n▶▶초기화하지 않은 방의 기본값은 null(int타입배열은 0)입니다.");

	}
	
}
