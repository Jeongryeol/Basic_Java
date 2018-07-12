package exercise.ch1_ch6;

/****************************************************************
	
	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		1.	조건문 switch에 대해 이해한다.
		2.	조건문 if문과의 차이를 이해한다.
		3.	조건문의 실행부(body,{})가 없으면
			가장 먼저 만나는 세미콜론(;)까지의 문장을 반복한다.
		
******************************************************************

	<<switch문 기본꼴>>
		switch(변수){	//모든 원시형 변수 및 String을 받을 수 있음
			case 값1:
				값1일때 수행할 수행문;
				break;	//switch에서 반드시 지켜야하는 기본꼴
						case에 해당하는 식을 찾아서 계속 아래로 내려가면서 수행하므로,
						해당 값 경우로 수행문이  끝나면 break;로 탈출시킨다
			case 값2:
				값2일때 수행할 수행문;
				break;
			default:
				그외 값일때 수행할 수행문;
		}
	
	<<if문의 기본꼴>>
		if(조건식1){	//조건식의 리턴값은 boolean이다.
			반복조건식이 참일때 수행할 문장
		}
		else if(조건식2){
			if문에 해당하는 조건이 거짓이어서 블럭을 건너뛰어 내려왔고
			그때 만난 else if의 조건식이 참일때 수행할 문장
		}
		else{
			모든 조건식들이 거짓일때 수행할 문장
		}
		
	<<차이점>>
		1. 조건식의 판별기준
			switch문 : 모든 원시타입 및  String타입 변수의 값에 대한 조건판별
			if문 : boolean값만 비교 (true/false)
		
		2. 수행문의 작동패턴
			switch문 : 해당 값의 경우를 만나서 break;를 만나기 전까지 모든 수행문을 수행함
			it문 : 조건식이 참일때만 해당 문장을 수행하므로,
				if문의 조건이 거짓일때
				else if문의 조건판별하러 수행문을 넘기고, 이것도 거짓이면
				else 문을 실행하러 간다.
				
		3. 생략가능
			switch문에서..	"default:"가 없는 경우가 있음
			if문에서..		"else if문" 또는 "else문"이 없는 경우도 있음
		
******************************************************************/

public class Ex08_Switch {

	public static void main(String[] args) {

		int i = 1;
		int j = 0;
		switch(i){
		  case 2 : j+=6;
		  case 4 : j+=1;
		  default : j+=2;
		  //조건식인 i의 값이 대응하는 case가 없으므로 default부터 시작
		  case 0 : j+=4;//그 다음 아래 문장 실행
		}
		//point x
		//point x 이부분에서의 j값은?
		System.out.println(j);//정답은 j값 6으로 출력
		
		System.out.println("\n==========================================\n");
		
		String hi 	= "안녕";
		String bye	= "잘가";
		switch(hi) {
			case "안녕":
				System.out.println("String타입도 출력됩니다.");
			case "잘가":
				System.out.println("잘가 라는 값이 아니지만, break가 없으니 이것도 출력되겠죠?");
			default :
				System.out.println("switch 판별 경우값에 해당하는 조건문은 콜론(:)으로 정의합니다.");
		}
		
	}

}
