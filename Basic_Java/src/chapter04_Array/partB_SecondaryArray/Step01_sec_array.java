package chapter04_Array.partB_SecondaryArray;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.24
	@classGoal
		1. 2차배열의 선언방법을 이해합니다.
		2. 2차배열의 구조와 각 방의 값을 입력하는 방식을 이해합니다.
		3. 배열이 가지는 2가지 한계를 이해합니다.
		
*****************************************************************

	2차배열은 로우(가로행),컬럼(세로열)로 구성되는 테이블형태의 배열입니다.
	2차배열도 배열의 한계를 똑같이 가집니다.
	( 1.같은 타입만 담을 수 있다. 2.배열의 크기변경이 불가능하다 ) 
	
	<<2차 배열의 선언>>
	
	TYPE[][] arrayName = new TYPE[n][m]; //n은 로우의 개수, m은 컬럼의 개수
		또는
	TYPE arrayName[][] = new TYPE[n][m]; //n은 로우의 개수, m은 컬럼의 개수
	
*****************************************************************/

public class Step01_sec_array {

	public static void main(String[] args) {
		
		//2차배열 선언
		String[][] strArr = new String[4][3]; 
		
		//2차배열의 초기화 및 구조(방 생성방식)
		strArr[0][0] = "이름";	strArr[0][1] = "나이";	strArr[0][2] = "성별";
								//숫자를 문자타입으로 저장할 뿐, 이것은 문자입니다.
		strArr[1][0] = "김씨";	strArr[1][1] = "22";	strArr[1][2] = "남";
		strArr[2][0] = "박씨";	strArr[2][1] = "21";	strArr[2][2] = "남";
		strArr[3][0] = "최씨";	strArr[3][1] = "19";	strArr[3][2] = "여";
		
		//2차배열을 순서대로 출력하는 다중반복문
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				System.out.println(strArr[i][j]);
			}
			System.out.println("----");//하나의 로우가 모두 호출될때마다 구분자 삽입
		}
	}

}
