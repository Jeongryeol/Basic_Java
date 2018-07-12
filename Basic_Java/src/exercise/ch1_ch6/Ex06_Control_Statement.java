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

public class Ex06_Control_Statement {

	public static void main(String[] args){
		
		int i=0, j=5;
		
	tp1://반복문을 지정한 라벨
	    for(;;i++)//초기값과 조건식이 없으므로 무한루프       
	       for(;;--j)//초기값과 조건식이 없으므로 무한루프
	           if(i>j) break tp1;
	    System.out.println("i = "+i+"j = "+j);
	    
	    i=0; j=5;
	tp2:
	    for(;;i++) {       
	       for(;;--j) {
	           if(i>j) break tp2;
	       }
	    }
		System.out.println("상기와 동일 ~ i = "+i+"j = "+j);
 
	}
	
}
