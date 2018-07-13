package exercise;

/****************************************************************

	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		1.	�ٸ� staticŸ���� ���� �־, main�޼ҵ尡 ���� ���� ����ȴ�.
	    	���� ����Ǿ staticŸ���� ��� �޸𸮿� �ε��Ǿ� �ֱ� ������
	    	���� �ν��Ͻ�ȭ �� �ʿ���� ��𿡼��� ����� �� �ְ� ���� �����ȴ�.
	    	
	    2.	���������� ��������� �����ϰ� �� ���̿� ���� ������������ ���࿩�θ� �Ǵ��� �� �ִ�.
	
******************************************************************/

public class Ex10_static_operator {

    private static int j = 0;
    
    public static boolean methodB(int k){
        j += k;
        return true;
    }
    
    public static void methodA(int i){
        boolean b;				 //���������� ���� �� ����
        b = i < 10 | methodB(4); //���������� �ʱ�ȭ��
        	//[��] A|B�� A�� ���̴��� B�� ������ ���� ������.
        	//��, methodB(4);ȣ���� �����
        b = i < 10 || methodB(4);//���������� �� �ʱ�ȭ�� / ��
        	//[��] A||B�� A�� ���̸� B�� ������ ���� ������ �ʴ´�.
        	//��, methodB(4);ȣ���� ������� ����
    }

    public static void main(String[] args){
        methodA(0);
        System.out.println(j);
    }

}
