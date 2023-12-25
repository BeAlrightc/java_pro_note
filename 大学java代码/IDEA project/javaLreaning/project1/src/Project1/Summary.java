package Project1;

public class Summary {
    /*
    Collection
         List(存取有序，有索引，可以重复)
          ArrayList
          底层是数组实现的，线程不安全，查找和修快（增删慢）
          LinkedList
          底层是链表实现的，线程不安全，增删比较快，查找修改比较慢
          Vector
          底层是数组实现的，线程是安全的，无论是增删改查都是慢的。
           如果查找和修改多,用ArrayList
           如果增和删多使用LinkedList
           如果都多用ArrayList
         Set(存取无序，无索引，不可以重复)

         HashSet
         底层是哈希算法实现的
             LinkedHashSet
             底层是链表实现的，但是也可以保证元素唯一，和hashSet原理一样
         TreeSet
         底层是二叉树算法实现的
         一般在开发的时候不需要对存储元素进行排序，所以开发中大多用HashSet，HashSet的效率比较高
         TreeSet在面试的时候比较多，问你有几种排序方式，和几种排序方式的区别
         Map
         HashMap
         底层是哈希算法（针对键）
            LinkedHashMap
            底层是哈希算法（针对键）
         TreeMap
         底层是二叉树算法（针对键）
         开发中用Hashmap比较多，除非要对键进行排序（用TreeSet比较好一点！）
     */
}
