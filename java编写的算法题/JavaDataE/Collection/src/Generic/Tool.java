package Generic;

public class Tool<Q> {
	private Q q;
	
	public Q getObj() {
		return q;
	}
	public void setObj(Q q) {
		this.q = q;
	}
	public<T> void show(T t) {//���������������ķ���һ�£������һ����Ҫ�ڷ���������
		System.out.println(t);
	}
	public static<Q> void print(Q q) {//��̬�������������Լ��ķ�����Ϊ��̬�������ڷ�����
		
	}
}
