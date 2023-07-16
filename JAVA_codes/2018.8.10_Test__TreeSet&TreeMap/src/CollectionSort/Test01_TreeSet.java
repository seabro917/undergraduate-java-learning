package CollectionSort;

import java.util.Set;
import java.util.TreeSet;

public class Test01_TreeSet {
	

	public static void main(String[] args) {
	    //这里如果用TreeSet的空构造器那么就是默认你放在TreeSet里面的元素都已经实现了Comparable的接口，如果没有，则会报错。
		Set<Person> set = new TreeSet<Person>(
				new java.util.Comparator<Person>(){

					@Override
					public int compare(Person o1, Person o2) {
						return (int) (o1.getHandsomePoint()-o2.getHandsomePoint());
					}
					
				});
	
		Person p1 = new Person("海哥哥","男",1000);
		Person p2 = new Person("嘤嘤嘤","女",2000);
		Person p3 = new Person("嘻嘻嘻","女",1500);
		Person p4 = new Person("嘿嘿嘿","男",1800);

		//添加数据的时候就已经进行排序
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		Object[] arr = set.toArray();
		for(Object temp:arr)
		{
			System.out.println(temp);
		}
		
		//改变数据,可以发现还是根据添加数据时候的排序，并没有重新排序。
	    p1.setHandsomePoint(3000);
	    System.out.println("*******************");
	    
	    Object[] arr2 = set.toArray();
	    for(Object temp:arr)
	    {
	    	System.out.println(temp);
	    }
	    
	    /*   这里就是TreeSet可能存在的问题：若在数据添加到TreeSet之后，再进行改变数据，将其中两个元素的数据全部改成一样
	     *   那么塔恩两个不会被去重，但是Set要求里面的数据不可重复，解决方法是将指定元素的类的成员变量声明成final，不能
	     *   进行改变。
	    p1.setName("嘤嘤嘤");
	    p1.setHandsomePoint(2000);
	    p1.setSex("女");
	    System.out.println("*******************");         
	    
	    Object[] arr3 = set.toArray();
	    for(Object temp:arr)
	    {
	    	System.out.println(temp);
	    }
	    */
	    
	}

}
