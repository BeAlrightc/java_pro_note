package demo01;

public class MyQueue {

    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    //���
    public void add(int element) {
        //����һ���µ�����
        int[] newArr = new int[elements.length+1];
        //��ԭ�����е�Ԫ�ظ��Ƶ���������
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //����ӵ�Ԫ�ط�����������
        newArr[elements.length] = element;
        //�滻����
        elements = newArr;
    }

    //����
    public int poll() {
        //�������еĵ�0��Ԫ��ȡ����
        int element = elements[0];
        //����һ���µ�����
        int[] newArr = new int[elements.length - 1];
        //����ԭ�����е�Ԫ�ص���������
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i+1];
        }
        //�滻����
        elements = newArr;
        return element;
    }

    //�ж϶����Ƿ�Ϊ��
    public boolean isEmpty(){
        return elements.length == 0;
    }
}

