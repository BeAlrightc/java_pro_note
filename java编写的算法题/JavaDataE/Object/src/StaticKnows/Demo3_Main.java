package StaticKnows;

public class Demo3_Main {

	public static void main(String[] args) {
/*
 * public:��jvm���ã�����Ȩ��Ҫ�㹻��
 * static:��jvm���ã�����Ҫ��������ֱ������.���ü���
 * void:��jvm���ã�����Ҫ���κεķ���ֵ
 * main:ֻ������д���ܱ�jvmʶ��,main���ǹؼ���
 * String[] args :��ǰ���������ܼ���¼��ģ�argsֻ��һ������������Ҳ��Ψһ���Ըĵ�
 */
		System.out.println(args.length);
		for(int i =0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}

}
