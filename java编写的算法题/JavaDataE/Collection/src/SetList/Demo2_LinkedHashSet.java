package SetList;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {
	/*
	 * LinkedHashSet的底层是链表实现的，
	 * 且是Set集合中唯一一个能保证怎么存就怎么取的集合对象
	 * 因为是HashSet的子类，所以也是保证元素唯一的，与HashSet的原理一致
	 */

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		System.out.println(lhs);

	}

}
