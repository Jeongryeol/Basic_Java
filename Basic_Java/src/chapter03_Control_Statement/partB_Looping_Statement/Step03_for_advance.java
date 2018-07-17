package chapter03_Control_Statement.partB_Looping_Statement;

/****************************************************************

@author Jeongryeol Lee
@date	2018.07.17
@classGoal
	1. 개선된 for문에 대한 학습은 배열이후를 추천합니다.
		(배열 및 자료구조, 컬렉션프레임웍 에 적용가능)
	2. 자료의 집합을 개별로 담아내고 개별자료에 대해 반복할 구문을 블럭에 입력합니다.
	
*****************************************************************

	<<개선된 for문의 기본형태>>

		for(타입 변수명 : 배열 또는 컬렉션) {
			반복 실행한 문장
		}

*****************************************************************/

public class Step03_for_advance {

	public static void main(String[] args) {
		
		int[] arrs = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		   //타입 변수명 : 배열
		for(int value : arrs) {
		//	System.out.println(arrs);//배열의 주소번지를 출력
			System.out.println(value);//주소번지로부터 꺼내진 값을 출력
		}
	
	}
	
}
