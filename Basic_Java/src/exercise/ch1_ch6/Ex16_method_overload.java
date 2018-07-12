package exercise.ch1_ch6;

/****************************************************************

	@author Jeongryeol Lee 
	@date	2018.07.12
	@classGoal
		����Ÿ�Ը��� ������ ���� �޼ҵ� �����ε尡 �� �� ���� ���� ??
		�ν��Ͻ� ������ �����Ͽ� Ŭ������ ��ü�� ����� ȣ���Ҷ�, �����ڰ� ���ÿ� ȣ��Ǵµ�
		�̶� �Ķ���Ͱ� �Ȱ��� �����ڰ� ����Ÿ�Ը� �ٸ����� 2���� �����ϰԵǸ� JVM���忡�� ����������.
		  
		Java���� ���� �̸��� �޼ҵ�� �����ڸ� ������ ���� �� ���� ��
		JVM�� �޼ҵ�� �����ڸ� ���� �ٸ��� �����ϴ� ������
		�޼ҵ� Ȥ�� �������� �̸��� �� �Ķ������ ����Ÿ�԰� ������� ���� �� �� �ִ�.
	
******************************************************************/

public class Ex16_method_overload {

	    public void setVar(int a, int b, float c) {}

	/*  Which two overload the setVar method ? (choose two) */
		
	    //a.Overload method
		private void setVar(int a, float c, int b) { }
	
		//b.���������ڸ� ����� ���� �޼ҵ��̹Ƿ� ������ ���� �߻�
	//	protected void setVar(int a, int b, float c) { }             
		
		//c.Overload method
		public int setVar(float c, int a, int b) {return a;}
	
		//d.�Ķ������ Ÿ�԰� ������ �����޼ҵ�� ��ġ�ϹǷ�, �����޼ҵ�� ���� ������ �ν���. �����Ͽ��� �߻�.
	//	public int setVar(int a, int b, float c) {return a;}
		
		//e.����Ÿ���ڸ��� final�� ������ �� ����, ����Ÿ�Ե� float���� �������� �ʾ���. �����Ͽ��� �߻�.
	//	protected final setVar(int a, int b, float c) {return c;}

}
