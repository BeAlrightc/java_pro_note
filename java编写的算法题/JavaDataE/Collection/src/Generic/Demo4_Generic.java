package Generic;

public class Demo4_Generic {
	/*
	 * A:���ͽӿڸ���
	 * 		�ѷ��Ͷ����ڽӿ���
	 * B�������ʽ
	 * 		public interface �ӿ���<��������>
	 * C��������ʾ
	 * 		���ͽӿڵ�ʹ��
	 */

	public static void main(String[] args) {
		
	}

}
interface Inter<T>{//����һ�����ͽӿ�
	public void show(T t);//����һ�����ͷ���
}
/* class Demo implements Inter<String>{//(�Ƽ�����)����һ�����ͽӿ�ʵ����
	
	@Override
	public void show(String t) {//��д�������ͷ���
		System.out.println(t);
		
	}
	}*/
class Demo<T>implements Inter<T>{ //û�б�Ҫ��ʵ�ֽӿڵ�ʱ����Լ���ӷ���

	@Override
	public void show(T t) {
		System.out.println(t);
		
	}
	
}

