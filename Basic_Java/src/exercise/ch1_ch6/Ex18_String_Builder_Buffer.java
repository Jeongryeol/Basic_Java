package exercise.ch1_ch6;

/****************************************************************
	
	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		���ڿ��� ������ �Բ� �����ϸ鼭 ȿ�������� �۾��Ҷ���,
 		StringBuffer, StringBuilder Ŭ������ ����Ѵ�.
 		
 		String�� ���ڸ� �� ����� �����ϰ�, += �����ڷ� ����� ���ڸ� �ٿ������� ���������,
 		���Կ����ڷ� �ʱ�ȭ �������� ������ ����ؼ� ��ü�� �����Ͽ� ������ �����ϴ�
 		
 		StringBuilder�� StringBufferŬ������ ������ ������ �ڸ������ �����ϰ�
 		appens()�޼���� �߰��ϸ鼭 ������ �����ϱ� ������ �޸𸮰����� ȿ�����̴�.
		
 *****************************************************************/

public class Ex18_String_Builder_Buffer {

	public static void main(String[] args) {
		
		String s="Hello";
		s=s.toLowerCase() + " there";
		System.out.println(s + " my friend");
		
		//���� �Ʒ��� ���ٸ�?
		s.toLowerCase();//String�� �ݵ�� ���Կ����ڸ� ����ؾ߸� �������ڿ��� �ʱ�ȭ�� �� �ִ�.
		System.out.println(s + " my friend (������ ���)");//�� ��쿣, toLowerCase�޼ҵ尡 ������� �ʾ���. 
		
	}

}
