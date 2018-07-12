package exercise.ch1_ch6;

/****************************************************************
	
	@author Jeongryeol Lee 
	@date	2018.07.11
	@classGoal
		1.	제어문에는 조건문과 반복문이 있다.
		2.	라벨 : 제어문에 이름을 지정할 수 있다. (라벨이름:반복문) 26번문장 확인 
		3.	제어문은 break; continue;는 세트로 작동해야 무한반복을 방지할 수 있다.
		4.	break; 가장 가까운 제어문을 탈출한다
		5.	break 라벨이름; 라벨로 지정된 제어문을 탈출한다.
		6.	continue; 가장 가까운 제어문의 가장 끝으로가서 해당 제어문을 다시 반복하도록 한다.
		
 *****************************************************************/

public class Ex06_Loop_for {

	public static void main(String args[]){
	
		int i = 0;
		int j = 0;
		
		outer:
			for(i=1; i<3; i++){
				inner:
					for(j=1; j<3; j++) {
						if(j==2) {
							continue outer;
						//	break outer;
						//	continue inner;
						}
						System.out.println("Value are " + i + " " + j);
					}
			}
	
	}
	
}
