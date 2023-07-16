package MyCollection;

import java.util.Map;
/**
 * Map底层实现： 数组+链表
 * @author 海哥昨晚没吃饭
 *
 */
public class MyHashMap {
	private int size;
	 //这里我一开始还用了自己写的MyArrayList，把其中的元素设置为MyLinkedList，这样太麻烦了，还不如直接声明一个MyLinkedList
     //的数组。
	private MyLinkedList[] arr=new MyLinkedList[999]; 
	
	
	public MyHashMap()
	{
		
	}
//	如果出现了key的hashcode对999取余结果一样的情况，则在链表中追加一个新的node，node里面存放的是pair，即键值对。
	public void put(Pairs p) 
	{
		int hash = p.hashCode();
//	    Hashcode可能为0，这样的话如果不判断后面可能会报数组越界异常。
		hash = hash<0?-hash:hash;
		int a = (int)(hash)%999;
		if(arr[a]==null)
		{
			arr[a] = new MyLinkedList();
			arr[a].add(new Node(p));
			size++;
		}
		else 
		{
			for(int i=0;i<arr[a].size;i++)  // 遍历当前这个数组位置的链表 看看链表中是不是已经存在以这个key为键的键值对了
			{
				Pairs pairs = (Pairs)(arr[a].get(i));
				if(p.key.equals(pairs.key))
				{
					pairs.value = p.value;                      //处理键值重复问题
					return;                                     //如果出现重复，则重新覆盖值，并且停止这一次的put
				}
			}
			arr[a].add(new Node(p));                            //其他情况：没有重复，则在这个链表内新加一个节点
			size++;
		}
			
	}
	
	public Object get(Object key)
	{
		int a = (int)(key.hashCode())%999;
		if (arr[a]!=null) 
		{
			for(int i=0;i<arr[a].size;i++) //先找到对应的数组位置，再遍历当前数组位置上的链表，用equals方法判断key的值
			{
				Pairs p = (Pairs)(arr[a].get(i));
				if(p.key.equals(key))
					return p.value;
			}
		}
		return null;
	}

	public boolean containsKey(Object key)
	{
		int a = (int)(key.hashCode())%999;
		if(arr[a]!=null)
		{
			for(int i=0;i<arr[a].size;i++)
			{
				Pairs p = (Pairs)(arr[a].get(i));
				if(p.key.equals(key))
					return true;
			}
		}
		return false;
	}

	public void valueSet(Object key,Object value)
	{
		int a = (int)(key.hashCode())%999;
		if(this.arr[a]==null)
			System.err.println("指定的键值不存在！");
		else {
			for(int i=0;i<arr[a].size;i++)
			{
				Pairs p = (Pairs)(arr[a].get(i));
				if(p.key.equals(key))
				{
					p.value = value;
					return;
				}
			}
			System.err.println("指定的键值不存在！");       //有可能其他键值的hashcode和指定的键值hashcode一样，但是
		}                                                  //指定的键值其实不在map中。
	}
	
	public static void main(String[] args) {
		MyHashMap map = new MyHashMap();
		map.put(new Pairs("海", "全") );
		map.put(new Pairs("哥", "都") );
		map.put(new Pairs("昨晚", "是") );
		map.put(new Pairs("没", "我") );
		map.put(new Pairs("吃", "老") );
		map.put(new Pairs("饭", "婆") );
//		map.put(new Pairs("海", "嘤嘤嘤") );
//		System.out.println(map.arr[51].get(0)==null);
		map.valueSet("海", "papapa");
		System.out.println(map.get("海"));
	}
}
