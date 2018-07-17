package chapter03_Control_Statement.partA_Conditional_Statement;

import java.util.Random;

/****************************************************************

@author Jeongryeol Lee
@date	2018.07.17
@classGoal
	1. 조건문 switch는 중복으로 사용될 수 있다.
	2. 조건문을 탈출(중단)하는 break와 조건문에 이름을 다는 label(라벨)을 이해한다.

*****************************************************************

	<<break 예약어와 label(라벨)의 적용>>
	
	1. label(라벨)은 제어문에 이름을 부여하는 기능을 한다. 
	2. break는 제어문의 진행을 탈출(중단)한다.
	 	- break;만을 적용할 경우에 가장 가까운 제어문을 탈출한다.
	 	- break 라벨명;인 경우 해당 이름의 제어문을 탈출한다.
	
*****************************************************************/

public class Step05_switch {

	public static void main(String[] args) {
		
		String snack1 = "새우과자";
		String snack2 = "초코과자";
		String snack3 = "딸기과자";
		
		/*외부 switch문*/
		outter://라벨
		switch (snack1) {
			case "새우과자":
				System.out.println(snack1+"를 확인했습니다. [outter switch문]");
				/*내부 switch문*/
				inner://안쪽
				switch(snack2) {
					case "초코과자":
						System.out.println(snack2+"를 확인했습니다. [inner swtich문]");
					default :
						//break가 없으므로 case "초코과자"의 실행문 이후로 아래도 순차적으로 실행됨
						System.out.println("<알림>outter switch문까지 종료합니다.");
						break outter;//외부 switch문을 종료함
				}
			case "초코과자":
				System.out.println("이 문장은 실행되지 않습니다.");
			case "딸기과자":
				System.out.println("이 문장은 실행되지 않습니다.");
			default :
				System.out.println("이 문장은 실행되지 않습니다.");
		}
		//break outter; 이후 JVM이 수행할 다음 위치는 이곳
		System.out.println(snack3+"를 확인했습니다. [switch문 외부]");
		
	}
	
}
