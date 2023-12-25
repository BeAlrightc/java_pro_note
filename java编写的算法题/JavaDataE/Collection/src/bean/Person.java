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
//		System.out.println("我执行了吗");
//		Person p = (Person)obj;
//		return this.name.equals(p.name) && this.age ==p.age;
//		
//	}


	
////让hashcode的值尽量不重复
//	@Override
//	public int hashCode() {
//		final int NUM = 38;
//		return name.hashCode() * NUM +age;
//	}

//以下方法的执行顺序为：先执行hashcode方法再执行equals方法，当hashcode的值为一样的时候才会执行equals方法
	@Override
	public int hashCode() {//尽量是hashcode的值不一样
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
/*
 * (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 * 为什么是31？
 * 1.31是一个质数（能够被一整除的数）
 * 2.31这个数既不大也不小（如果太大就会超过int的取值范围）（太小的话就有可能重复）
 * 3.31这个数好算，2的5次方减1,2向左移动5位
 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)     //调用的对象和传入的对象是同一个对象
			return true;     //直接返回true
		if (obj == null)     //传入对象为null
			return false;    //返回false
		if (getClass() != obj.getClass())  //判断两个对象的字节码文件是否是同一个字节码（去除类型强转异常）
			return false;           //如果不是直接返回false
		Person other = (Person) obj;  //向下转型
		if (age != other.age)        //调用对象的年龄不等于传入对象的年龄
			return false;            //返回false
		if (name == null) {        //调用对象的姓名为null
			if (other.name != null) // 传入对象的姓名不为null
				return false;    //返回false
		} else if (!name.equals(other.name)) //调用对象的姓名不等于传入对象的姓名
			return false;        //返回false
		return true;           //返回true
	}
	
	
	
}
