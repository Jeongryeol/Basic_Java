package chapter03_Control_Statement.partA_Conditional_Statement;

/****************************************************************

	@author Jeongryeol Lee
	@date	2018.07.17
	@classGoal
	1. 조건문 if는 중복으로 사용될 수 있다.
	2. 조건문을 탈출(중단)하는 break와 조건문에 이름을 다는 label(라벨)을 이해한다.
	
****************************************************************
		
	<<break 예약어와 label(라벨)의 적용>>
	
	1. label(라벨)은 제어문에 이름을 부여하는 기능을 한다. 
	2. break로 [가장 가까운/지정한] 반복문을 탈출할 수 있습니다.
		- break;만을 적용할 경우에 가장 가까운 제어문을 탈출한다.
		- break 라벨명;인 경우 해당 이름의 제어문을 탈출한다.
	
*****************************************************************/

public class Step04_if_break {

	public static void main(String[] args) {
		//같은 타입은 한번에 초기화 할 수 있다.
		String himName = "철수", herName = "영희";
		int himAge = 22, herAge = 20;
		
		/*외부 if문*/
		outter://라벨
		if( himAge > herAge ) {	// 22 > 20
			System.out.printf("%s가 %s보다 나이가 %d살 더 많다.\n",himName,herName,himAge-herAge);
			inner://라벨
			/*중첩 내부if문*/
			if( --himAge == ++ herAge) {// 21 == 21
				System.out.println("1년후..");
				System.out.println("2년후..");
				/*중첩 내부if문 내부의 if문*/
				if(himName=="철수")
					break inner;//inner if문을 중단함
				System.out.println("inner if문이 중단되었기 때문에 아래는 3문장은 실행되지 않습니다.");
				System.out.println("3년후..");
				System.out.println("4년후..");
			}
			System.out.println("이 문장이 실행됩니다.");
		}
		System.out.println("이 문장도 실행됩니다.");
	}
	
}
