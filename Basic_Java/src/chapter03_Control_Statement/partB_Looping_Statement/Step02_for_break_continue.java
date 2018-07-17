package chapter03_Control_Statement.partB_Looping_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
	1. 제어문 중 반복문 for문은 중첩될 수 있습니다.
	2. 반복문의 무한반복을 주의합니다.
	3. 제어문에 label(라벨)을 달 수 있습니다.
	
	4. break로 [가장 가까운/지정한] 제어문을 탈출할 수 있습니다.
		- break;만을 적용할 경우에 가장 가까운 제어문을 탈출한다.
 		- break 라벨명;인 경우 해당 이름의 제어문을 탈출한다.
	
	5. continue로 [가장 가까운/지정한] 반복문의 제일 끝으로 이동할 수 있습니다.
		- continue;만을 적용할 경우에 가장 가까운 반복문의 끝으로 이동한다.
 		- continue 라벨명;인 경우 해당 이름의 반복문의 끝으로 이동한다.
 		- 이동한 뒤 제어문의 조건식의 참/거짓을 판별하며 반복여부가 결정됨.
 		- 즉, break문과 달리 반복문에서만 사용가능하고, 반복문을 벗어나지 않음
	
*****************************************************************/

public class Step02_for_break_continue {

	public static void main(String[] args) {
		
		int a = 0;
		/*외부 반복문*/
		outter:
		for(;;) {//무한반복
			/*내부 반복문*/
			inner:
			for(;;) {//무한반복
				System.out.println(a);
				a++;
				if(a==9) break outter;
			}
		}
		
		System.out.println("==[심화예제]==");
		/*코드출처 :: 자바의 정석 3rd Edition [남궁 성 저]*/
		Loop1 : for(int i=2;i<=9;i++) {
			for (int j=1;j<9;j++) {
				if(j==5)
			/*아래주석을 하나씩 제거하면서 출력된 결과를 확인하시오.*/	
			//	break Loop1;
			//	break;
			//	continue;
			//	continue Loop1;
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		
	}
	
}
