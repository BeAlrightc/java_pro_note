package ShuZu;

public class XianSearch {

	public static void main(String[] args) {
		//新建立一个数组
		int[] arry =new  int[] {2,4,6,7,8,9};
		//设置所要查找的目标元素
		int dst =9;
		//设置目标元素的下标索引
		int index=-1;
		//遍历
		for(int i=0;i<=arry.length;i++) {
			if(arry[i] == dst){//找到与目标元素相匹配的元素				
				index=i;//记录索引值
				break;//既然找到了就跳出循环喽！
			}
		}
System.out.println("该目标所处的索引值为："+index);
System.out.println("请注意，他的索引值为5那么就是数组的第6个");
	}

}
