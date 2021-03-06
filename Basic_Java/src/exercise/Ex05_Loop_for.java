package exercise;

/****************************************************************
	
	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		1.	반복문 for 의 구성을 이해한다.
		2.	반복문에 이름을  부여하고 관리한다. (label)
		3.	반복문의 무한반복 방지코드가 필요한 이유를 이해한다.
		
******************************************************************

	<<for문 기본꼴>>
		for( 인수 초기화 ; 반복조건식 ; 증감연산식 ) {
			조건식이 참일때 수행할 수행문(body);
		}//만약 중괄호({})가 없을 경우, 가장 가까운 세미콜론(;)을 반복한다.
		
	<<for문의 반복실행순서>>
		1. 인수초기화
		2. 반복조건식 판별
		3. 참일때 수행문 반복
		4. 증감연산적용(기본적으로 i++과 같이 후위연산하기 때문)
		5. 조건식이 거짓으로 나올때까지 2~4반복
	
	<<반복문 실행시 주의사항>>
		각 반복문은 무한반복실행에 주의해야한다. (특히 반복조건식 반드시 확인)
		반복문은 중첩하여 실행할 수 있다. 
		[이름 : 반복문]과 같은 형태로 반복문에 이름을 지정할수 있다.		(41번줄)
		[break;]를 발견하면 가장 가까운 반복문을 탈출한다.
		[break label이름;]을 발견하면 이름에 해당하는 반복문을 탈출한다.	(45번줄)

	<<개선된 for문 기본꼴>>
		for( 타입 변수이름 : 자료구조 ) { //자료구조에는 배열,클래스객체, 컬렉션이 위치
			반복할 문장;
		}
		//자료구조에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장되고,
		//이 변수를 사용해서 실행부(body,{})에 있는 문장이 반복된다.

******************************************************************

	<<for문 예시>>
		아래 int 배열에 대하여
		2 가지 for문은 같은 결과를 출력한다.
		
		int[] arr = {10,20,30,40,50}
		
		    //기준 인수;인수와 배열길이 비교 ;증감연산자
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			// 담을 변수 : 자료구조 이름
		for( int tmp : arr ) {
			System.out.println(tmp);
		}
	
******************************************************************/

public class Ex05_Loop_for {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 5;
		tp : for( ; ; ){		//이경우 무한반복을 실행함. 왜? 조건식이 없기 때문에 멈출조건이 없음.
		       i++;
		       for( ; ; )		//중괄호가 없으므로 처음으로 보이는 세미콜론까지 반복하되
		        if( i>--j )		//if문이 포함되어있으므로, 참거짓조건을 확인할떄까지 반복하면서 전위연산자가 작동됨
		            break tp;	//이름이 부여된 반복문이 가장 외곽의 반복문이므로 즉시 전체 반복문을 탈출한다
		     }
		System.out.println("i :" + i + ", j :" + j );
		
	}
}
