package bean;

public class Person {
	private String name;
	private int age;
	
	
	public Person() {
		super();
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
//	@Override
//	public int hashCode() {
//		return age;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("��ִ������");
//		Person p = (Person)obj;
//		return this.name.equals(p.name) && this.age ==p.age;
//		
//	}


	
////��hashcode��ֵ�������ظ�
//	@Override
//	public int hashCode() {
//		final int NUM = 38;
//		return name.hashCode() * NUM +age;
//	}

//���·�����ִ��˳��Ϊ����ִ��hashcode������ִ��equals��������hashcode��ֵΪһ����ʱ��Ż�ִ��equals����
	@Override
	public int hashCode() {//������hashcode��ֵ��һ��
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
/*
 * (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 * Ϊʲô��31��
 * 1.31��һ���������ܹ���һ����������
 * 2.31������Ȳ���Ҳ��С�����̫��ͻᳬ��int��ȡֵ��Χ����̫С�Ļ����п����ظ���
 * 3.31��������㣬2��5�η���1,2�����ƶ�5λ
 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)     //���õĶ���ʹ���Ķ�����ͬһ������
			return true;     //ֱ�ӷ���true
		if (obj == null)     //�������Ϊnull
			return false;    //����false
		if (getClass() != obj.getClass())  //�ж�����������ֽ����ļ��Ƿ���ͬһ���ֽ��루ȥ������ǿת�쳣��
			return false;           //�������ֱ�ӷ���false
		Person other = (Person) obj;  //����ת��
		if (age != other.age)        //���ö�������䲻���ڴ�����������
			return false;            //����false
		if (name == null) {        //���ö��������Ϊnull
			if (other.name != null) // ��������������Ϊnull
				return false;    //����false
		} else if (!name.equals(other.name)) //���ö�������������ڴ�����������
			return false;        //����false
		return true;           //����true
	}
	
	
	
}
