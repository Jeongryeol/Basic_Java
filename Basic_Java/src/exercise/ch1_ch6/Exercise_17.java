package exercise.ch1_ch6;

/* ���ڿ��� ������ �Բ� �����ϸ鼭 ȿ�������� �۾��Ҷ���,
 * StringBuffer, StringBuilder Ŭ������ ����ؾ��Ѵ�.
 * �׷��� ������ ����ؼ� �����ʴ� ���� �׿��� */

public class Exercise_17 {

	public static void main(String[] args) {
		
		String s="Hello";
		s=s.toLowerCase() + " there";
		System.out.println(s + " my friend");
		
		//���� �Ʒ��� ���ٸ�?
		s.toLowerCase();//String�� �ݵ�� ���Կ����ڸ� ����ؾ߸� �������ڿ��� �ʱ�ȭ�� �� �ִ�.
		System.out.println(s + " my friend (������ ���)");//�� ��쿣, toLowerCase�޼ҵ尡 ������� �ʾ���. 
		
	}

}
