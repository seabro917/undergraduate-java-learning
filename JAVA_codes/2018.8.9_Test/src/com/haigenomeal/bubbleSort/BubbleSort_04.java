package com.haigenomeal.bubbleSort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 实现将list容器里面的元素排序。
 * @author 海哥昨晚没吃饭
 *
 */
public class BubbleSort_04 {
//	这里是要声明传入的泛型T必须是实现了Comparable接口的类，否则无法调用compareTo方法进行比较（？）
	public static <T extends Comparable<T>>void bubblesort_04(T[] arr) 
	{
		boolean sorted = true;
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1-i;j++)   
			{
				sorted = true;
				if(arr[j].compareTo(arr[j+1])>0)
				{
					T temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false;
				}
			} // 当前趟结束
			if (sorted == true)
			{
				break;
			}
		}
	}
	
	public static void bubblesort_05(Object[] arr) 
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1-i;j++)   
			{
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0)  //这里为什么一定要强转成Comparable？
				{                                               //好像是因为Object类根本没有实现Comparable接口？
					Object temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void bubblesort_06(List<T> list) 
	{
		//第一步：转成数组
		Object[] array = list.toArray();
		bubblesort_05(array);
		//第二步：改变容器中对应的值
		for(int i=0;i<array.length;i++)
		{
			list.set(i, (T) array[i]);
		}
	}
	
	
	
	public static <T> void print(T[] arr)
	{
		for(T temp:arr)
		{
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("papapa"));
		list.add(new Student("haigege"));
		list.add(new Student("haigeGe"));
		list.add(new Student("haigeg"));
		list.add(new Student("hAigege"));
		
		bubblesort_06(list);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
	}

}
